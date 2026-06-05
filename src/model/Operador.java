package model;

public class Operador {

    private String empresa;
    private String servicio;

    public Operador(String empresa, String servicio) {

        this.empresa = empresa;
        this.servicio = servicio;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return empresa + " (" + servicio  + ")";
    }
}
