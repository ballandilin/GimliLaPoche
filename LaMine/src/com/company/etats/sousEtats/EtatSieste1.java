package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Lit;

/**
 * Classe qui représente l'état EtatSieste1 qui hérite de Lit
 */
public class EtatSieste1 extends Lit {

    /**
     * Constructeur de EtatSieste1
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
    public EtatSieste1(float tauxAlcool) {
        super(tauxAlcool);
    }

    /**
     * Fonction qui permet de changer d'état
     * @return le nouvel état EtatSieste2
     */
    @Override
    public Etat transition() {
        Etat etat = new EtatSieste2(super.getTauxAlcool());

        //System.out.println("Taux Alcool : " + super.getTauxAlcool());

        return etat;
    }

    /**
     * Fonction qui met le taux d'alcool à 0
     */
    @Override
    public void action() {
        //System.out.println("Etat Sieste 1");

        super.setTauxAlcool(0);
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
