/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.util.Random;

/**
 *
 * @author Sanny
 */
public class HeroeMago extends Personaje {
    
    public HeroeMago() {
        super("Mago");
        this.salud=400;
        this.mana=500;
        this.danoFisico=7;
        this.danoMagico=12;
    }
    public String getAtaquePropio1(){
        return "Pulso arcano" ;
    }
    public String getAtaquePropio2(){
        return "Fragmentos de hielo";
    }
    public String getAtaquePropio3(){
        return "Pyroexplosion";
    }
    public String getAtaqueBasico(){
        return "Conjurar ";
    }
    @Override
    public int ataqueBasico() {
         aleatorio=(int) (Math.random() * (10 - 15) + 10);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio1() {
        mana=mana-35;
         aleatorio=(int) (Math.random() * (20 - 35) + 20);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio2() {
        mana=mana-40;
        int fragmentosAlea;
         aleatorio=(int) (Math.random() * (10 -15) + 10);
          fragmentosAlea=(int)(Math.random()* (0-3));
            return (aleatorio*fragmentosAlea)+danoMagico;
    }

    @Override
    public int ataquePropio3() {
       mana=mana-60;
        aleatorio=(int) (Math.random() * (70 - 95) + 70);
            return aleatorio+danoMagico;
    }
        public int recibirDaño(int aleatorio){
              salud-=aleatorio;
        return salud ;
    }
    
}
