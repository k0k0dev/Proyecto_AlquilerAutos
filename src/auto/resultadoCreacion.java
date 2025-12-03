package auto;

public class resultadoCreacion {

    private Alquiler alquiler;
    private boolean exito;
    private String menError;

    public resultadoCreacion(Alquiler alquiler, boolean exito, String menError) {
        this.alquiler = alquiler;
        this.exito = exito;
        this.menError = menError;

    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMenError() {
        return menError;
    }

    
}
