/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import Personaje.Personaje;

/**
 *
 * @author Sanny
 */
public class PocionMana extends Objetos{
    int mana;
    @Override
    public int pocion(Personaje jugador) {
       mana=jugador.getMana();
       mana=mana+15;
       return mana;
    }
    
}
