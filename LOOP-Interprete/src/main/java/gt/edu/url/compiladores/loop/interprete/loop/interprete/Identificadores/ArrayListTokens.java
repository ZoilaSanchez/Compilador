/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.compiladores.loop.interprete.loop.interprete.Identificadores;

/**
 *
 * @author Lopez
 */
public class ArrayListTokens implements Comparable<ArrayListTokens>{
    private String tipo_token="";
    private String nombre_token="";
    private int id=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayListTokens() {
    }

    public String getTipo_token() {
        return tipo_token;
    }

    public void setTipo_token(String tipo_token) {
        this.tipo_token = tipo_token;
    }

    public String getNombre_token() {
        return nombre_token;
    }

    public void setNombre_token(String nombre_token) {
        this.nombre_token = nombre_token;
    }
    
    
    
    
    @Override
    public int compareTo(ArrayListTokens o){
        return tipo_token.compareTo(o.tipo_token);
    }
    
    
    
    
}
