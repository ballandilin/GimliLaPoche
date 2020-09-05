package com.company.etats;

public class EtatSieste2 extends Etat{
    public EtatSieste2(float tauxAlcool) {
        super(tauxAlcool);
    }

    @Override
    public Etat transition() {
        Etat etat = new EtatSieste3(super.getTauxAlcool());

        System.out.println("Taux Alcool : " + super.getTauxAlcool());
        return etat;
    }

    @Override
    public void action() {
        System.out.println("Etat Sieste 2");

    }
}
