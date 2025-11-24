/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Secundarios.Consulta;
import Model.Secundarios.Paciente;
import Model.Medico;
import Model.Secundarios.Cita;
/**
 *
 * @author Alvaro
 */
public class GestionConsulta {
       private Consulta[] consultas;
    private int count;

    public GestionConsulta() {
        consultas = new Consulta[200]; 
        count = 0;
    }

    public boolean agregarConsulta(Consulta consulta) {
        if (count < consultas.length) {
            consultas[count++] = consulta;
            return true;
        }
        return false;
    }

    public Consulta[] buscarConsultasPorPaciente(String dniPaciente) {

        Consulta[] resultado = new Consulta[count];
        int idx = 0;

        for (int i = 0; i < count; i++) {
            Consulta c = consultas[i];

            if (c.getPaciente().getDni().equals(dniPaciente)) {
                resultado[idx++] = c;
            }
        }

        return resultado; 
    }

    public Consulta[] buscarConsultasPorMedico(Medico medico) {

        Consulta[] resultado = new Consulta[count];
        int idx = 0;

        for (int i = 0; i < count; i++) {
            Consulta c = consultas[i];

            if (c.getMedico().equals(medico)) {
                resultado[idx++] = c;
            }
        }

        return resultado;
    }

    public Consulta buscarConsultaPorCita(Cita cita) {

        for (int i = 0; i < count; i++) {
            if (consultas[i].getCita().equals(cita)) {
                return consultas[i];
            }
        }

        return null;
    }

    public boolean cerrarConsulta(Consulta consulta) {
        if (consulta != null && consulta.getEstado().equals("Abierta")) {
            consulta.cerrar();
            return true;
        }
        return false;
    }

    public boolean cerrarConsulta(String dniPaciente, String fechaHora) {
        for (int i = 0; i < count; i++) {
            Consulta c = consultas[i];

            if (c.getPaciente().getDni().equals(dniPaciente) &&
                c.getFechaHora().equals(fechaHora)) {

                c.cerrar();
                return true;
            }
        }
        return false;
    }

    public Consulta[] listarConsultas() {
        return consultas;
    }
}
