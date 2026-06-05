package model;

public class Cliente extends Persona {

    private String ticket;
    private Operador operador;

    public Cliente(String nombre, int edad, String rut, Direccion direccion, String ticket, Operador operador) {
        super (nombre, edad, rut, direccion);

        this.ticket = ticket;
        this.operador = operador;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
                "\nEdad: " + getEdad() +
                "\nRut: " + getRut() +
                "\nDireccion: " + getDireccion() +
                "\nTicket: " + ticket +
                "\n" + "\n" +
                "\nOperador: " + operador;
    }
}
