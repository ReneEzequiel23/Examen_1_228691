/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import interfaces.Observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author renee
 */
public class Modelo {

    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicosDB = new ArrayList<>();
    private List<Cita> citasRegistradas = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private Paciente pacienteActual = null;
    private Medico medicoSeleccionado = null;
    private Cita citaReciente = null;

    public Modelo() {
        pacientes.add(new Paciente("12345678910", "rene"));

        Medico medico1 = new Medico("1", "Octavio", "Pediatría");

        Consultorio cons1A = new Consultorio("C1", "1A");
        medico1.setConsultorio(cons1A);
        cons1A.setMedico(medico1);

        Map<String, List<String>> horarioMed1 = new HashMap<>();
        horarioMed1.put("L", Arrays.asList("09:00", "14:30", "15:00"));
        horarioMed1.put("M", Arrays.asList("10:00", "16:00"));
        medico1.setDisponibilidad(horarioMed1);

        medicosDB.add(medico1);

        Medico medico2 = new Medico("2", "Polo", "Cardiologo");

        Consultorio cons1b = new Consultorio("D1", "1B");
        medico2.setConsultorio(cons1b);
        cons1b.setMedico(medico2);

        Map<String, List<String>> horarioMed2 = new HashMap<>();
        horarioMed2.put("L", Arrays.asList("09:00", "14:30"));
        horarioMed2.put("M", Arrays.asList("10:00", "16:00"));
        horarioMed2.put("Mi", Arrays.asList("13:00"));
        medico2.setDisponibilidad(horarioMed2);

        medicosDB.add(medico2);
    }

    public void agregarObservers(Observer observer) {
        this.observers.add(observer);
    }

    public void notificar() {
        for (Observer obr : observers) {
            obr.update();
        }
    }

    public Paciente validarPaciente(String nss) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNss().equalsIgnoreCase(nss)) {

                this.pacienteActual = pacientes.get(i);
                notificar();
                return pacientes.get(i);
            }
        }
        return null;
    }

    public Paciente getPacienteActual() {
        return this.pacienteActual;
    }

    public List<Medico> getMedicos() {
        return this.medicosDB;
    }

    public void seleccionarMedico(int indice) {
        if (indice >= 0 && indice < medicosDB.size()) {
            this.medicoSeleccionado = medicosDB.get(indice);
            notificar();
        }
    }

    public Medico getMedicoSeleccionado() {
        return this.medicoSeleccionado;
    }

    public void agendarCita(Paciente paciente, Medico medico, String fecha, String hora) {
        Cita nuevaCita = new Cita(paciente, medico, hora, fecha);
        this.citasRegistradas.add(nuevaCita);

        System.out.println("Cita registrada para: " + paciente.getNombre() + " con el doctor " + medico.getNombre());
    }

    public void agendarCita(String fecha, String hora) {
        if (pacienteActual != null && medicoSeleccionado != null) {

            citaReciente = new Cita(pacienteActual, medicoSeleccionado, hora, fecha);
            citasRegistradas.add(citaReciente);

            notificar();
        }
    }

    public Cita getCitaReciente() {
        return this.citaReciente;
    }
}
