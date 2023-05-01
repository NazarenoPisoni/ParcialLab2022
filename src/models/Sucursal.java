package models;
import java.time.LocalDate;
import java.util.ArrayList;

public class Sucursal {
    private String ciudad;
    private String direccion;
    private String telefono;
    private static ArrayList<Alquiler> alquileres = new ArrayList<>();

    public Sucursal() {
    }

    public Sucursal(String ciudad, String direccion, String telefono) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
    public void alquilar(Cliente c, Vehiculo v){

        if(c.isTieneRegistro()){
            alquileres.add(new Alquiler(LocalDate.now(), c, v));
        }else{
            System.out.println("Debe tener registro de conducir para poder alquilar un vehículo.");
        }
    }

    public void devolver(Cliente c, Vehiculo v, LocalDate fechaDevolucion, int kms){
        for(int i=0; i<alquileres.size(); i++){
            if(alquileres.get(i).getCliente().equals(c) && alquileres.get(i).getVehiculo().equals(v)){
                alquileres.get(i).setFechaFin(fechaDevolucion);
                alquileres.get(i).getVehiculo().setKilometraje(kms);
            }
        }
    }

    public void alquilerConMayorCosto(){
        Alquiler mayor = new Alquiler();
        if(alquileres.get(0) != null){
            mayor = alquileres.get(0);
            for(int i=0;  i<alquileres.size(); i++){
                if(alquileres.get(i).getCostoTotal() > mayor.getCostoTotal()){
                    mayor = alquileres.get(i);
                }
            }
        }
        System.out.println("El Alquiler con mayor costo fue: " + mayor.toString());
    }

    public void getCantidadAlquileresAutos2P(){
        int cantidad = 0;
        for(Alquiler a : alquileres){
            if(a.getVehiculo() instanceof AutoDosPuertas){
                cantidad++;
            }
        }
        System.out.println("Se alquilaron " + cantidad + " Autos de dos puertas.");
    }
    public void getCantidadAlquileresAutos4P(){
        int cantidad = 0;
        for(Alquiler a : alquileres){
            if(a.getVehiculo() instanceof AutoCuatroPuertas){
                cantidad++;
            }
        }
        System.out.println("Se alquilaron " + cantidad + " Autos de cuatro puertas.");
    }
    public void getCantidadAlquileresCamionetas(){
        int cantidad = 0;
        for(Alquiler a : alquileres){
            if(a.getVehiculo() instanceof Camioneta){
                cantidad++;
            }
        }
        System.out.println("Se alquilaron " + cantidad + " Camionetas.");
    }

    public void getCostoTotal(Cliente c, Vehiculo v){
        Alquiler a = new Alquiler();
        for(int i=0; i<alquileres.size(); i++){
            if(alquileres.get(i).getCliente().equals(c) && alquileres.get(i).getVehiculo().equals(v)){
                a = alquileres.get(i);
            }
        }
        System.out.println("El costo Total para el Cliente " + a.getCliente().getNombre() + " por el alquiler del vehículo "
            + a.getVehiculo().getModelo() + " es de $" + a.getCostoTotal());
    }
}
