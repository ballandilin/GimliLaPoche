package com.company.etats;

public class Mine extends Etat{
    public Mine(float tauxAlcool) {
        super(tauxAlcool);
    }

    @Override
    public Etat transition() {
        return null;
    }

    @Override
    public void action() {

    }

    @Override
    public String getNomEtat() {
        return null;
    }
}
