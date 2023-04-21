
public class Empleado extends Persona  {
    private double sueldo;

    public Empleado(){
    }
    public Empleado(String nombre, String apellido, String fecha_nac, String sexo, int edad, double sueldo) {
        super(nombre, apellido, fecha_nac, sexo, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }    
}
