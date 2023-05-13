package Empleados;

public class Mesero extends Empleado {
    public Mesero(String nombre, long documento, String contraseña){
        super(nombre, documento,contraseña);
        tipo_empleado = Empleado.MESERO;
    }

    @Override
    public int tipo_inter_grafica(){
        return 3;
    }
}
