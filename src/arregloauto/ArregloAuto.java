package arregloauto;

import auto.Auto;

public class ArregloAuto {

    private Auto[] autos;
    private int cantidad;
    private static final int MAXIMO = 100;

    public ArregloAuto() {
        autos = new Auto[MAXIMO];
        cantidad = 0;

        agregarAuto(new Auto("ABC-123", "Corolla 2020", "Toyota", "Sedan"));
        agregarAuto(new Auto("DEF-456", "Hilux 2021", "Toyota", "Camioneta"));
        agregarAuto(new Auto("GHI-789", "Grand Caravan 2019", "Dodge", "Minivan"));
    }

    public boolean agregarAuto(Auto nuevoAuto) {

        if (getCantidad() >= MAXIMO) {
            System.out.println("Error: No hay espacio para más autos");
            return false;
        }

        if (buscar(nuevoAuto.getPlaca()) != null) {
            System.out.println("Error: Ya existe un auto con esa placa");
            return false;
        }

        autos[getCantidad()] = nuevoAuto;
        cantidad++;
        return true;
    }

    public Auto buscar(String placa) {
        for (int i = 0; i < getCantidad(); i++) {
            if (autos[i].getPlaca().equalsIgnoreCase(placa)) {
                return autos[i];
            }
        }
        return null;
    }

    public int getCantidad() {
        return cantidad;
    }

}
