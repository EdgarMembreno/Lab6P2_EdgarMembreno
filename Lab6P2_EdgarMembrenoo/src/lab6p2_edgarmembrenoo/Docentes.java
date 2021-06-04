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
public class Docentes {
    private String nombre;
    private String apellido;
    private int num_registro;
    private String titulo;
    private String titulo_posgrado;
    private int impartido_clase;
    private String facultad;
    private String user;
    private String pass;

    public Docentes() {
    }

    public Docentes(String nombre, String apellido, int num_registro, String titulo, String titulo_posgrado, int impartido_clase, String facultad, String user, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_registro = num_registro;
        this.titulo = titulo;
        this.titulo_posgrado = titulo_posgrado;
        this.impartido_clase = impartido_clase;
        this.facultad = facultad;
        this.user = user;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo_posgrado() {
        return titulo_posgrado;
    }

    public void setTitulo_posgrado(String titulo_posgrado) {
        this.titulo_posgrado = titulo_posgrado;
    }

    public int getImpartido_clase() {
        return impartido_clase;
    }

    public void setImpartido_clase(int impartido_clase) {
        this.impartido_clase = impartido_clase;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
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
        return "Docentes{" + "nombre=" + nombre + ", apellido=" + apellido + ", num_registro=" + num_registro + ", titulo=" + titulo + ", titulo_posgrado=" + titulo_posgrado + ", impartido_clase=" + impartido_clase + ", facultad=" + facultad + ", user=" + user + ", pass=" + pass + '}';
    }

   
    
    
           
    
}
