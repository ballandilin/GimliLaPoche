package com.company.etats;

public class EtatForgeron extends Mine{
    public EtatForgeron(float tauxAlcool) {
        super(tauxAlcool);
    }

    @Override
    public Etat transition() {
        Etat etat;
        int reparer = (int) Math.random()*3 + 1;

        if (reparer == 1){
            etat = new EtatTaverne(super.getTauxAlcool());
        }
        else{
            etat = new EtatTravail(super.getTauxAlcool());
        }
        System.out.println("Etat Forgeron");
        System.out.println("Taux Alcool : " + super.getTauxAlcool());
        return etat;
    }

    @Override
    public void action() {
        System.out.println("Le pioche est réparée");
        if (super.getTauxAlcool() >= 0.10){
            super.setTauxAlcool((float) (super.getTauxAlcool() - 0.1));
        }
    }

    @Override
    public String getNomEtat() {
        return "EtatForgeron";
    }
}
