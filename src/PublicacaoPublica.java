import java.util.List;

public class PublicacaoPublica extends Publicacao {
    private List<Usuario> amigos;
    private PropriedadesPerfil tipo;

    public PublicacaoPublica(List<Usuario> amigos, PropriedadesPerfil tipo) {
        this.amigos = amigos;
        this.tipo = tipo;
    }

    @Override
    public void addPropriedades(Perfil perfil) {
        perfil.addPropriedade(this.tipo, 1);
    }

}
