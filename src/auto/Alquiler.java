package auto;

public final class Alquiler {

    private String nombreCliente;
    private String placa;
    private Auto auto;
    private double kmInicial;
    private double kmFinal;
    private double costoTotal;
    private static double PRECIO_POR_KM = 1.10;

    public Alquiler(String nombreCliente, String placa, Auto auto,
            double kmInicial, double kmFinal) {
        this.nombreCliente = nombreCliente;
        this.placa = placa;
        this.auto = auto;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.costoTotal = calcularCostoTotal();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public Auto getAuto() {
        return auto;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public static double getPRECIO_POR_KM() {
        return PRECIO_POR_KM;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public static void setPRECIO_POR_KM(double aPRECIO_POR_KM) {
        PRECIO_POR_KM = aPRECIO_POR_KM;
    }

    public double calcularCostoTotal() {
        double kmRecorridos = getKmFinal() - getKmInicial();
        double costoBase = kmRecorridos * getPRECIO_POR_KM();
        int incremento = getAuto().getIncremento();
        double montoIncremento = costoBase * (incremento / 100.0);
        setCostoTotal(costoBase + montoIncremento);
        return getCostoTotal();
    }

    public static resultadoCreacion crearAlquilerValido(String nombreCliente, String placa, Auto auto, String kmInicialStr,
            String kmFinalStr) {

        if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
            return new resultadoCreacion(null, false, "El nombre del cliente no puede estar vacío");
        }

        String errorKmInicial = validarNumero(kmInicialStr, "KM Inicial");
        if (errorKmInicial != null) {
            return new resultadoCreacion(null, false, errorKmInicial);
        }

        String errorKmFinal = validarNumero(kmFinalStr, "KM Final");
        if (errorKmFinal != null) {
            return new resultadoCreacion(null, false, errorKmFinal);
        }

        double kmInicial = Double.parseDouble(kmInicialStr);
        double kmFinal = Double.parseDouble(kmFinalStr);

        if (kmInicial < 0) {
            return new resultadoCreacion(null, false, "El KM inicial tiene que ser positivo");
        }
        if (kmFinal < 0) {
            return new resultadoCreacion(null, false, "El KM final tiene que ser positivo");
        }

        if (kmFinal <= kmInicial) {
            return new resultadoCreacion(null, false, "El Km final tiene que ser mayor al KM inicial");
        }

        Alquiler alquiler = new Alquiler(nombreCliente, placa, auto, kmInicial, kmFinal);
        return new resultadoCreacion(alquiler, true, "Alquiler creado exitosamente");
    }

    private static String validarNumero(String valor, String campo) {

        if (valor == null || valor.trim().isEmpty()) {
            return campo + " no puede estar vacío";
        }

        valor = valor.trim();

        if (valor.equals(".") || valor.equals("-") || valor.equals("-.")
                || valor.equals("+") || valor.equals("+.")) {
            return campo + " debe ser un número válido, no solo '" + valor + "'";
        }

        boolean tienePunto = false;
        boolean tieneDigito = false;

        for (int i = 0; i < valor.length(); i++) {
            char c = valor.charAt(i);

            if (i == 0 && (c == '-' || c == '+')) {
            } else if (c == '.') {
                if (tienePunto) {
                    return campo + " no puede tener múltiples puntos decimales";
                }
                tienePunto = true;
            } else if (c >= '0' && c <= '9') {
                tieneDigito = true;
            } else {
                return campo + " contiene caracteres inválidos: '" + c + "'";
            }
        }

        if (!tieneDigito) {
            return campo + " debe contener al menos un dígito numérico";
        }

        return null;
    }

    public static boolean esNumeroValido(String valor) {
        return validarNumero(valor, "") == null;
    }
}
