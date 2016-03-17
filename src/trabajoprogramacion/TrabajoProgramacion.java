/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoprogramacion;

import Personaje.Batalla;
import Inventario.Inventario;

import Rival.Rival;
import javax.swing.JOptionPane;


/**
 *
 * @author Nabor
 */
public class TrabajoProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Inventario prueba2 = new Inventario();
       Batalla prueba = new Batalla();
       LeerInfo prueba1 = new LeerInfo();
      int op;
      do{
      op=Integer.parseInt(JOptionPane.showInputDialog("Que acción desea realizar \n 1.- Ejecutar programa \n 2.- Leer información \n 3.-Cancelar ejecucion"));
      switch(op){
          case 1 :
               prueba.comenzarBatalla();
              break;
          case 2 :
              int res;
              do{
              res=Integer.parseInt(JOptionPane.showInputDialog("Que informacion desea leer \n 1.-Informacion general \n 2.- Rivales \n 3.-Heroes \n 4.-Cancelar"));
              switch(res){
                  case 1 :
                      prueba1.leerFichero("F:\\DAM1\\PROGRAMACION\\TrabajoProgramacion\\src\\trabajoprogramacion\\Informacion.txt");
                      break;
                  case 2 :
                      prueba1.leerFichero("F:\\DAM1\\PROGRAMACION\\TrabajoProgramacion\\src\\trabajoprogramacion\\Rivales.txt");
                      break;
                  case 3 :
                      prueba1.leerFichero("F:\\DAM1\\PROGRAMACION\\TrabajoProgramacion\\src\\trabajoprogramacion\\Heroes.txt");
                      break;
                  case 4 :
                      JOptionPane.showMessageDialog(null,"Cancelado lectura");
                      break;
              }
              
      }while(res!=4);
            case 3: 
                JOptionPane.showMessageDialog(null,"Cancelado ejecucion");
                      break;
    }
    
}while(op!=3);
}
}