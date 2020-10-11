package com.company;

import com.company.etats.Etat;
import com.company.etats.TypeEtat;
import com.company.etats.sousEtats.EtatTravail;

import java.lang.reflect.Type;
import java.util.HashMap;
//{{57.3, 5.3,0,0,0,0.16}, {0, 1.8,20.8,3.5,0,0},{0,0,0,0,7.3,3.6}}

/**
 * Classe qui représente Gimli
 */
public class Gimli {

    private long temps;
    private Etat etat;

    /**
     * Constructeur de Gimli, initialise les attributs temps et etat puis lance l'automate
     */
    public Gimli() {
        this.temps = 0;
        this.etat = new EtatTravail(0);
        this.automate();

    }

    /**
     * Fonction qui simule les journée de Gimli
     */
    public void automate(){
        long Temps = 1440 * 1000000;
        HashMap<String,Integer> recapTemps = new HashMap<>();
        TypeEtat etatCourant;
        TypeEtat etatSuivant;


        while (this.temps < Temps){
            //System.out.println("-------------------------  " + this.temps + "  -------------------------");
            this.etat.action();

            etatCourant = this.etat.getNomEtatTransition();

            this.etat = this.etat.transition();


            etatSuivant = this.etat.getNomEtatTransition();

            String s = "" + etatCourant + etatSuivant; //Permet d'obtenir le nombre de transition entre chaque état
            //String s = "" + etatCourant; //Permet d'obtenir le temps passe dans chaque état

            Integer integer = recapTemps.get(s);

            try{
                integer +=1;
                recapTemps.replace(s,integer);


            }catch (Exception e){
                recapTemps.put(s,1);
            }

            this.temps += 20;
        }


        this.afficherRecapTemps(recapTemps);

    }


    /**
     * Fonction qui affiche les résultats
     * @param recapTemps sera afficher sur la console
     */
    public void afficherRecapTemps(HashMap recapTemps){
        System.out.println("-------------------------  Recap Temps  -------------------------");

        System.out.println(recapTemps.toString());

    }
}
