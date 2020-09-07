package com.company.etats;

public class Lit extends Etat{
    public Lit(float tauxAlcool) {
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

    @Override
    public TypeEtat getNomEtatTransition() {
        return TypeEtat.Lit;
    }
}
