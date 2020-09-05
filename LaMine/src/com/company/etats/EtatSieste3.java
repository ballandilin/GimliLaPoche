package com.company.etats;

public class EtatSieste3 extends Etat{
    public EtatSieste3(float tauxAlcool) {
        super(tauxAlcool);
    }

    @Override
    public Etat transition() {
        Etat etat = new EtatTravail(super.getTauxAlcool());

        System.out.println("Taux Alcool : " + super.getTauxAlcool());

        return etat;
    }

    @Override
    public void action() {
        System.out.println("Etat Sieste 3");


    }

    @Override
    public String getNomEtat() {
        return "EtatSieste";
    }
}
