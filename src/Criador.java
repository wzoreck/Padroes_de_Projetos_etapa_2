import java.util.List;

public interface Criador {
    public UsuarioComum criarUsuarioComum(String nome, String email, String senha, String dataNascimento);
    public UsuarioAdmin criarUsuarioAdmin(String nome, String email, String senha, String dataNascimento);
    public PublicacaoPublica criarPublicacaoPublica(List<Usuario> amigos, PropriedadesPerfil tipo);
    public PublicacaoPrivada criarPublicacaoPrivada(List<Usuario> amigosProximos, PropriedadesPerfil tipo);
    public Produto criarProduto(String nome, float preco, Usuario vendedor);
    public Loja criarLoja(List<Produto> produtos);
}
