/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author renee
 */
public class Paciente {
    private String nss;
    private String nombre;

    public Paciente(String nss, String nombre) {
        this.nss = nss;
        this.nombre = nombre;
    }

    public Paciente() {
    }
    
    

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nss=" + nss + ", nombre=" + nombre + '}';
    }
    
    
}
