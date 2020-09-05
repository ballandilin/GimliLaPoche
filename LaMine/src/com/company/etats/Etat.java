package com.company.etats;


/**
 * Classe mère des Etats pour l'automate
 * @author Benjamin Milhet
 */
public abstract class Etat {
    private float tauxAlcool;
    private float tauxAlcoolBiere = (float) (28/(102 * 0.7));


    public Etat(float tauxAlcool){
        this.tauxAlcool = tauxAlcool;
    }

    public float getTauxAlcool() {
        return tauxAlcool;
    }

    public float getTauxAlcoolBiere() {
        return tauxAlcoolBiere;
    }

    public void setTauxAlcool(float tauxAlcool) {
        this.tauxAlcool = tauxAlcool;
    }

    /**
     * Permet de passer d'un état a un autre
     * @return le nouvel état
     */
    public abstract Etat transition();

    /**
     * Réalise l'action de l'état en cours
     */
    public abstract void action();
}

