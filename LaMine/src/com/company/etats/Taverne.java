package com.company.etats;

public class Taverne extends Etat {
    public Taverne(float tauxAlcool) {
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
