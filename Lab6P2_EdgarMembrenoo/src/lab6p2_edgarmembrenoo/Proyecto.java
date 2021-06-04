/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_edgarmembrenoo;

/**
 *
 * @author edgarmembreno
 */
public class Proyecto {

    private String titulo;
    private String descrip;
    private int puntuacion;
    private int difivultad;
    private String tiempo_duracion;
    private int cantParticipantes;
    private String fecha;
    private String user;
    private String pass;

    public Proyecto() {
    }

    public Proyecto(String titulo, String descrip, int puntuacion, int difivultad, String tiempo_duracion, int cantParticipantes, String fecha, String user, String pass) {
        this.titulo = titulo;
        this.descrip = descrip;
        this.puntuacion = puntuacion;
        this.difivultad = difivultad;
        this.tiempo_duracion = tiempo_duracion;
        this.cantParticipantes = cantParticipantes;
        this.fecha = fecha;
        this.user = user;
        this.pass = pass;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getDifivultad() {
        return difivultad;
    }

    public void setDifivultad(int difivultad) {
        this.difivultad = difivultad;
    }

    public String getTiempo_duracion() {
        return tiempo_duracion;
    }

    public void setTiempo_duracion(String tiempo_duracion) {
        this.tiempo_duracion = tiempo_duracion;
    }

    public int getCantParticipantes() {
        return cantParticipantes;
    }

    public void setCantParticipantes(int cantParticipantes) {
        this.cantParticipantes = cantParticipantes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "titulo=" + titulo + ", descrip=" + descrip + ", puntuacion=" + puntuacion + ", difivultad=" + difivultad + ", tiempo_duracion=" + tiempo_duracion + ", cantParticipantes=" + cantParticipantes + ", fecha=" + fecha + ", user=" + user + ", pass=" + pass + '}';
    }

   
}
