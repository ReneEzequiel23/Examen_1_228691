/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import interfaces.Observer;
import java.util.List;
import modelo.Cita;
import modelo.Medico;
import modelo.Modelo;
import modelo.Paciente;

/**
 *
 * @author renee
 */
public class ControlCitas {

    private Modelo modelo;

    public ControlCitas() {
    }

    public ControlCitas(Modelo modelo) {
        this.modelo = modelo;
    }

    public void validarNSS(String nss) {
        if (modelo.validarPaciente(nss) != null) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }

    public Paciente getPacienteActual() {
        return modelo.getPacienteActual();
    }

    public void agregarObserver(Observer observer) {
        modelo.agregarObservers(observer);
    }

    public List<Medico> getMedicos() {
        return modelo.getMedicos();
    }

    
    public void seleccionarMedico(int indice) {
        modelo.seleccionarMedico(indice);
    }

    public Medico getMedicoSeleccionado() {
        return modelo.getMedicoSeleccionado();
    }

    public void registrarNuevaCita(int indiceMedico, String fecha, String hora) {
        Paciente pacienteActual = modelo.getPacienteActual();

        if (pacienteActual != null && indiceMedico >= 0) {
            Medico medicoSeleccionado = modelo.getMedicos().get(indiceMedico);
            modelo.agendarCita(pacienteActual, medicoSeleccionado, fecha, hora);
        }
    }

    
    public void agendarCita(String fecha, String hora) {
        modelo.agendarCita(fecha, hora);
    }

    public Cita getCitaReciente() {
        return modelo.getCitaReciente();
    }

}
