package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Lit;

/**
 * Classe qui représente l'état EtatSieste2 qui hérite de Lit
 */
public class EtatSieste2 extends Lit {
    /**
     * Constructeur de EtatSieste2
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
    public EtatSieste2(float tauxAlcool) {
        super(tauxAlcool);
    }

    /**
     * Fonction qui permet de changer d'état
     * @return le nouvel état EtatSieste3
     */
    @Override
    public Etat transition() {
        Etat etat = new EtatSieste3(super.getTauxAlcool());

        //System.out.println("Taux Alcool : " + super.getTauxAlcool());
        return etat;
    }


    @Override
    public void action() {
        //System.out.println("Etat Sieste 2");

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
