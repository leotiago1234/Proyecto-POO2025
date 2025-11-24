/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Secundarios.Factura;

/**
 *
 * @author Alvaro
 */
public class GestionFactura {
    private Factura[] facturas;
    private int count;

    public GestionFactura() {
        facturas = new Factura[200];
        count = 0;
    }

    public boolean agregarFactura(Factura f) {
        if (count < facturas.length) {
            facturas[count++] = f;
            return true;
        }
        return false;
    }


    public Factura buscarPorNumero(String numeroFactura) {
        for (int i = 0; i < count; i++) {
            if (facturas[i].getNumeroFactura().equals(numeroFactura)) {
                return facturas[i];
            }
        }
        return null;
    }


    public Factura[] buscarPorDniPaciente(String dniPaciente) {

        Factura[] resultado = new Factura[count];
        int idx = 0;

        for (int i = 0; i < count; i++) {
            Factura f = facturas[i];

            if (f.getPaciente().getDni().equals(dniPaciente)) {
                resultado[idx++] = f;
            }
        }

        return resultado;
    }


    public Factura[] buscarPorEstado(String estado) {

        Factura[] resultado = new Factura[count];
        int idx = 0;

        for (int i = 0; i < count; i++) {
            Factura f = facturas[i];

            if (f.getEstado().equalsIgnoreCase(estado)) {
                resultado[idx++] = f;
            }
        }

        return resultado;
    }


    public boolean pagarFactura(String numeroFactura) {

        Factura f = buscarPorNumero(numeroFactura);

        if (f != null && !f.getEstado().equals("Pagada")) {
            f.pagar();
            return true;
        }
        return false;
    }


    public boolean anularFactura(String numeroFactura) {

        Factura f = buscarPorNumero(numeroFactura);

        if (f != null && !f.getEstado().equals("Anulada")) {
            f.anular();
            return true;
        }
        return false;
    }


    public Factura[] listarFacturas() {
        return facturas;
    }
}
