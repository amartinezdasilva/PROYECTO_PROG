/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rival;

import Rival.Rival;
import java.util.Random;

/**
 *
 * @author Sanny
 */
public class Cancerbero extends Rival {
  
    public Cancerbero(String nombre) {
        super ("Cancerbero");
        this.salud = 320;
        this.mana = 320;
        this.danoFisico = 10;
        this.danoMagico = 8;
        
        
    }
    public String getAtaquePropio1(){
        return "Desgarrar" ;
    }
    public String getAtaquePropio2(){
        return "Escupir lava";
    }
    public String getAtaquePropio3(){
        return "Mordisco";
    }
    public String getAtaqueBasico(){
        return "Zarpa";
    }

    @Override
    public int ataqueBasico() {
         aleatorio=(int) (Math.random() * (10 - 17) + 10);
            return aleatorio;
    }

    @Override
    public int ataquePropio1() {
         mana=mana-50;
        aleatorio=(int) (Math.random() * (50 - 60) + 50);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio2() {
         mana=mana-45;
        aleatorio=(int) (Math.random() * (40 - 75) + 40);
            return aleatorio+danoMagico;
    }

    @Override
    public int ataquePropio3() {
         mana=mana-30;
        aleatorio=(int) (Math.random() * (25 - 40) + 25);
            return aleatorio+danoMagico;
    }
     public int recibirDaño(int aleatorio){
        this.salud-=aleatorio;
        return this.salud ;
    }
    
}
