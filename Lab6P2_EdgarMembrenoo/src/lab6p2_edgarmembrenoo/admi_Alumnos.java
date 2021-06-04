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
public class admi_Alumnos {

    ArrayList<Alumnos> alumno = new ArrayList();
    private File archivo = null;

    public admi_Alumnos(String path) {
        archivo = new File(path);

    }

    public ArrayList<Alumnos> getAlumno() {
        return alumno;
    }

    public void setAlumno(ArrayList<Alumnos> alumno) {
        this.alumno = alumno;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "alumnos=" + alumno;

    }

    public void setRegis(Alumnos a) {
        this.alumno.add(a);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Alumnos a : alumno) {
                bw.write(a.getNombre() + ";");
                bw.write(a.getApellido() + ";");
                bw.write(a.getEdad() + ";");
                bw.write(a.getNum_registro() + ";");
                bw.write(a.getId() + ";");
                bw.write(a.getCarrera() + ";");
                bw.write(a.getAño_carrera() + ";");
                bw.write(a.getPromedio() + ";");
                bw.write(a.getFacultad() + ";");
                bw.write(a.getUser() + ";");
                bw.write(a.getPass()+"\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
       public void cargarArchivo() {
        Scanner sc = null;
        alumno = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                   alumno.add(new Alumnos(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
