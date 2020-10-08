package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Mine;

import java.util.Random;

/**
 * Classe qui représente l'état EtatTravail qui hérite de Mine
 */
public class EtatTravail extends Mine {

    /**
     * Constructeur de EtatTravail
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
    public EtatTravail(float tauxAlcool) {
        super(tauxAlcool);
    }

    /**
     * Fonction qui permet de changer d'état, si il casse sa pioche EtatForgeron sinon EtatPause
     * @return le nouvel état
     */
    @Override
    public Etat transition() {
        Etat etat;

        Random random = new Random();
        int cassage = random.nextInt(99)+1;

        float tauxCassage = 15;

        if (super.getTauxAlcool() > 0){
            tauxCassage += tauxCassage * super.getTauxAlcool() * 8 /100;
        }

        if (cassage <= tauxCassage){
           etat = new EtatForgeron(super.getTauxAlcool());
        }
        else{
            etat = new EtatPause(super.getTauxAlcool());
        }

        //System.out.println("Taux Alcool : " + super.getTauxAlcool());


        return etat;
    }

    @Override
    public void action() {
        //System.out.println("Etat Travail");

        if(super.getTauxAlcool() >= 0.15){
            super.setTauxAlcool((float) (super.getTauxAlcool() - 0.15));
        }
    }

    @Override
    public String getNomEtat() {
        return "EtatTravail";
    }
}
