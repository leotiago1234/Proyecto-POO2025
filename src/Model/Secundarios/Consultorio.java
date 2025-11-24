/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Secundarios;

/**
 *
 * @author Alvaro
 */
public class Consultorio {
    private String codigo, especialidad, estado;
    private Cita[] citas;
    
     public Consultorio(String codigo, String especialidad, String estado, Cita citas) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado; 
        this.citas = new Cita[20];
    }


    public String getCodigo() {
        return codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public Cita[] getCitas() {
        return citas;
    }
    

}
