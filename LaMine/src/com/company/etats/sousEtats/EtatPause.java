package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Mine;

public class EtatPause extends Mine {
    public EtatPause(float tauxAlcool) {
        super(tauxAlcool);
    }

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

    @Override
    public void action() {
        //System.out.println("Etat Pause");
        if (super.getTauxAlcool() >= 0.10){
            super.setTauxAlcool((float) (super.getTauxAlcool() - 0.10));
        }

        super.setTauxAlcool((float) (super.getTauxAlcool() + super.getTauxAlcoolBiere()));




    }

    @Override
    public String getNomEtat() {
        return "EtatPause";
    }
}
