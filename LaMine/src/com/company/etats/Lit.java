package com.company.etats;

/**
 * Classe qui représente l'état Lit qui hérite de Etat
 */
public class Lit extends Etat{
    /**
     * Constructeur de Lit
     * @param tauxAlcool qui initialise l'attribut tauxAlcool
     */
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

    /**
     * Fonction qui retourne le type de l'état
     * @return TypeEtat.Lit
     */
    @Override
    public TypeEtat getNomEtatTransition() {
        return TypeEtat.Lit;
    }
}
