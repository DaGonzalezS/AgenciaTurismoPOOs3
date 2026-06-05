package app;

import model.Direccion;
import model.Empleado;
import model.Persona;
import model.Cliente;
import model.Operador;

public class Main {
    public static void main(String[] args) {

        Direccion direccion0 = new Direccion();
        Direccion direccion1 = new Direccion("Zaragoza 1197", "Santiago de Chile");
        Operador operador1 = new Operador("PatagonTours", "Guía turístico");
        Cliente cliente1 = new Cliente("Daniel González", 25, "20.900.609-K", direccion1, "A01", operador1);
        Empleado empleado1 = new Empleado("Felipe Salinas", 31, "18.256.145-K", direccion0, "Turismo cultural", "AM", "Español, Inglés");

        System.out.println(cliente1);
        System.out.println(empleado1);

        Direccion direccion2 = new Direccion("Central Oriente 966", "Santiago de Chile");
        Operador operador2 = new Operador("PatagonTours", "Senderismo");
        Cliente cliente2 = new Cliente("Ignacia Castro", 22, "21.099.066-9", direccion2, "A02", operador2);
        Empleado empleado2 = new Empleado("José Martinez", 26, "20.676.259-0", direccion0, "Senderismo", "AM", "Español, Inglés, Portugués");

        System.out.println(cliente2);
        System.out.println(empleado2);

        Direccion direccion3 = new Direccion("Central Oriente 966", "Santiago de Chile");
        Operador operador3 = new Operador("PatagonTours", "Senderismo");
        Cliente cliente3 = new Cliente("Fernanda Castro", 27, "19.999.066-9", direccion2, "A03", operador2);
        Empleado empleado3 = new Empleado("José Martinez", 26, "20.676.259-0", direccion0, "Senderismo", "AM", "Español, Inglés, Portugués");

        System.out.println(cliente3);
        System.out.println(empleado3);

    }
}