/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Secundarios;

import Model.Medico;

public class Consulta {

    private String tipoConsulta;

    private String motivo;
    private String estado;
    private String antecedentes;
    private String signosVitales;
    private String examenFisico;
    private String diagnostico;
    private String plan,codigo;

    private double precio;

    private Receta receta;

    private Orden[] ordenes;
    private int countOrdenes;

    private String fechaHora;

    private Paciente paciente;
    private Medico medico;
    private Cita cita;
    

    public Consulta(String tipoConsulta,
                    String motivo, String antecedentes,
                    String signosVitales, String examenFisico,
                    String diagnostico, String plan,
                    double precio,
                    String fechaHora,
                    Paciente paciente, Medico medico, Cita cita) {

        this.tipoConsulta = tipoConsulta;
        this.motivo = motivo;
        this.antecedentes = antecedentes;
        this.signosVitales = signosVitales;
        this.examenFisico = examenFisico;
        this.diagnostico = diagnostico;
        this.plan = plan;

        this.precio = precio;
        this.fechaHora = fechaHora;

        this.paciente = paciente;
        this.medico = medico;
        this.cita = cita;

        this.estado = "Abierta";

        this.ordenes = new Orden[20];
        this.countOrdenes = 0;
    }


    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public String getSignosVitales() {
        return signosVitales;
    }

    public String getExamenFisico() {
        return examenFisico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getPlan() {
        return plan;
    }

    public String getFechaHora() {
        return fechaHora;
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

    public Cita getCita() {
        return cita;
    }

    public Receta getReceta() {
        return receta;
    }

    public Orden[] getOrdenes() {
        return ordenes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void agregarDiagnostico(String d) { 
        this.diagnostico = d; 
    }

    public void agregarPlan(String p) {
        this.plan = p;
    }

    public void agregarSignosVitales(String sv) {
        this.signosVitales = sv;
    }

    public void agregarExamenFisico(String ef) {
        this.examenFisico = ef;
    }


    public boolean agregarOrden(Orden o) {
        if (countOrdenes < ordenes.length) {
            ordenes[countOrdenes++] = o;
            return true;
        }
        return false;
    }

    public void asignarReceta(Receta r) {
        this.receta = r;
    }


    public void cerrar() {
        this.estado = "Cerrada";
    }


    @Override
    public String toString() {
        return tipoConsulta + " | " +
               paciente.getNombres() + " | " +
               fechaHora + " | S/ " + precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCountOrdenes() {
        return countOrdenes;
    }

    public void setCountOrdenes(int countOrdenes) {
        this.countOrdenes = countOrdenes;
    }
    
    
}


