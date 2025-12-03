package auto;



public class Alquiler {

    private String nombreCliente;
    private String placa;
    private Auto auto;
    private double kmInicial;
    private double kmFinal;
    private double costoTotal;

    private static double PRECIO_POR_KM = 1.10;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, String placa, Auto auto,
            double kmInicial, double kmFinal) {
        this.nombreCliente = nombreCliente;
        this.placa = placa;
        this.auto = auto;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.costoTotal = calcularCostoTotal();
    }

    public double calcularCostoTotal() {

        double kmRecorridos = getKmFinal() - getKmInicial();

        double costoBase = kmRecorridos * getPRECIO_POR_KM();

        int incremento = getAuto().getIncremento();

        double montoIncremento = costoBase * (incremento / 100.0);

        setCostoTotal(costoBase + montoIncremento);

        return getCostoTotal();
    }

    public double getKmRecorridos() {
        return getKmFinal() - getKmInicial();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public static double getPRECIO_POR_KM() {
        return PRECIO_POR_KM;
    }

    public static void setPRECIO_POR_KM(double aPRECIO_POR_KM) {
        PRECIO_POR_KM = aPRECIO_POR_KM;
    }

}
