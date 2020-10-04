/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Lopez
 */
public class principal {
    public static void main(String[] args) throws IOException{
        String ruta = "C:/Users/Lopez/Documents/NetBeansProjects/LOOP-Interprete/src/codigo/Lexico.flex";
        
        generarlex(ruta);
    }
    public static void generarlex(String ruta){
        File archivo=new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
