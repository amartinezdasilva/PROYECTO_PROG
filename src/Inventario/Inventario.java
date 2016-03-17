/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import Inventario.Objetos;
import Inventario.PocionMana;
import Inventario.PocionSalud;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nabor
 */
public class Inventario {
    ArrayList <Objetos> inventario = new ArrayList();
    Objetos obj;
    
    public void Inventario(){
        int op;
        int aux=0;
        do{
       op=Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea comprar? \n 1.-Poción de Salud \n 2.-Poción de Maná \n 3.-Salir"));
        switch(op){
            case 1:
              inventario.add(new PocionSalud());
              JOptionPane.showMessageDialog(null,"Has comprado una pocion de salud");
              aux++;
              break;
            case 2:
              inventario.add(new PocionMana());
              JOptionPane.showMessageDialog(null,"Has comprado una pocion de mana");
              aux++;
              break;
            case 3:
                JOptionPane.showMessageDialog(null,"Cancelando compra");
                break;
        }
    }while(aux<4);
}
    public void MostrarInventario(){
        String acumulador="";
        JOptionPane.showMessageDialog(null,"Tienes: " + inventario.size() + " Pociones");
        
        for (int i = 0; i < inventario.size(); i++) {
            
            acumulador=acumulador+" " +inventario.get(i).toString()+"\n";
           
        } JOptionPane.showMessageDialog(null,acumulador);
    
        }
}
