/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Secundarios;

import Model.Medico;
import Model.Secundarios.Cita;
import Model.Secundarios.Paciente;

public class AgendaMedica {

    private Medico medicoLogueado;
    private Cita[] citas;
    private int count;

    public AgendaMedica(Medico medicoLogueado) {
        this.medicoLogueado = medicoLogueado;
        this.citas = new Cita[18];  // Máximo 18 citas
        this.count = 0;
    }

    // ====================================================
    //                 AGREGAR CITA A LA AGENDA
    // ====================================================
    public boolean AgregarCitaAgenda(Cita nuevaCita) {
        if (nuevaCita == null) return false;

        // Solo aceptar citas asignadas al médico logueado
        if (!nuevaCita.getMedico().getDNI().equals(medicoLogueado.getDNI())) {
            return false;
        }

        // Verificar espacio
        if (count < citas.length) {
            citas[count++] = nuevaCita;
            return true;
        }

        return false;
    }

    // ====================================================
    //                 ELIMINAR CITA (POR PACIENTE)
    // ====================================================
    public boolean eliminarCitaAgenda(Paciente paciente) {
        if (paciente == null) return false;

        for (int i = 0; i < count; i++) {
            Cita c = citas[i];

            if (c != null && c.getPaciente().getDni().equals(paciente.getDni())) {

                // Reemplazo por la última cita para compactar
                citas[i] = citas[count - 1];
                citas[count - 1] = null;
                count--;
                return true;
            }
        }

        return false;
    }

    // ====================================================
    //                    ACTUALIZAR CITA
    // ====================================================
    public boolean actualizarCitaAgenda(Cita citaNueva) {
        if (citaNueva == null) return false;

        for (int i = 0; i < count; i++) {
            Cita c = citas[i];

            if (c != null && c.getPaciente().getDni().equals(citaNueva.getPaciente().getDni())) {
                citas[i] = citaNueva;
                return true;
            }
        }

        return false;
    }

    // ====================================================
    //                 GETTERS
    // ====================================================
    public Medico getMedicoLogueado() {
        return medicoLogueado;
    }

    public Cita[] getCitas() {
        return citas;
    }

    public int getCount() {
        return count;
    }
}
