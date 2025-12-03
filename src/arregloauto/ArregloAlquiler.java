package arregloauto;

import auto.Alquiler;

public class ArregloAlquiler {

    private Alquiler[] alquileres;
    private int cantidad;
    private static final int MAXIMO = 100;

    public ArregloAlquiler() {
        alquileres = new Alquiler[MAXIMO];
        cantidad = 0;
    }

    public boolean agregarAlquiler(Alquiler nuevoAlquiler) {
        if (getCantidad() >= MAXIMO) {
            System.out.println("Error: No hay espacio para más alquileres");
            return false;
        }

        alquileres[getCantidad()] = nuevoAlquiler;
        cantidad++;
        return true;
    }

    public Alquiler[] obtenerTodos() {
        Alquiler[] lista = new Alquiler[getCantidad()];
        for (int i = 0; i < getCantidad(); i++) {
            lista[i] = alquileres[i];
        }
        return lista;
    }

    public double calcularTotalRecaudado() {
        double total = 0;
        for (int i = 0; i < getCantidad(); i++) {
            total += alquileres[i].getCostoTotal();
        }
        return total;
    }

    public int getCantidad() {
        return cantidad;
    }
}
