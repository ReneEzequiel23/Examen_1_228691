/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import java.util.Map;

/**
 *
 * @author renee
 */
public class Medico {
    private String id;
    private String nombre;
    private String especialidad;
    private Consultorio consultorio;
    private Map<String, List<String>> disponibilidad;

    public Medico(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public Medico(String id, String nombre, String especialidad, Consultorio consultorio, Map<String, List<String>> disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.disponibilidad = disponibilidad;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Map<String, List<String>> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Map<String, List<String>> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
