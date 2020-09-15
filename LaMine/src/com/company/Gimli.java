package com.company;

import com.company.etats.Etat;
import com.company.etats.TypeEtat;
import com.company.etats.sousEtats.EtatTravail;

import java.lang.reflect.Type;
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
        int Temps = 1440 * 100000;
        //HashMap<String,Integer> recapTemps = new HashMap<>();
        //String etatEnCours = null;
        //String etatPasEnCours = null;
        TypeEtat etatCourant;
        TypeEtat etatSuivant;

        int TaverneLit = 0;
        int MineMine = 0;
        int LitMine = 0;
        int TaverneTaverne = 0;
        int MineTaverne = 0;
        int LitLit = 0;
        int MineLit = 0;
        int TaverneMine = 0;
        int reste = 0;

        while (this.temps <= Temps){
            //System.out.println("-------------------------  " + this.temps + "  -------------------------");
            this.etat.action();

            etatCourant = this.etat.getNomEtatTransition();
            //etatEnCours = this.etat.getNomEtat();

            //Integer integer = recapTemps.get(etatEnCours);




            this.etat = this.etat.transition();
            this.temps += 20;

            etatSuivant = this.etat.getNomEtatTransition();
            //etatPasEnCours = this.etat.getNomEtat();

            String s = "" + etatCourant + etatSuivant;
            //Integer integer = recapTemps.get(s);


            switch (s){
                case "TaverneLit":
                    TaverneLit++;
                    break;
                case "MineMine":
                    MineMine++;
                    break;
                case "LitMine":
                    LitMine++;
                    break;
                case "TaverneTaverne":
                    TaverneTaverne++;
                    break;
                case "MineTaverne":
                    MineTaverne++;
                    break;
                case "LitLit":
                    LitLit++;
                    break;
                case "MineLit":
                    MineLit++;
                    break;
                case "TaverneMine":
                    TaverneMine++;
                    break;
                default:
                    reste++;
                    break;
            }

            /*try{
                integer +=1;
                recapTemps.replace(s,integer);
                //recapTemps.replace(etatEnCours,integer);


            }catch (Exception e){
                //recapTemps.put(etatEnCours,1);
                recapTemps.put(s,1);
            }*/


        }
        System.out.println("TaverneLit : " + TaverneLit);
        System.out.println("MineMine : " + MineMine);
        System.out.println("LitMine : " + LitMine);
        System.out.println("TaverneTaverne : " + TaverneTaverne);
        System.out.println("MineTaverne : " + MineTaverne);
        System.out.println("LitLit : " + LitLit);
        System.out.println("TaverneMine : " + TaverneMine);
        System.out.println("MineLit : " + MineLit);
        System.out.println("reste : " + reste);





        //this.afficherRecapTemps(recapTemps);

    }

    public void afficherRecapTemps(HashMap recapTemps){
        System.out.println("-------------------------  Recap Temps  -------------------------");

        System.out.println(recapTemps.toString());

    }
}
