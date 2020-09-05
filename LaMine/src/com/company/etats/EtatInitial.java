package com.company.etats;

public class EtatInitial extends Etat{

    public EtatInitial(float tauxAlcool) {
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
        System.out.println("Etat Initial");

    }
}
