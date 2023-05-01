import models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Sucursal suc1 = new Sucursal("Mar del Plata", "Av. Colón 3030", "2234914363");
        Sucursal suc2 = new Sucursal("La Plata", "Belgrano 7264", "2214614543");
        Sucursal suc3 = new Sucursal("Capital Federal", "Chacabuco 6383", "1147453937");
        Sucursal suc4 = new Sucursal("Neuquén", "Rivadavia 2649", "2994539462");
        AutoDosPuertas auto1 = new AutoDosPuertas("Ford Ka", "2000", "HFDOFDBD");
        AutoDosPuertas auto2 = new AutoDosPuertas("Renault Clio", "2004", "YFDTEBOK");
        AutoCuatroPuertas aut1 = new AutoCuatroPuertas("Ford Fiesta", "2003", "HFBFPSUS");
        AutoCuatroPuertas aut2 = new AutoCuatroPuertas("VW Vento", "2009", "UFHNSSBN");
        Camioneta cam1 = new Camioneta("Toyota Hilux", "2010", "UFDBYQOK");
        Camioneta cam2 = new Camioneta("VW Amarok", "2014", "HFNFLWPF");
        Cliente c1 = new Cliente("José Gómez", "22649583", true);
        Cliente c2 = new Cliente("Alejandro Gómez", "26484603", true);
        Cliente c3 = new Cliente("Lautaro Martínez", "37294488", true);

        suc1.alquilar(c1, cam1);
        suc1.alquilar(c2, auto2);
        suc1.alquilar(c3, auto1);

        suc1.devolver(c1, cam1, LocalDate.of(2023, 5, 15), 1200);
        suc1.getCostoTotal(c1, cam1);
        suc2.devolver(c2, auto2, LocalDate.of(2023, 5, 10), 500);
        suc2.getCostoTotal(c2, auto2);
        suc2.devolver(c3, auto1, LocalDate.of(2023, 5, 20), 200);
        suc2.getCostoTotal(c3, auto1);

        suc1.alquilerConMayorCosto();
        suc2.getCantidadAlquileresCamionetas();

    }
}