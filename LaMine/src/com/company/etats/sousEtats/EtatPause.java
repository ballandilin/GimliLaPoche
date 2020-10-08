package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Mine;

/**
 * Classe qui représente l'état EtatPause qui hérite de Mine
 */
public class EtatPause extends Mine {

    /**
     * Constructeur de EtatPause
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
    public EtatPause(float tauxAlcool) {
        super(tauxAlcool);
    }

    /**
     * Fonction qui permet de changer d'état, EtatSieste1 si Gimli à plus de 8g sinon EtatTravail
     * @return le nouvel état
     */
    @Override
    public Etat transition() {
        Etat etat;
        if (super.getTauxAlcool() > 8){
            etat = new EtatSieste1(super.getTauxAlcool());
        }
        else{
            etat = new EtatTravail(super.getTauxAlcool());
        }

        //System.out.println("Taux Alcool : " + super.getTauxAlcool());

        return etat;
    }

    /**
     * Fonction qui enlève 0.1g d'alcool à Gimli
     */
    @Override
    public void action() {
        //System.out.println("Etat Pause");
        if (super.getTauxAlcool() >= 0.10){
            super.setTauxAlcool((float) (super.getTauxAlcool() - 0.10));
        }

        super.setTauxAlcool((float) (super.getTauxAlcool() + super.getTauxAlcoolBiere()));

    }

    /**
     * Fonction qui retourne le nom de l'état
     * @return le nom de l'état
     */
    @Override
    public String getNomEtat() {
        return "EtatPause";
    }
}
