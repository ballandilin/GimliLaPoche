package com.company;

import com.company.etats.Etat;
import com.company.etats.EtatInitial;

public class Gimli {

    private float temps;
    private Etat etat;

    public Gimli() {
        this.temps = 0;
        this.etat = new EtatInitial(0);
        this.automate();

    }

    public void automate(){
        while (this.temps <= 1140){
            System.out.println("-------------------------  " + this.temps + "  -------------------------");
            this.etat.action();
            this.etat = this.etat.transition();
            this.temps += 20;

        }

    }
}
