package com.company.etats.sousEtats;

import com.company.etats.Etat;
import com.company.etats.Lit;

public class EtatSieste1 extends Lit {
    public EtatSieste1(float tauxAlcool) {
        super(tauxAlcool);
    }

    @Override
    public Etat transition() {
        Etat etat = new EtatSieste2(super.getTauxAlcool());

        System.out.println("Taux Alcool : " + super.getTauxAlcool());

        return etat;
    }

    @Override
    public void action() {
        System.out.println("Etat Sieste 1");

        super.setTauxAlcool(0);
    }

    @Override
    public String getNomEtat() {
        return "EtatSieste";
    }
}
