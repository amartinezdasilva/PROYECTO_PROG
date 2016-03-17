/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LeerInfo {
     public void leerFichero(String nombreFichero){
        File f = new File(nombreFichero);
        Scanner sc= null;
        try {
            f = new File (nombreFichero);
             sc = new Scanner(f);
             while(sc.hasNextLine()){
                 String res = sc.nextLine();
                 System.out.println(res);
             }
        } catch (FileNotFoundException ex) {
            System.out.println("Error de fichero " + ex.toString());
        }
        finally {
            sc.close();
        }
    }
}
     