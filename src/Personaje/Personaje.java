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
public abstract class Personaje {
    protected int salud,mana,danoFisico,danoMagico;
    protected String nombre;
    protected int aleatorio;
   

    public Personaje(String nombre) {
        this.mana= mana;
        this.salud=salud;
        this.danoFisico=danoFisico;
        this.danoMagico=danoMagico;
        this.nombre = nombre;
        
    }
    
    
    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setDanoFisico(int dañoFisico) {
        this.danoFisico = dañoFisico;
    }

    public void setDanoMagico(int danoMagico) {
        this.danoMagico = danoMagico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getMana() {
        return mana;
    }

    public int getDanoFisico() {
        return danoFisico;
    }

    public int getDanoMagico() {
        return danoMagico;
    }

    public String getNombre() {
        return nombre;
    }
        //Ataques
     public String getAtaquePropio1() {
        return "";
    }

    public String getAtaquePropio2() {
        return "";
    }

    public String getAtaquePropio3() {
        return "";
    }

    public String getAtaqueBasico() {
        return "";
    }
    public abstract int ataqueBasico();
     public abstract int ataquePropio1();
    public abstract int ataquePropio2();
    public abstract int ataquePropio3();
      
    public int recibirDaño(int aleatorio){
        salud =salud-aleatorio;
        return salud;
    }

    @Override
    public String toString() {
        return "Heroe{" + "salud=" + salud + ", mana=" + mana + ", daño fisico=" + danoFisico + ", daño magico=" + danoMagico + ", nombre=" + nombre + '}';
    }
    
}
