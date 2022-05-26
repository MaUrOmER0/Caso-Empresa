package test;

import modelo.Empleados;

public class Test{
public static void main(String[] args) {
    
    Empleados empleado = new Empleados();
    empleado.setIdentificacion(10002030);
    empleado.setApellidos("Sarmiento Contreras");
    empleado.setNombre("Raul");
    empleado.setHorasTrabajadas(12);
    empleado.setValorHora(2000);
    System.out.println(empleado);
    }
}