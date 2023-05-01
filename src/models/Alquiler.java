package models;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Alquiler {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double costoTotal;

    public Alquiler() {
    }

    public Alquiler(LocalDate fechaInicio, Cliente cliente, Vehiculo vehiculo) {
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getCostoTotal() {
        return (vehiculo.getCostoPorKm() * vehiculo.getKilometraje()) + (vehiculo.getTarifaDiaria() * getCantidadDias());
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "Fecha de Inicio = " + fechaInicio +
                ", Fecha de Fin = " + fechaFin +
                ", Cliente = " + cliente.getNombre() +
                ", Vehículo = " + vehiculo.getModelo() +
                ", Costo Total = " + getCostoTotal() +
                '}';
    }

    public int getCantidadDias(){
        int cantidadDias = (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        return cantidadDias;
    }
}
