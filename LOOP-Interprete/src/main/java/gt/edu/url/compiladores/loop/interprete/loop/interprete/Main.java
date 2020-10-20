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

    public static int contador = 0;
    public static String resultado = "";
    public static String generadortokens = "";
    public static int cont = 1;
    // ArrayListTokens comenzar

    public static ArrayList<ArrayListTokens> lista = new ArrayList();
    public static ArrayListTokens aux = new ArrayListTokens();
    // terminar ArrayListTokens

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {


        
        Reader lector = new BufferedReader(new FileReader("archivo.txt"));
        Lexico lexico = new Lexico(lector);
        resultado = "";
        contador = 0;
        while (true) {
            Tokens toke = lexico.yylex();
            if (toke == null) {
                resultado += "----------------------------------";
                //txaSalida.setText(resultado);
                //se genera el documento para los tokens

                creartxt(mostrar(), "tokens.txt");
                //--------------------------------------
                return;
            }
            aux = new ArrayListTokens();
            aux.setId(String.valueOf(cont++));
            if (toke == error) {
                resultado += lexico.lexeme + " incorrecto \n";
            } else if (toke == Identificador) {
                resultado += lexico.lexeme + "-- es -- " + toke + "\n";

                aux.setTipo_token(toke.toString());
                aux.setNombre_token(lexico.lexeme);
                lista.add(aux);
            } else if (toke == tipo) {
                resultado += lexico.lexeme + "-- es -- " + toke + "\n";

                aux.setTipo_token(toke.toString());
                aux.setNombre_token(lexico.lexeme);
                lista.add(aux);
            } else if (toke == Asignacion) {
                resultado += lexico.lexeme + "-- es -- " + toke + "\n";

                aux.setTipo_token(toke.toString());
                aux.setNombre_token(lexico.lexeme);
                lista.add(aux);
            } else if (toke == tabulador) { //Agregue esto
                resultado += "Tabulador :" + lexico.lexeme + "\n";

                aux.setTipo_token(toke.toString());
                aux.setNombre_token(lexico.lexeme);
                lista.add(aux);
            } else if (toke == tabuladores) {
                resultado += "Tabuladores ;" + lexico.lexeme + "\n";

                aux.setTipo_token(toke.toString());
                aux.setNombre_token(lexico.lexeme);
                lista.add(aux);
            } else if (toke == espacioBlanco) {
                resultado += "Espacio en Blanco" + lexico.lexeme + "\n";

                aux.setTipo_token(toke.toString());
                aux.setNombre_token(lexico.lexeme);
                lista.add(aux);
            } else if (toke == finLinea) {
                resultado += "Fin de línea" + lexico.lexeme + "\n";

                aux.setTipo_token(toke.toString());
                aux.setNombre_token(lexico.lexeme);
                lista.add(aux);
            }

        }
    }

    static String nombre_del_archivo = "";

    public static void creartxt(String cuerpo, String nombreArchivo) {
        nombre_del_archivo = "";
        File archivo = new File(nombreArchivo);
        nombre_del_archivo = nombreArchivo;
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print((cuerpo));
            escribir.close();
        } catch (Exception e) {
        }

    }

    public static String mostrar() {
        for (int i = 0; i < lista.size(); i++) {
            generadortokens += lista.get(i).getId() + "\t" + lista.get(i).getTipo_token() + "\t" + lista.get(i).getNombre_token() + "\n";
        }
        return generadortokens;
    }

    public String saltos(String cadena) {
        return cadena.replaceAll("\n", " ");
    }

}
