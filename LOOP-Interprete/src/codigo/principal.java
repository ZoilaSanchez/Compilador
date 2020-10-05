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
 * INSTRUCCIONES
 * Se inicia Ejecutando esta clase(principal) para poder actualizar la clase lexico
 * En la clase lexico.flex se encuentra lo que son las reglas para verificar si es correcta o no 
 * En la clase lexico.java es la que se crea si todo es correcto al momento de ejecutar la clase principal
 * En la clase tokens se encuentran las posibles clasificacions
 * En loopinterfaz es donde se realizan las diferentes validaciones para leer y escribir en el texto a compilar
 */
public class principal {
    public static void main(String[] args) throws IOException{
        String ruta = "C:/Users/Lopez/Documents/GitHub/Compilador/LOOP-Interprete/src/codigo/Lexico.flex";
        generarlex(ruta);
        String _1="";
       
    }
    public static void generarlex(String ruta){
        File archivo=new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
