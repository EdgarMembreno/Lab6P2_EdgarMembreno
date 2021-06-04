/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_edgarmembrenoo;

import java.util.ArrayList;

/**
 *
 * @author edgarmembreno
 */
public class Clases {

    private String nombre;
    private String seccion;
    private int codigo;
    private String codig_carrera;
    private int cantidad_alumnos;
    private int num_aula;
    private String user;
    private String pass;

    public Clases() {
    }

    public Clases(String nombre, String seccion, int codigo, String codig_carrera, int cantidad_alumnos, int num_aula,String user, String pass) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.codigo = codigo;
        this.codig_carrera = codig_carrera;
        this.cantidad_alumnos = cantidad_alumnos;
        this.num_aula = num_aula;
       
        this.user = user;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodig_carrera() {
        return codig_carrera;
    }

    public void setCodig_carrera(String codig_carrera) {
        this.codig_carrera = codig_carrera;
    }

    public int getCantidad_alumnos() {
        return cantidad_alumnos;
    }

    public void setCantidad_alumnos(int cantidad_alumnos) {
        this.cantidad_alumnos = cantidad_alumnos;
    }

    public int getNum_aula() {
        return num_aula;
    }

    public void setNum_aula(int num_aula) {
        this.num_aula = num_aula;
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
        return "Clases{" + "nombre=" + nombre + ", seccion=" + seccion + ", codigo=" + codigo + ", codig_carrera=" + codig_carrera + ", cantidad_alumnos=" + cantidad_alumnos + ", num_aula=" + num_aula +  ", user=" + user + ", pass=" + pass + '}';
    }

    

}
