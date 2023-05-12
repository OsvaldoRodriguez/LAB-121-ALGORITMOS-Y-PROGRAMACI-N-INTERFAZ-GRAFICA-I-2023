
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Institucion implements Serializable{
    private int codigo; // identificador
    private String nombre;
    private String ubicaccion;
    private Pila p = new Pila();

    Institucion(){
        
    }
    
    public int getNewCodigo(){
        
        return 1;
    }
    
    public Institucion(String nombre, String ubicaccion, Pila p) {
        this.nombre = nombre;
        this.ubicaccion = ubicaccion;
        this.p = p;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicaccion() {
        return ubicaccion;
    }

    public void setUbicaccion(String ubicaccion) {
        this.ubicaccion = ubicaccion;
    }

    public Pila getP() {
        return p;
    }

    public void setP(Pila p) {
        this.p = p;
    }
    
    
    
    
    
    
}
