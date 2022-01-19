import java.util.ArrayList;
import java.util.List;

public class ExecutorComandos {

    private List<Comando> adicionados;

    public ExecutorComandos() {
        super();
        this.adicionados = new ArrayList<Comando>();
    }

    public String adicionarAmigo(Comando c) {
        adicionados.add(c);
        return c.adicionar();
    }

    public String removerAmigo() {
        if (adicionados.isEmpty())
            return "";

        Comando c = adicionados.remove(adicionados.size()-1);
        return c.remover();
    }

    public List<Comando> getAdicionados() {
        return this.adicionados;
    }

}
