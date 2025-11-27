/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Medico;
import Model.Secundarios.AgendaMedica;
import Model.Secundarios.Cita;
import Model.Secundarios.Paciente;
import java.util.HashMap;

public class GestionAgendaMedica {

    private HashMap<String, AgendaMedica> agendas; // DNI del médico → Agenda

    public GestionAgendaMedica() {
        agendas = new HashMap<>();
    }

    private AgendaMedica getAgendaDe(Medico medico) {
        if (medico == null) return null;

        String dni = medico.getDNI();

        if (!agendas.containsKey(dni)) {
            agendas.put(dni, new AgendaMedica(medico));
        }

        return agendas.get(dni);
    }

    public boolean agregarCita(Cita nueva) {

        if (nueva == null) return false;

        AgendaMedica agenda = getAgendaDe(nueva.getMedico());

        return agenda.AgregarCitaAgenda(nueva);
    }

    public boolean actualizarCita(Cita nueva) {

        if (nueva == null) return false;

        AgendaMedica agenda = getAgendaDe(nueva.getMedico());

        return agenda.actualizarCitaAgenda(nueva);
    }

    public boolean eliminarCita(Medico medico, Paciente paciente) {

        if (medico == null || paciente == null) return false;

        AgendaMedica agenda = getAgendaDe(medico);

        return agenda.eliminarCitaAgenda(paciente);
    }

    public AgendaMedica getAgendaMedicaDe(Medico medico) {
        return getAgendaDe(medico);
    }
}

