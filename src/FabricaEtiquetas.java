import java.util.HashMap;
import java.util.Map;

public class FabricaEtiquetas {
    private static Map<String, Etiqueta> etiquetas;

    private static void init() {
        etiquetas = new HashMap<String, Etiqueta>();
        etiquetas.put("Curti", new Etiqueta("Curti"));
        etiquetas.put("Amei", new Etiqueta("Amei"));
        etiquetas.put("Triste", new Etiqueta("Triste"));
        etiquetas.put("Feliz", new Etiqueta("Feliz"));
        etiquetas.put("Engracado", new Etiqueta("Engracado"));
    }

    public static Etiqueta get(String nome) {
        if (etiquetas == null)
            init();
        return etiquetas.get(nome);
    }
}
