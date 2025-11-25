/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Secundarios.Cita;
import Model.Secundarios.Consultorio;

/**
 *
 * @author Alvaro
 */
public class GestionConsultorio {
    private Consultorio[] consultorios;
    private int count;

    public GestionConsultorio() {
        consultorios = new Consultorio[100];
        count = 0;
    }
    
    public boolean AgregarCitaConsultorio(Consultorio consultorio, Cita nuevaCita) {
        if (consultorio == null || nuevaCita == null) {
            return false;
        }
        Cita[] cistas = consultorio.getCitas();
        int n = consultorio.getCantidadCitas();

        if (n >= cistas.length) {
            return false;
        }
        cistas[n] = nuevaCita;
        consultorio.setCantidadCitas(n + 1);
        return true;
    }
    
    public boolean EliminarCitaConsultorio(Consultorio consultorio, Cita citaEliminar) {
        if (consultorio == null || citaEliminar == null) {
            return false;
        }

        Cita[] citas = consultorio.getCitas();
        int nro = consultorio.getCantidadCitas();

        for (int i = 0; i < nro; i++) {
            if (citas[i] == citaEliminar) {
                citas[i] = citas[nro - 1];
                citas[nro - 1] = null;
                consultorio.setCantidadCitas(nro - 1);
                return true;
            }
        }
        return false;
    }
    
    public void ActualizarCita(Consultorio consultorio, Cita citaNueva) {
        Cita[] citas = consultorio.getCitas();
        for (int i = 0; i < citas.length; i++) {
            Cita c = citas[i];
            if (c != null && c.getPaciente().equals(citaNueva.getPaciente())) {
                citas[i] = citaNueva;
                return;
            }
        }
    }

    public boolean AgregarConsultorio(Consultorio c) {
        if (count < consultorios.length) {
            consultorios[count++] = c;
            return true;
        }
        return false;
    }


    public boolean ActualizarConsultorio(String codigo, Consultorio actualizado) {
        for (int i = 0; i < count; i++) {
            if (consultorios[i].getCodigo().equals(codigo)) {
                consultorios[i] = actualizado;
                return true;
            }
        }
        return false;
    }


    public boolean EliminarConsultorio(String codigo) {
        for (int i = 0; i < count; i++) {
            if (consultorios[i].getCodigo().equals(codigo)) {

                for (int j = i; j < count - 1; j++) {
                    consultorios[j] = consultorios[j + 1];
                }

                consultorios[count - 1] = null;
                count--;

                return true;
            }
        }
        return false;
    }
    
    
    public Consultorio[] getConsultorios() {
        return consultorios;
    }

    public int getCount() {
        return count;
    }


}

