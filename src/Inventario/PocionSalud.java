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
public class PocionSalud extends Objetos{
    int salud;
    @Override
    public int pocion(Personaje jugador){
       salud=jugador.getSalud();
       salud=salud+15;
       return salud;
    }
    
}
