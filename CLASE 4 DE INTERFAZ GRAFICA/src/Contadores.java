
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class Contadores implements Serializable {
    private int codigoInstitucion;
    private int codigoEmpleado;
    private int codigoAmbiente;
    
    Contadores(){
        codigoAmbiente = 0;
        codigoEmpleado = 0;
        codigoInstitucion = 0;
    }
    
    
    
    public int getCodigoInstitucion() {
        return codigoInstitucion;
    }

    public void setCodigoInstitucion(int codigoInstitucion) {
        this.codigoInstitucion = codigoInstitucion;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getCodigoAmbiente() {
        return codigoAmbiente;
    }

    public void setCodigoAmbiente(int codigoAmbiente) {
        this.codigoAmbiente = codigoAmbiente;
    }
    
}





