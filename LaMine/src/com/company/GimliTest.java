package com.company;

/**
 * Version test
 */
public class GimliTest {

    private float temps;
    private float tauxAlcool;
    private float tauxAlcoolBiere;

    public GimliTest() {
        this.temps = 0;
        this.tauxAlcool = 0;
        this.tauxAlcoolBiere = (float) (28/(102 * 0.7));
    }

    public void Travail(){
        if(this.tauxAlcool >= 0.15){
            this.tauxAlcool -= 0.15;
        }

        this.AvancerTemps();

        int cassage = (int) Math.random()*100 + 1;
        float tauxCassage = 15;

        if (this.tauxAlcool > 0){
            tauxCassage += tauxCassage * this.tauxAlcool * 8 /100;
        }

        if (cassage <= tauxCassage){
            this.Forgeron();
        }
        else{
            this.Pause();
        }

    }

    public void Pause(){
        System.out.println("Gimli boit une bière");

        this.AvancerTemps();
        this.BoireBiere();
        this.DegrisageRepos();
        this.Travail();
    }

    public void Forgeron(){
        System.out.println("Le pioche est réparée");

        this.AvancerTemps();
        this.DegrisageRepos();


        int reparer = (int) Math.random()*3 + 1;

        if (reparer == 1){
            this.Taverne();
        }
        else{
            this.Travail();
        }


    }

    public void Taverne(){
        for (int i = 0 ; i < 3 ; i++){
            this.BoireBiere();
        }
        this.AvancerTemps();
        this.DegrisageRepos();

        int bagarre = (int) Math.random()*100 + 1;
        float tauxBagarre = 5;

        if (this.tauxAlcool > 0){
            tauxBagarre += tauxBagarre * this.tauxAlcool * 15 /100;
        }

        if (bagarre <= tauxBagarre){
            this.Travail();
        }
        else{
            this.Taverne();
        }
    }

    public void BoireBiere(){
        this.tauxAlcool += this.tauxAlcoolBiere;
        this.TestAlcolemie();
    }

    public void Sieste(){
        for (int i = 0 ; i < 3 ; i++){
            this.AvancerTemps();
        }
        this.tauxAlcool = 0;
    }


    public void DegrisageRepos(){
        if (this.tauxAlcool >= 0.10){
            this.tauxAlcool -= 0.10;
        }
    }

    public void AvancerTemps(){
        this.temps += 20;
    }

    public void TestAlcolemie(){
        if (this.tauxAlcool > 8){
            this.Sieste();
        }
    }
}
