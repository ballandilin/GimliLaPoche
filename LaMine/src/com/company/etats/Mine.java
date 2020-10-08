package com.company.etats;

/**
 * Classe qui représente l'état Mine qui hérite de Etat
 */
public class Mine extends Etat{

    /**
     * Constructeur de Mine
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
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

    /**
     * Fonction qui retourne le type de l'état
     * @return TypeEtat.Mine
     */
    @Override
    public TypeEtat getNomEtatTransition() {
        return TypeEtat.Mine;
    }
}
