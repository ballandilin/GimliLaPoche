package com.company.etats;


/**
 * Classe mère des Etats pour l'automate
 * @author Benjamin Milhet
 */
public abstract class Etat {
    private float tauxAlcool;
    private float tauxAlcoolBiere = (float) (28/(102 * 0.7));


    /**
     * Constructeur de Etat
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
    public Etat(float tauxAlcool){
        this.tauxAlcool = tauxAlcool;
    }

    /**
     * Getter qui retourne le taux d'alcool de Gimli
     * @return l'attribut tauxAlcool
     */
    public float getTauxAlcool() {
        return tauxAlcool;
    }

    /**
     * Getter qui retourne le taux d'alcool d'une bière
     * @return l'attribut tauxAlcoolBiere
     */
    public float getTauxAlcoolBiere() {
        return tauxAlcoolBiere;
    }

    /**
     * Setter qui modifie l'attribue tauxAlcool
     * @param tauxAlcool remplace l'attribut tauxAlcool
     */
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

    public abstract String getNomEtat();
    public abstract TypeEtat getNomEtatTransition();

}

