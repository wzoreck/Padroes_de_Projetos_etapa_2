import java.util.ArrayList;
import java.util.List;

public class AdicionarAmigo implements Comando {
    private String amigos;
    private String novoAmigo;

    public AdicionarAmigo(String amigos, String novoAmigo) {
        this.amigos = amigos;
        this.novoAmigo = novoAmigo;
    }

    @Override
    public String adicionar() {
        return amigos.concat(novoAmigo).concat(", ");
    }

    @Override
    public String remover() {
        return amigos;
    }
}
