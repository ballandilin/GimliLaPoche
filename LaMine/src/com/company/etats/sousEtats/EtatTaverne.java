package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Taverne;

import java.util.Random;

public class EtatTaverne extends Taverne {
    public EtatTaverne(float tauxAlcool) {
        super(tauxAlcool);
    }

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

    @Override
    public String getNomEtat() {
        return "EtatTaverne";
    }
}
