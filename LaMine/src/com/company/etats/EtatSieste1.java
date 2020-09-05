package com.company.etats;

public class EtatSieste1 extends Etat{
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
