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

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public String getMenError() {
        return menError;
    }

    public void setMenError(String menError) {
        this.menError = menError;
    }

    @Override
    public String toString() {
        return "resultadoCreacion{"
                + "alquiler=" + getAlquiler()
                + ", exito=" + isExito()
                + ", menError='" + getMenError() + '\''
                + '}';
    }
}
