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
public class admi_Proyecto {

    ArrayList<Proyecto> proyecto = new ArrayList();
    private File archivo = null;

    public admi_Proyecto(String path) {
          archivo = new File(path);
    }
    

    public ArrayList<Proyecto> getProyecto() {
        return proyecto;
    }

    public void setProyecto(ArrayList<Proyecto> proyecto) {
        this.proyecto = proyecto;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return  "proyecto=" + proyecto ;
    }
    public void setRegis(Proyecto p) {
        this.proyecto.add(p);
    }
    

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Proyecto p : proyecto) {
                bw.write(p.getTitulo() + ";");
                bw.write(p.getDescrip() + ";");
                bw.write(p.getPuntuacion() + ";");
                bw.write(p.getDifivultad() + ";");
                bw.write(p.getTiempo_duracion() + ";");
                bw.write(p.getCantParticipantes() + ";");
                bw.write(p.getFecha() + ";");
                bw.write(p.getUser() + ";");
                bw.write(p.getPass() + "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
     public void cargarArchivo() {
        Scanner sc = null;
        proyecto = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                 proyecto.add(new Proyecto(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
