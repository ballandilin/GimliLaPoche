package com.company;

import com.company.etats.Etat;
import com.company.etats.TypeEtat;
import com.company.etats.sousEtats.EtatTravail;

import java.lang.reflect.Type;
import java.util.HashMap;

public class Gimli {

    private long temps;
    private Etat etat;

    public Gimli() {
        this.temps = 0;
        this.etat = new EtatTravail(0);
        this.automate();

    }

    public void automate(){
        int Temps = 1440 * 10000000;
        HashMap<String,Integer> recapTemps = new HashMap<>();
        TypeEtat etatCourant;
        TypeEtat etatSuivant;

        while (this.temps <= Temps){
            //System.out.println("-------------------------  " + this.temps + "  -------------------------");
            this.etat.action();

            etatCourant = this.etat.getNomEtatTransition();




            this.etat = this.etat.transition();
            this.temps += 20;

            etatSuivant = this.etat.getNomEtatTransition();

            String s = "" + etatCourant + etatSuivant;
            Integer integer = recapTemps.get(s);

            try{
                integer +=1;
                recapTemps.replace(s,integer);
                //recapTemps.replace(etatEnCours,integer);


            }catch (Exception e){
                //recapTemps.put(etatEnCours,1);
                recapTemps.put(s,1);
            }


        }


        this.afficherRecapTemps(recapTemps);

    }

    public void afficherRecapTemps(HashMap recapTemps){
        System.out.println("-------------------------  Recap Temps  -------------------------");

        System.out.println(recapTemps.toString());

    }
}
