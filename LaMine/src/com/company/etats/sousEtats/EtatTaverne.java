package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Taverne;

import java.util.Random;

/**
 * Classe qui représente l'état EtatTaverne qui hérite de Taverne
 */
public class EtatTaverne extends Taverne {

    /**
     * Constructeur de EtatTaverne
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
    public EtatTaverne(float tauxAlcool) {
        super(tauxAlcool);
    }

    /**
     * Fonction qui permet de changer d'état en fonction d'un nombre aléatoire et qui augmente en fonction du taux d'alcool
     * @return le nouvel état
     */
    @Override
    public Etat transition() {
        Etat etat;

        Random random = new Random();
        int bagarre = random.nextInt(99)+1;
        float tauxBagarre = 5;

        if (super.getTauxAlcool() > 0){
            tauxBagarre += tauxBagarre * super.getTauxAlcool() * 15 /100;
        }

        if (super.getTauxAlcool() > 8){
            etat = new EtatSieste1(super.getTauxAlcool());
        }
        else if (bagarre <= tauxBagarre){
            etat = new EtatTravail(super.getTauxAlcool());
        }
        else{
            etat = new EtatTaverne(super.getTauxAlcool());
        }


        //System.out.println("Taux Alcool : " + super.getTauxAlcool());

        return etat;
    }

    /**
     * Fonction qui enlève 0.1g d'alcool à Gimli et lui augmente sont taux d'alcool de 3 bières
     */
    @Override
    public void action() {
        //System.out.println("Etat Taverne");

        if (super.getTauxAlcool() >= 0.10){
            super.setTauxAlcool((float) (super.getTauxAlcool() - 0.1));
        }

        for (int i = 0 ; i < 3 ; i++){
            super.setTauxAlcool((float) (super.getTauxAlcool() + super.getTauxAlcoolBiere()));


        }


    }

    /**
     * Fonction qui retourne le nom de l'état
     * @return le nom de l'état
     */
    @Override
    public String getNomEtat() {
        return "EtatTaverne";
    }
}
