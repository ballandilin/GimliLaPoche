package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Lit;

public class EtatSieste2 extends Lit {
    public EtatSieste2(float tauxAlcool) {
        super(tauxAlcool);
    }

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

    @Override
    public String getNomEtat() {
        return "EtatSieste";
    }
}
