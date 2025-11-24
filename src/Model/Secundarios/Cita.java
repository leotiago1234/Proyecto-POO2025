/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Secundarios;

import Model.Medico;

/**
 *
 * @author Alvaro
 */
public class Cita {
    private String fechaHora, modalidad, estado;
    private Paciente paciente; 
    private Medico medico;
    private Consultorio consultorio; 
    
    public Cita(String fechaHora, String modalidad, String estado, 
                Paciente paciente, Medico medico, Consultorio consultorio) {

        this.fechaHora = fechaHora;
        this.modalidad = modalidad;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public Cita(String fechaHora, String modalidad, Paciente paciente,
                Medico medico, Consultorio consultorio) {

        this.fechaHora = fechaHora;
        this.modalidad = modalidad;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;

        this.estado = "Programada";
    }


    public String getFechaHora() { 
        return fechaHora; 
    }
    
    public String getModalidad() {
        
        return modalidad; 
    }
    public String getEstado() {
        return estado; 
    }
    
    public Paciente getPaciente() {
        return paciente; 
    }
    
    public Medico getMedico() { 
        return medico; 
    }
    
    public Consultorio getConsultorio() {
        return consultorio; 
    }

    public void confirmar()     
    { this.estado = "Confirmada"; }
    public void cancelar()      {
        this.estado = "Cancelada"; 
    }
    
    public void marcarEnSala()  {
        this.estado = "En sala";
    }
    
    public void marcarAtendida(){
        this.estado = "Atendida"; 
    }
    
    public void marcarNoShow()  {
        
        this.estado = "No show"; 
    }
}
