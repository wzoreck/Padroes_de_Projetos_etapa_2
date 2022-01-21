import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Perfil {
    private List<Publicacao> publicacoes;
    private Map<PropriedadesPerfil, Integer> propriedades;

    public void addPublicacao(Publicacao publicacao) {
        getPublicacoes().add(publicacao);
        publicacao.addPropriedades(this);
    }

    public void addPropriedade(PropriedadesPerfil tipo, int valor) {
        getPropriedades().put(tipo, getPropriedades().get(tipo) + valor);
    }

    public void getTotalPublicacoes() {
        System.out.println("Total Publicacoes Comuns: " + getPropriedades().get(PropriedadesPerfil.PUBLICACAO));
    }

    public void getTotalStatus() {
        System.out.println("Total Status: " + getPropriedades().get(PropriedadesPerfil.STATUS));
    }

    public void getTotalStory() {
        System.out.println("Total Story: " + getPropriedades().get(PropriedadesPerfil.STORY));
    }

    private List<Publicacao> getPublicacoes() {
        if (publicacoes == null)
            publicacoes = new ArrayList<Publicacao>();
        return publicacoes;
    }

    private Map<PropriedadesPerfil, Integer> getPropriedades() {
        if (propriedades == null) {
            propriedades = new HashMap<PropriedadesPerfil, Integer>();
            for (PropriedadesPerfil tipo : PropriedadesPerfil.values())
                propriedades.put(tipo, 0);
        }
        return propriedades;
    }
}
