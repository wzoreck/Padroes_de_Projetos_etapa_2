import java.util.List;

public class Produto {
    private String nome;
    private float preco;
    private Usuario vendedor;

    public Produto(String nome, float preco, Usuario vendedor) {
        this.nome = nome;
        this.preco = preco;
        this.vendedor = vendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }
}
