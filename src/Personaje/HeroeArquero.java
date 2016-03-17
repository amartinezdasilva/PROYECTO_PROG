/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.util.Random;

/**
 *
 * @author Nabor
 */
public class HeroeArquero extends Personaje{
    
    public HeroeArquero() {
        super("Ranger");
        this.salud=500;
        this.mana=300;
        this.danoFisico=10;
        this.danoMagico=8;
        
    }
 public String getAtaquePropio1(){
        return "Flecha certera" ;
    }
    public String getAtaquePropio2(){
        return "Flecha venenosa";
    }
    public String getAtaquePropio3(){
        return "Disparo doble";
    }
    public String getAtaqueBasico(){
        return "Disparo doble";
    }
    @Override
    public int ataqueBasico() {
       aleatorio=(int) (Math.random() * (10 - 17) + 10);
            return aleatorio;
    }

    @Override
    public int ataquePropio1() {
        mana=mana-45;
       aleatorio=(int) (Math.random() * (50 - 60) + 50);
            return aleatorio;
    }

    @Override
    public int ataquePropio2() {
       aleatorio=(int) (Math.random() * (38 - 42) + 38);
       mana=mana-60;
            return aleatorio+danoFisico+danoMagico;
    }

    @Override
    public int ataquePropio3() {
       aleatorio=(int) (Math.random() * (10 - 17) + 10);
       mana=mana-35;
            return aleatorio+(danoFisico*2);
    }
    public int recibirDaño(int aleatorio){
       salud-=aleatorio;
        return salud ;
    }
    
}
