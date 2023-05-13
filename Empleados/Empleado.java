package Empleados;

public abstract class Empleado {
    protected static final String GERENTE = "Gerente";
    protected static final String MESERO = "Mesero";
    protected static final String ADMINISTRADOR = "Administrador";
    protected static final String COCINERO = "Cocinero";
    protected String nombre;
    protected long numero_documento;
    protected String tipo_empleado;
    protected String contraseña;
    protected String nombre_usuario;
    
    //Constructor para ingresar datos 
    protected Empleado(String nombre, long documento, String nombre_usuario, String contraseña){
        this.nombre = nombre;
        this.numero_documento = documento;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
    }

    //Constructor para cargar el objeto de tipo empleado
    protected Empleado(Empleado em){
        nombre = em.nombre;
        numero_documento = em.numero_documento;
        tipo_empleado = em.tipo_empleado;
        nombre_usuario = em.nombre_usuario;
        contraseña = em.contraseña;
    }

    //Metodo a implementar
    abstract public int tipo_inter_grafica();
}
