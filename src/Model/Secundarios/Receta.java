/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Secundarios;

/**
 *
 * @author Alvaro
 */
public class Receta {
    private Medicamento[] medicamentos;
    private int nroRecetas;

    public Receta(int cantidad) {
        this.medicamentos = new Medicamento[cantidad];
        this.nroRecetas = 0;
    }
    
    public boolean AgregarMedicamento(Medicamento ref){
        if(nroRecetas < medicamentos.length){
            medicamentos[nroRecetas] = ref;
            nroRecetas++;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean EliminarMedicamento(String Nombre){
        for(int i = 0; i < nroRecetas; i++){
            if(medicamentos[i].getNombre().equals(Nombre)){
                for(int j = i; j < nroRecetas - 1; j++){
                    medicamentos[j] = medicamentos[j+1];
                }
                medicamentos[nroRecetas - 1] = null;
                nroRecetas--;
                return true;
            }
        }
        return false;
    }
    
    public boolean EditarMedicamento(String Nombre, Medicamento nuevo){
        for(int i = 0; i < nroRecetas; i++){
            if(medicamentos[i].getNombre().equals(Nombre)){
                medicamentos[i] = nuevo;
                return true;
            }
        }
        return false;
    }
    
    
}
