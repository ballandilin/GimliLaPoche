package com.company.etats;

/**
 * Classe qui représente l'état Taverne qui hérite de Etat
 */
public class Taverne extends Etat {

    /**
     * Constructeur de Taverne
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
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

    /**
     * Fonction qui retourne le type de l'état
     * @return TypeEtat.Taverne
     */
    @Override
    public TypeEtat getNomEtatTransition() {
        return TypeEtat.Taverne;
    }
}
