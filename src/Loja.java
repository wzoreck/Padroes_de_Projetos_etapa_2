import java.util.List;

public class Loja {
    private List<Usuario> melhoresVendedores;
    private List<Produto> produtos;
    private static Loja loja;

    private Loja() {
    }

    private Loja(List<Produto> produtos) {
        this.produtos = produtos;
    }

//    private Loja(List<Usuario> melhoresVendedores) {
//        this.melhoresVendedores = melhoresVendedores;
//    }

    private Loja(List<Usuario> melhoresVendedores, List<Produto> produtos) {
        this.melhoresVendedores = melhoresVendedores;
        this.produtos = produtos;
    }

    public static Loja criaComProdutos(List<Produto> produtos) {
        if (loja != null) {
            loja.setProdutos(produtos);
            return loja;
        }

        return new Loja(produtos);
    }

    public static Loja criaComMelhoresVendedores(List<Usuario> melhoresVendedores) {
        if (loja != null) {
            loja.setMelhoresVendedores(melhoresVendedores);
            return loja;
        }

        loja = new Loja();
        loja.setMelhoresVendedores(melhoresVendedores);
        return loja;
    }

    public static Loja criaComProdutosEMelhoresVendedores(List<Produto> produtos, List<Usuario> melhoresVendedores) {
        if (loja != null) {
            loja.setProdutos(produtos);
            loja.setMelhoresVendedores(melhoresVendedores);
            return loja;
        }

        return new Loja(melhoresVendedores, produtos);
    }

    public List<Usuario> getMelhoresVendedores() {
        return melhoresVendedores;
    }

    public void setMelhoresVendedores(List<Usuario> melhoresVendedores) {
        this.melhoresVendedores = melhoresVendedores;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
