/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import Personaje.Personaje;

/**
 *
 * @author Nabor
 */
public  abstract class Objetos {
    Personaje jugador;
    int salud,mana;
   public abstract int pocion(Personaje jugador);
    
}
