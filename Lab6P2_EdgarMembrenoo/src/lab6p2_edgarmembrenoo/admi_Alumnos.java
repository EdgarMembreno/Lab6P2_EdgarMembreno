/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_edgarmembrenoo;

import java.io.File;
import java.util.ArrayList;

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
        return "alumnos=" + alumno ;
    }
    

   

    
    
    
    

}
