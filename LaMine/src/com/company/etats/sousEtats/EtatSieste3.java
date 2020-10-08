package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Lit;

/**
 * Classe qui représente l'état EtatSieste3 qui hérite de Lit
 */
public class EtatSieste3 extends Lit {
    /**
     * Constructeur de EtatSieste3
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
    public EtatSieste3(float tauxAlcool) {
        super(tauxAlcool);
    }

    /**
     * Fonction qui permet de changer d'état
     * @return le nouvel état EtatTravail
     */
    @Override
    public Etat transition() {
        Etat etat = new EtatTravail(super.getTauxAlcool());

        //System.out.println("Taux Alcool : " + super.getTauxAlcool());

        return etat;
    }


    @Override
    public void action() {
        //System.out.println("Etat Sieste 3");
    }

    /**
     * Fonction qui retourne le nom de l'état
     * @return le nom de l'état
     */
    @Override
    public String getNomEtat() {
        return "EtatSieste";
    }
}
