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
public class Alumnos {
    private String nombre;
    private String apellido;
    private int edad;
    private int num_registro;
    private int id;
    private String carrera;
    private int año_carrera;
    private String promedio;
    private String facultad;
    private String user;
    private String pass;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, int edad, int num_registro, int id, String carrera, int año_carrera, String promedio, String facultad, String user, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.num_registro = num_registro;
        this.id = id;
        this.carrera = carrera;
        this.año_carrera = año_carrera;
        this.promedio = promedio;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAño_carrera() {
        return año_carrera;
    }

    public void setAño_carrera(int año_carrera) {
        this.año_carrera = año_carrera;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
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
        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", num_registro=" + num_registro + ", id=" + id + ", carrera=" + carrera + ", a\u00f1o_carrera=" + año_carrera + ", promedio=" + promedio + ", facultad=" + facultad + ", user=" + user + ", pass=" + pass + '}';
    }
    
   

  
    
            
           
    
}
