package auto;

public class Auto {

    private String placa;
    private String modelo;
    private String marca;
    private String tipo;

    public Auto(String placa, String modelo, String marca, String tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIncremento() {
        if (getTipo().equalsIgnoreCase("Sedan")) {
            return 0;
        } else if (getTipo().equalsIgnoreCase("Camioneta")) {
            return 3;
        } else if (getTipo().equalsIgnoreCase("Minivan")) {
            return 4;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Auto{placa='%s', modelo='%s', marca='%s', tipo='%s'}", getPlaca(), getModelo(), getMarca(), getTipo());
    }
}
