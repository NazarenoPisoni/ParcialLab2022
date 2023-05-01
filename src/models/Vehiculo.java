package models;

public class Vehiculo {
    private String modelo;
    private Integer kilometraje;
    private String anio;
    private String codigo;
    private final int costoPorKm = 50;

    private final int tarifaDiaria = 1000;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String anio, String codigo) {
        this.modelo = modelo;
        this.anio = anio;
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", anio='" + anio + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    public int getCostoPorKm() {
        return costoPorKm;
    }
    public int getTarifaDiaria() {
        return tarifaDiaria;
    }
}
