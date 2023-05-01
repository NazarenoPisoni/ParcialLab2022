package models;

public class Cliente {
    private String nombre;
    private String dni;
    private boolean tieneRegistro;

    public Cliente() {
    }

    public Cliente(String nombre, String dni, boolean tieneRegistro) {
        this.nombre = nombre;
        this.dni = dni;
        this.tieneRegistro = tieneRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isTieneRegistro() {
        return tieneRegistro;
    }

    public void setTieneRegistro(boolean tieneRegistro) {
        this.tieneRegistro = tieneRegistro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tieneRegistro=" + tieneRegistro +
                '}';
    }
}
