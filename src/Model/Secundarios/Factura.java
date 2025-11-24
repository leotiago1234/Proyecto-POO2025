/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Secundarios;

import java.util.Date;

/**
 *
 * @author leonardorodriguez
 */
public class Factura {
    private String numeroFactura;
    private Date fecha;

    private Paciente paciente;
    private Consulta consulta;

    private double montoTotal;
    private String estado; 
    private String metodoPago; 

    private String[] detalles;
    private int countDetalles;

    public Factura(String numeroFactura, Paciente paciente, Consulta consulta, String metodoPago) {
        this.numeroFactura = numeroFactura;
        this.paciente = paciente;
        this.consulta = consulta;
        this.metodoPago = metodoPago;

        this.fecha = new Date();   
        this.estado = "Pendiente";  

        this.detalles = new String[20];
        this.countDetalles = 0;

        calcularMontoTotal();
    }

    public boolean agregarDetalle(String detalle) {
        if (countDetalles < detalles.length) {
            detalles[countDetalles++] = detalle;
            return true;
        }
        return false;
    }

    private void calcularMontoTotal() {

        double total = 0;

        if (consulta != null) {
            total += consulta.getPrecio();
        }

        if (consulta != null || consulta.getOrdenes() != null) {
            Orden[] ordenes = consulta.getOrdenes();

            for (Orden o : ordenes) {
                if (o != null) {
                    total += o.getPrecio();  
                }
            }
        }

        this.montoTotal = total;
    }

    public void pagar() {
        this.estado = "Pagada";
    }

    public void anular() {
        this.estado = "Anulada";
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String[] getDetalles() {
        return detalles;
    }
    
    
}
