package model;

public class Empleado extends Persona {

    private String especialidad;
    private String turno;
    private String idiomas;

    public Empleado(String nombre, int edad, String rut, Direccion direccion, String especialidad, String turno, String idiomas) {
        super(nombre, edad, rut, direccion);

        this.especialidad = especialidad;
        this.turno = turno;
        this.idiomas = idiomas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return "Empleado: " + getNombre() +
               "\nEspecialidad: " + especialidad +
               "\nTurno: " + turno +
               "\nIdiomas: " + idiomas +
                "\n" + "_____________________________________________________" + "\n";
    }
}
