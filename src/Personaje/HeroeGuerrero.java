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
public class HeroeGuerrero extends Personaje {
   
    public HeroeGuerrero() {
        super("Caballero");
        this.salud=500;
        this.mana=300;
        this.danoFisico=10;
        this.danoMagico=0;
    }
    public String getAtaquePropio1(){
        return "Embestir" ;
    }
    public String getAtaquePropio2(){
        return "Golpe con escudo";
    }
    public String getAtaquePropio3(){
        return "Ejecutar";
    }
    public String getAtaqueBasico(){
        return "Espadazo";
    }
    @Override
    public int ataqueBasico() {
         aleatorio=(int) (Math.random() * (10 - 18) + 10);
            return aleatorio;
    }

    @Override
    public int ataquePropio1() {
          mana=mana-45;
           aleatorio=(int) (Math.random() * (30 - 45) + 30);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio2() {
       mana=mana-25;
        aleatorio=(int) (Math.random() * (30 - 35) + 30);
            return aleatorio+danoFisico;
    }

    @Override
    public int ataquePropio3() {
        mana=mana-75;
         aleatorio=(int) (Math.random() * (70 - 90) + 70);
            return aleatorio+danoFisico;
    }
     public int recibirDaño(int aleatorio){
              salud-=aleatorio;
        return salud ;
    }
    }
    

