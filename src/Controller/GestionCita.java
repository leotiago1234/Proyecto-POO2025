/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Secundarios.Cita;
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

     public boolean AgregarCita(Cita c) {
        if (count < citas.length) {
            citas[count++] = c;
            return true;
        }
        return false;
    }

    public boolean ActualizarCita(Paciente paciente, Cita actualizada) {
        for (int i = 0; i < count; i++) {
            if (citas[i].getPaciente().equals(paciente)) {
                citas[i] = actualizada;
                return true;
            }
        }
        return false;
    }

    public boolean EliminarCita(Paciente paciente) {
        for (int i = 0; i < count; i++) {
            if (citas[i].getPaciente().equals(paciente)) {
                for (int j = i; j < count - 1; j++) {
                    citas[j] = citas[j + 1];
                }
                citas[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public Cita[] getCitas() {
        return citas;
    }

    public int getCount() {
        return count;
    }
    
}    

