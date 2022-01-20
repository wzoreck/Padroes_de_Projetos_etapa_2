import java.util.List;

public class PublicacaoPrivada extends Publicacao {
    private List<Usuario> amigosProximos;
    private PropriedadesPerfil tipo;

    public PublicacaoPrivada(List<Usuario> amigosProximos, PropriedadesPerfil tipo) {
        this.amigosProximos = amigosProximos;
        this.tipo = tipo;
    }

    @Override
    public void addPropriedades(Perfil perfil) {
        perfil.addPropriedade(this.tipo, 1);
    }
}
