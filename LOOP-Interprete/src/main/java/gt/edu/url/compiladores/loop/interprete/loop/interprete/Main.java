/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.compiladores.loop.interprete.loop.interprete;

import gt.edu.url.compiladores.loop.interprete.loop.interprete.Identificadores.ArrayListTokens;
import static gt.edu.url.compiladores.loop.interprete.loop.interprete.Tokens.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;

/**
 *
 * @author Enrique Castañeda <enrique7cp@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        if(args.length!=1) {
            String inicio="";
            inicio+=String.format("|-----------------------------------------------------------------------------------------------------|%n");
            inicio+=String.format("|---------------------------------- ATENCION: PARAMETROS NO CORRECTOS --------------------------------|%n");
            inicio+=String.format("|-----------------------------------------------------------------------------------------------------|%n");
            System.out.println(inicio);
            System.exit(0);
        }  
         String nombre = (args[0]);
         String inicio="";
         inicio+=String.format("|-----------------------------------------------------------------------------------------------------|%n");
         inicio+=String.format("|------------------------------------------ BIENVENIDOS A LOOP ---------------------------------------|%n");
         inicio+=String.format("|-----------------------------------------------------------------------------------------------------|%n");
         System.out.println(inicio);
         new LOOPInterfaz(nombre).setVisible(true);
    }

}
