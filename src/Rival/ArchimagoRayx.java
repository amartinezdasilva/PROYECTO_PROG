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
 * @author Nabor
 */
public class ArchimagoRayx extends Rival{
  
    public ArchimagoRayx(String nombre) {
        super("Archimago Rayx");
        this.salud = 250;
        this.mana = 450;
        this.danoFisico = 6;
        this.danoMagico =12;
        this.nombre = nombre;
    }
    
     //Ataques
    public String getAtaquePropio1(){
        return "Lanzada electrica" ;
    }
    public String getAtaquePropio2(){
        return "Ventisca";
    }
    public String getAtaquePropio3(){
        return "Pirofrío";
    }
    public String getAtaqueBasico(){
        return "Golpe de bastón";
    }
            
    @Override
    public int ataquePropio1() {
         
         mana=mana-50;
         aleatorio=(int) (Math.random() * (50 - 70) + 50);
        
            return aleatorio+danoMagico;
      
    }

    @Override
    public int ataquePropio2() {
        
         mana=mana-70;
          aleatorio=(int) (Math.random() * (30 - 85) + 30);
            return aleatorio+danoMagico;
     
    }

    @Override
    public int ataquePropio3() {
      
         mana=mana-20;
        aleatorio=(int) (Math.random() * (25 - 35) + 25);
            return aleatorio+danoMagico;
     
    }

    @Override
    public int ataqueBasico() {
        //Se le suma el ataque Fisico al ataque basico de los tipo mago
        //debido al cosumo de mana
         aleatorio=(int) (Math.random() * (10 - 15) + 10);
            return aleatorio+danoFisico;
            
    }
    public int recibirDaño(int aleatorio){
        this.salud-=aleatorio;
        return this.salud ;
    }
    
}
