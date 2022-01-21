public class Etiqueta implements  EtiquetaInterface {
    private final String titulo;

    public Etiqueta(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getEtiqueta() {
        return this.titulo;
    }
}
