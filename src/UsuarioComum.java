import java.util.ArrayList;
import java.util.List;

public class UsuarioComum extends Usuario {

    private List<Publicacao> publicacoes;

    public UsuarioComum(String nome, String email, String senha, String dataNascimento) {
        super(nome, email, senha, dataNascimento);
        this.publicacoes = new ArrayList<Publicacao>();
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
}
