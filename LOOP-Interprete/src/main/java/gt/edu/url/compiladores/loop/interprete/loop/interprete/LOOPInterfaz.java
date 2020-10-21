/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.compiladores.loop.interprete.loop.interprete;

import gt.edu.url.compiladores.loop.interprete.loop.interprete.Identificadores.ArrayListTokens;
import static gt.edu.url.compiladores.loop.interprete.loop.interprete.Tokens.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique Castañeda <enrique7cp@gmail.com>
 */
public class LOOPInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form LOOPInterfaz
     */
    GenerarTXT txt=new GenerarTXT();
    GenerarTXT Tok=new GenerarTXT();
    public LOOPInterfaz(String nombre) {
        initComponents();
        leerArchivo(nombre);
        this.archivo_txt=nombre;
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        pnlPrincipal = new javax.swing.JPanel();
        pnlSalida = new javax.swing.JPanel();
        spSalida = new javax.swing.JScrollPane();
        txaSalida = new javax.swing.JTextArea();
        pnlControl = new javax.swing.JPanel();
        btnRun = new javax.swing.JButton();
        pnlCodigo = new javax.swing.JPanel();
        spCodigo = new javax.swing.JScrollPane();
        txaCodigo = new javax.swing.JTextArea();
        mbPrincipal = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miAbrirArchivo = new javax.swing.JMenuItem();
        miNuevoArchivo = new javax.swing.JMenuItem();
        miGuardarArchivo = new javax.swing.JMenuItem();
        mConfiguracion = new javax.swing.JMenu();
        mAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOOP");

        pnlPrincipal.setBackground(new java.awt.Color(38, 39, 40));
        pnlPrincipal.setForeground(new java.awt.Color(60, 63, 65));

        pnlSalida.setBackground(new java.awt.Color(38, 39, 40));

        txaSalida.setBackground(new java.awt.Color(38, 39, 45));
        txaSalida.setColumns(20);
        txaSalida.setFont(new java.awt.Font("FreeMono", 0, 16)); // NOI18N
        txaSalida.setForeground(new java.awt.Color(0, 153, 0));
        txaSalida.setRows(5);
        txaSalida.setText("Salida:");
        spSalida.setViewportView(txaSalida);

        javax.swing.GroupLayout pnlSalidaLayout = new javax.swing.GroupLayout(pnlSalida);
        pnlSalida.setLayout(pnlSalidaLayout);
        pnlSalidaLayout.setHorizontalGroup(
            pnlSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSalidaLayout.setVerticalGroup(
            pnlSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spSalida)
                .addContainerGap())
        );

        pnlControl.setBackground(new java.awt.Color(25, 25, 25));
        pnlControl.setForeground(new java.awt.Color(60, 63, 65));

        btnRun.setBackground(new java.awt.Color(25, 25, 25));
        btnRun.setText("RUN");
        btnRun.setToolTipText("Correr programa");
        btnRun.setBorder(null);
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControlLayout = new javax.swing.GroupLayout(pnlControl);
        pnlControl.setLayout(pnlControlLayout);
        pnlControlLayout.setHorizontalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRun, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlControlLayout.setVerticalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRun)
                .addGap(91, 91, 91))
        );

        pnlCodigo.setBackground(new java.awt.Color(38, 39, 40));

        txaCodigo.setBackground(new java.awt.Color(38, 39, 48));
        txaCodigo.setColumns(20);
        txaCodigo.setFont(new java.awt.Font("FreeMono", 0, 16)); // NOI18N
        txaCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txaCodigo.setRows(5);
        txaCodigo.setCaretColor(new java.awt.Color(255, 255, 255));
        spCodigo.setViewportView(txaCodigo);

        javax.swing.GroupLayout pnlCodigoLayout = new javax.swing.GroupLayout(pnlCodigo);
        pnlCodigo.setLayout(pnlCodigoLayout);
        pnlCodigoLayout.setHorizontalGroup(
            pnlCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCodigo)
                .addContainerGap())
        );
        pnlCodigoLayout.setVerticalGroup(
            pnlCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mArchivo.setText("Archivo");
        mArchivo.setFont(new java.awt.Font("FreeMono", 0, 16)); // NOI18N

        miAbrirArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miAbrirArchivo.setFont(new java.awt.Font("FreeMono", 0, 15)); // NOI18N
        miAbrirArchivo.setText("Abrir Archivo");
        miAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirArchivoActionPerformed(evt);
            }
        });
        mArchivo.add(miAbrirArchivo);

        miNuevoArchivo.setFont(new java.awt.Font("FreeMono", 0, 15)); // NOI18N
        miNuevoArchivo.setText("Nuevo Archivo");
        miNuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoArchivoActionPerformed(evt);
            }
        });
        mArchivo.add(miNuevoArchivo);

        miGuardarArchivo.setFont(new java.awt.Font("FreeMono", 0, 15)); // NOI18N
        miGuardarArchivo.setText("Guardar");
        miGuardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarArchivoActionPerformed(evt);
            }
        });
        mArchivo.add(miGuardarArchivo);

        mbPrincipal.add(mArchivo);

        mConfiguracion.setText("Configuración");
        mConfiguracion.setFont(new java.awt.Font("FreeMono", 0, 16)); // NOI18N
        mbPrincipal.add(mConfiguracion);

        mAbout.setText("About");
        mAbout.setFont(new java.awt.Font("FreeMono", 0, 16)); // NOI18N
        mbPrincipal.add(mAbout);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//public String saltos(String cadena) {
//  return cadena.replaceAll("\n", " "); 
//}

String archivo_txt="";
    public void creartxt(String cuerpo,String nombreArchivo){
        archivo_txt="";
        File archivo=new File(nombreArchivo);
        archivo_txt=nombreArchivo;
        PrintWriter escribir;
        try {
            escribir=new PrintWriter(archivo);
            escribir.print((cuerpo));
            escribir.close();
        } catch (Exception e) {
        }
        
    }
    String nombre_del_archivo="";
public void token(String cuerpo,String nombreArchivo){
        nombre_del_archivo="";
        File archivo=new File(nombreArchivo);
        nombre_del_archivo=nombreArchivo;
        PrintWriter escribir;
        try {
            escribir=new PrintWriter(archivo);
            escribir.print((cuerpo));
            escribir.close();
        } catch (Exception e) {
        }
        
    }


int contador=0;
String resultado="";
String generadortokens="";
String errores="";
int cont=1;
// ArrayListTokens comenzar

ArrayList<ArrayListTokens> lista = new ArrayList();
ArrayListTokens aux=new ArrayListTokens();
// terminar ArrayListTokens

    public void leer(String nombre_archivo) throws IOException{
               
        Reader lector = new BufferedReader(new FileReader(archivo_txt));
        Lexico lexico= new Lexico(lector);
        resultado="";
        contador=0;

            while(true){
                Tokens toke=lexico.yylex();
                if(toke==null){
                    resultado+="----------------------------------\n";
                    resultado+=errores;
                    
                    txaSalida.setText(resultado);
                    //se genera el documento para los tokens
                    if(errores.length()>0){
                        System.out.println("Verificar para contruir los tokens");
                    }else{
                       token(mostrar(), "tokens.txt");
                    }
                    
                    //--------------------------------------
                    return;
                }
                aux = new ArrayListTokens();
                String dd;
                if(toke==error){
                     errores+=lexico.lexeme+" incorrecto \n";
                }else if(toke==identificador ){
                    
                     resultado+=lexico.lexeme+"-- es -- "+ toke+"\n";

                }else if(toke==tipo){
                    resultado+=lexico.lexeme+" -- "+ toke+"\n";

                }else if(toke==operadores|| toke ==operador_Logico){
                    resultado+=lexico.lexeme+" -- "+ toke+"\n";  

                } else if (toke == tabulador){ //Agregue esto
                    resultado += "Tabulador :" + lexico.lexeme + "\n";

                } else if (toke == tabuladores){
                    resultado += "Tabuladores ;" + lexico.lexeme + "\n";

                } else if (toke == espacioBlanco){
                    resultado += "Espacio en Blanco " + lexico.lexeme + "\n";

                } else if (toke == finLinea|| toke==fin_de_linea){
                    resultado += "Fin de línea " + lexico.lexeme + "\n";
                     
                }else if(toke ==entrada){
                    resultado += "Entrada " + lexico.lexeme + "\n";
                            
                } else if(toke ==salida){
                    resultado += "Salida " + lexico.lexeme + "\n";
                }else if(toke ==retornar){
                    resultado += "retronar " + lexico.lexeme + "\n";
                } else if(toke ==instancias){
                    resultado += "instancias " + lexico.lexeme + "\n";
                }
                else if(toke == inte|| toke==real ){
                    resultado += "numero " + lexico.lexeme + "\n";
                  
                }else if(toke == comentario|| toke==comentarios){
                    resultado += "cometario " + lexico.lexeme + "\n";
                }else if(toke == clases){
                    resultado += "clases " + lexico.lexeme + "\n";
                }else if(toke == cadena){
                    resultado += "cadena " + lexico.lexeme + "\n";
                }else if(toke == funcion){
                    resultado += "funcion " + lexico.lexeme + "\n";
                }else if(toke == boleano){
                    resultado += "boleano " + lexico.lexeme + "\n";
                }else if(toke==nonu||toke ==No||toke ==nocom|| toke==noclas||toke==nocom){
                    errores+="Error revisar : "+lexico.lexeme+ "\n";
                }         
                if(toke==No||toke == nonu||toke ==nocom|| toke==error|| toke==noclas|| toke==nocom){
                    
                }else{
                    aux.setId(String.valueOf(cont++));
                    aux.setTipo_token(toke.toString());
                     aux.setNombre_token(lexico.lexeme);
                     lista.add(aux); 
                }
                     
            }//fin del while
            
}
    
public  String mostrar(){
    generadortokens+=String.format("|------------------------------------------ LISTADO DE TOKENS ----------------------------------------|%n");
    generadortokens+=String.format("|-----------------+-----------------------------+-----------------------------------------------------|%n");
    generadortokens+=String.format("|------- No. -----+------------ Tipo -----------+------------------------ Valor ----------------------|%n");
    for (int i = 0; i < lista.size(); i++) {
        String f1 = "| "+lista.get(i).getId();
        String f2 = "| "+lista.get(i).getTipo_token();
        String f3 = "| "+lista.get(i).getNombre_token();
        String f5 = "|";
        generadortokens+=String.format("%-17s %-29s %-30s %24s%n",f1,f2,f3,f5);
    }
        generadortokens+=String.format("|-----------------+-----------------------------+-----------------------------------------------------|%n");
        System.out.println(generadortokens);
        return generadortokens;
}
public void limpiar() throws IOException{
    lista.clear();
    cont=1;
}
    
    
    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        try {
            errores="";
            generadortokens="";
            txaCodigo.setText("");
            limpiar();
//            creartxt(txaCodigo.getText(), nombre_del_archivo);
            leerArchivo(archivo_txt);
            leer(archivo_txt);
        } catch (IOException ex) {
            Logger.getLogger(LOOPInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
       
           
    }//GEN-LAST:event_btnRunActionPerformed
String ruta;
    private void miAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirArchivoActionPerformed
        // Abrimos el archivo que querramos y lo seteamos al editor de LOOP
        String resultado = "";
        
        FileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        byte decision = (byte) FileChooser.showOpenDialog(null);      
        if (decision == 0) {
           ruta = FileChooser.getSelectedFile().toString();
            System.out.println(ruta);
            leerArchivo(ruta);
        }
    }//GEN-LAST:event_miAbrirArchivoActionPerformed
String nm="";

public void crear(){
     FileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        byte decision = (byte) FileChooser.showOpenDialog(null);      
        if (decision == 0) {
           nm = FileChooser.getSelectedFile().toString();         
        try {
            creartxt((txaCodigo.getText()), (nm+".txt"));
        } catch (Exception e) {
        }
        }
}
    private void miNuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoArchivoActionPerformed
       
    }//GEN-LAST:event_miNuevoArchivoActionPerformed

    private void miGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarArchivoActionPerformed
      
    }//GEN-LAST:event_miGuardarArchivoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LOOPInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LOOPInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LOOPInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LOOPInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//              
//                new LOOPInterfaz((args[0])).setVisible(true);
//               
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton btnRun;
    private javax.swing.JMenu mAbout;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenu mConfiguracion;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miAbrirArchivo;
    private javax.swing.JMenuItem miGuardarArchivo;
    private javax.swing.JMenuItem miNuevoArchivo;
    private javax.swing.JPanel pnlCodigo;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSalida;
    private javax.swing.JScrollPane spCodigo;
    private javax.swing.JScrollPane spSalida;
    private javax.swing.JTextArea txaCodigo;
    private javax.swing.JTextArea txaSalida;
    // End of variables declaration//GEN-END:variables

private void leerArchivo(String archivo)
    {
        
        FileReader file = null;
        try {
            String cadena;
            file = new FileReader(archivo);
            BufferedReader breader = new BufferedReader(file);
            try {
                while((cadena = breader.readLine())!= null)
                {
                    txaCodigo.setText(txaCodigo.getText() + cadena + "\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(LOOPInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LOOPInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(LOOPInterfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
