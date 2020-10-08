package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Mine;

/**
 * Classe qui représente l'état Forgeron qui hérite de Mine
 */
public class EtatForgeron extends Mine {

    /**
     * Constructeur de EtatForgeron
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
    public EtatForgeron(float tauxAlcool) {
        super(tauxAlcool);
    }

    /**
     * Fonction qui permet de changer d'état en fonction d'un nombre aléatoire x, si x = 1 alors EtatTaverne sinon EtatTravail
     * @return le nouvel état
     */
    @Override
    public Etat transition() {
        Etat etat;
        int reparer = (int) Math.random()*3 + 1;

        if (reparer == 1){
            etat = new EtatTaverne(super.getTauxAlcool());
        }
        else{
            etat = new EtatTravail(super.getTauxAlcool());
        }
        //System.out.println("Etat Forgeron");
        //System.out.println("Taux Alcool : " + super.getTauxAlcool());
        return etat;
    }

    /**
     * Fonction qui enlève 0.1g d'alcool à Gimli
     */
    @Override
    public void action() {
        //System.out.println("Le pioche est réparée");
        if (super.getTauxAlcool() >= 0.10){
            super.setTauxAlcool((float) (super.getTauxAlcool() - 0.1));
        }
    }

    /**
     * Fonction qui retourne le nom de l'état
     * @return le nom de l'état
     */
    @Override
    public String getNomEtat() {
        return "EtatForgeron";
    }
}
