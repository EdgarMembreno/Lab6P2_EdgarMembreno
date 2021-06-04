/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_edgarmembrenoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgarmembreno
 */
public class admi_Docente {

    ArrayList<Docentes> docente = new ArrayList();
    private File archivo = null;

    public admi_Docente(String path) {
        archivo = new File(path);
    }

    public ArrayList<Docentes> getDocente() {
        return docente;
    }

    public void setDocente(ArrayList<Docentes> docente) {
        this.docente = docente;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "docente=" + docente ;
        
    }
    
    public void setRegis(Docentes d) {
        this.docente.add(d);
    }
    
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Docentes d : docente) {
                bw.write(d.getNombre() + ";");
                bw.write(d.getApellido() + ";");
                bw.write(d.getNum_registro() + ";");
                bw.write(d.getTitulo()+ ";");
                bw.write(d.getTitulo_posgrado() + ";");
                bw.write(d.getImpartido_clase() + ";");
                bw.write(d.getFacultad() + ";");
                bw.write(d.getUser() + ";");
                bw.write(d.getPass() + "\n");  
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo() {
        Scanner sc = null;
        docente = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                   docente.add(new Docentes(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

  
    
}
