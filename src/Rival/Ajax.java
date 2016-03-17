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
 * @author Usuario
 */
public class Ajax extends Rival {
   
    
    public Ajax(String nombre) {
        super("Ajax");
        this.salud = 350;
        this.mana = 200;
        this.danoFisico = 13;
        this.danoMagico =0;
        this.nombre = nombre;
    }
    //Ataques
    public String getAtaquePropio1(){
        return "Devastar" ;
    }
    public String getAtaquePropio2(){
        return "Golpe Mortal";
    }
    public String getAtaquePropio3(){
        return "Arremetida Enfurecida";
    }
    public String getAtaqueBasico(){
        return "Hachazo";
    }
    
    @Override
    public int ataquePropio1() {
        aleatorio=(int) (Math.random() * (50 - 70) + 50);
        mana=mana-30;
            return aleatorio+danoFisico;
      //Ataque propio 1
    }

    @Override
    public int ataquePropio2() {
        aleatorio=(int) (Math.random() * (70 - 75) + 70);
        mana=mana-40;
            return aleatorio+danoFisico; //Ataque propio 2
    }

    @Override
    public int ataquePropio3() {
        
        aleatorio=(int) (Math.random() * (40 - 90) + 40);
        mana=mana-20;
            return aleatorio+danoFisico; //Ataque propio 3
    }

    @Override
    public int ataqueBasico() {
         aleatorio=(int) (Math.random() * (10 - 15) + 10);
            return aleatorio;
            //Ataque Basico
    }
     public int recibirDaño(int aleatorio){
       salud-=aleatorio;
        return salud ;
    }
    
    }
    

