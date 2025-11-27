/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Secundarios.Paciente;

/**
 *
 * @author Alvaro
 */
public class GestionPacientes {
    private  Paciente[] pacientes;
    private int count;
            
     public GestionPacientes () {
        pacientes = new Paciente[200];
        count = 0;
    }


    public boolean AgregarPaciente(Paciente p) {
        if (count < pacientes.length) {
            pacientes[count++] = p;
            return true;
        }
        return false;
    }

    public boolean ActualizarPaciente(String dni, Paciente actualizado) {
        for (int i = 0; i < count; i++) {
            if (pacientes[i].getDni().equals(dni)) {
                pacientes[i] = actualizado; 
                return true;
            }
        }
        return false;
    }

    public boolean EliminarPaciente(String dni) {
        for (int i = 0; i < count; i++) {
            if (pacientes[i] != null && pacientes[i].getDni().equals(dni)) {
                for (int j = i; j < count - 1; j++) {
                    pacientes[j] = pacientes[j + 1];
                }
                pacientes[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public int getCount() {
        return count;
    }

    
}
