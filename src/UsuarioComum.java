import java.util.ArrayList;
import java.util.List;

public class UsuarioComum extends Usuario {

    private List<Publicacao> publicacoes;
    private ExecutorComandos executorComandos;
    private String amigos = "";

    public UsuarioComum(String nome, String email, String senha, String dataNascimento) {
        super(nome, email, senha, dataNascimento);
        this.publicacoes = new ArrayList<Publicacao>();
        this.executorComandos = new ExecutorComandos();
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public ExecutorComandos getExecutorComandos() {
        return executorComandos;
    }

    public void setExecutorComandos(ExecutorComandos executorComandos) {
        this.executorComandos = executorComandos;
    }

    public void adicionarAmigo(String nome) {
        amigos = executorComandos.adicionarAmigo(new AdicionarAmigo(amigos, nome));
        System.out.println("\nAmigos: " + amigos);
    }

    public void removerAmigo() {
        amigos = executorComandos.removerAmigo();
        System.out.println("\nAmigos: " + amigos);
    }

    @Override
    public String toString() {
        return "UsuarioComum";
    }
}
