package com.company;

import com.company.etats.Etat;
import com.company.etats.EtatTravail;

import java.util.HashMap;

public class Gimli {

    private float temps;
    private Etat etat;

    public Gimli() {
        this.temps = 0;
        this.etat = new EtatTravail(0);
        this.automate();

    }

    public void automate(){
        int Temps = 1140;
        HashMap<String,Integer> recapTemps = new HashMap<>();
        String etatEnCours = null;


        while (this.temps <= Temps){
            System.out.println("-------------------------  " + this.temps + "  -------------------------");

            this.etat.action();


            etatEnCours = this.etat.getNomEtat();

            Integer integer = recapTemps.get(etatEnCours);
            try{
                integer +=1;
                recapTemps.replace(etatEnCours,integer);

            }catch (Exception e){
                recapTemps.put(etatEnCours,1);
            }



            this.etat = this.etat.transition();
            this.temps += 20;

        }
        this.afficherRecapTemps(recapTemps);

    }

    public void afficherRecapTemps(HashMap recapTemps){
        System.out.println("-------------------------  Recap Temps  -------------------------");

        System.out.println(recapTemps.toString());

    }
}
