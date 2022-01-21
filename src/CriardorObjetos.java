import java.util.List;

public class CriardorObjetos implements  Criador {
    private UsuarioComum usuarioComum;
    private UsuarioAdmin usuarioAdmin;
    private PublicacaoPublica publicacaoPublica;
    private PublicacaoPrivada publicacaoPrivada;
    private Produto produto;
    private Loja loja;

    public CriardorObjetos() {
    }

    @Override
    public UsuarioComum criarUsuarioComum(String nome, String email, String senha, String dataNascimento) {
        return new UsuarioComum(nome, email, senha, dataNascimento);
    }

    @Override
    public UsuarioAdmin criarUsuarioAdmin(String nome, String email, String senha, String dataNascimento) {
        return new UsuarioAdmin(nome, email, senha, dataNascimento);
    }

    @Override
    public PublicacaoPublica criarPublicacaoPublica(List<Usuario> amigos, PropriedadesPerfil tipo) {
        return new PublicacaoPublica(amigos, tipo);
    }

    @Override
    public PublicacaoPrivada criarPublicacaoPrivada(List<Usuario> amigosProximos, PropriedadesPerfil tipo) {
        return new PublicacaoPrivada(amigosProximos, tipo);
    }

    @Override
    public Produto criarProduto(String nome, float preco, Usuario vendedor) {
        return new Produto(nome, preco, vendedor);
    }

    @Override
    public Loja criarLoja(List<Produto> produtos) {
        return Loja.criaComProdutos(produtos);
    }
}
