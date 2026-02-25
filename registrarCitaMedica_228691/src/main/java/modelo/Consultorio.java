/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renee
 */
public class Consultorio {
    private String idConsultorio;
    private Medico medico;
    private String nombreConsultorio;
    private List<Cita> citas;

    public Consultorio() {
    }

    public Consultorio(String idConsultorio, String nombreConsultorio) {
        this.idConsultorio = idConsultorio;
        this.nombreConsultorio = nombreConsultorio;
        this.citas = new ArrayList<>();
    }
    
    public Consultorio(String idConsultorio, Medico medico, String nombreConsultorio, List<Cita> citas) {
        this.idConsultorio = idConsultorio;
        this.medico = medico;
        this.nombreConsultorio = nombreConsultorio;
        this.citas = citas;
    }

    public String getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(String idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getNombreConsultorio() {
        return nombreConsultorio;
    }

    public void setNombreConsultorio(String nombreConsultorio) {
        this.nombreConsultorio = nombreConsultorio;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
    
    
}
