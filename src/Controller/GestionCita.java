/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Medico;
import Model.Secundarios.Cita;
import Model.Secundarios.Consultorio;
import Model.Secundarios.Paciente;

/**
 *
 * @author Alvaro
 */
public class GestionCita {
    private Cita[] citas;
    private int count;
    

    public GestionCita() {
        citas = new Cita[100];
        count = 0;
    }

     public boolean agregarCita(Cita c) {
        if (count < citas.length) {
            citas[count++] = c;
            return true;
        }
        return false;
    }

    public Cita buscarCita(String dniPaciente, String fechaHora) {
        for (int i = 0; i < count; i++) {
            Cita c = citas[i];
            if (c.getPaciente().getDni().equals(dniPaciente) &&
                c.getFechaHora().equals(fechaHora)) {
                return c;
            }
        }
        return null;
    }

    public boolean cancelarCita(String dniPaciente, String fechaHora) {
        Cita c = buscarCita(dniPaciente, fechaHora);
        if (c != null) {
            c.cancelar();
            return true;
        }
        return false;
    }
    
    public Cita[] listarCitas() {
        return citas;
    }

    public boolean validarDisponibilidad(Medico medico, Consultorio consultorio, String fechaHora) {

        for (int i = 0; i < count; i++) {
            Cita c = citas[i];

            if (c.getMedico().equals(medico) &&
                c.getFechaHora().equals(fechaHora) &&
                !c.getEstado().equals("Cancelada")) {
                return false;
            }

            if (c.getConsultorio().equals(consultorio) &&
                c.getFechaHora().equals(fechaHora) &&
                !c.getEstado().equals("Cancelada")) {
                return false;
            }
        }

        return true;
    }
}
