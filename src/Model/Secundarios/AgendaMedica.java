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
public class AgendaMedica {
    private Medico medico;
    private String diaSemana;

    private Cita[] citas;

    public AgendaMedica(Medico medico, String diaSemana) {
        this.medico = medico;
        this.diaSemana = diaSemana;
        this.citas = new Cita[16];
    }

    // getters y setters...
}
