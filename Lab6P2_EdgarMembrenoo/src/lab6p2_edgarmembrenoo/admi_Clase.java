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
public class admi_Clase {

    ArrayList<Clases> clases = new ArrayList();
    private File archivo = null;

    public admi_Clase(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "clases=" + clases ;
    }
    public void setRegis(Clases c) {
        this.clases.add(c);
    }
      public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Clases c : clases) {
                bw.write(c.getNombre()+ ";");
                bw.write(c.getSeccion() + ";");
                bw.write(c.getCodigo() + ";");
                bw.write(c.getCodig_carrera() + ";");
                bw.write(c.getCantidad_alumnos() + ";");
                bw.write(c.getNum_aula() + ";");
                bw.write(c.getUser() + ";");
                bw.write(c.getPass() + "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
      public void cargarArchivo() {
        Scanner sc = null;
        clases = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                 clases.add(new Clases(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
