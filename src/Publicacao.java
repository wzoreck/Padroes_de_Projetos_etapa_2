public class Publicacao {
    private String titulo;
    private String conteudo;
    private String dataPublicacao;
    private UsuarioComum criador;

    public Publicacao entitulada(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Publicacao conteudo(String conteudo) {
        this.conteudo = conteudo;
        return this;
    }

    public  Publicacao publicadaEm(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
        return this;
    }

    public Publicacao criadaPor(UsuarioComum criador) {
        this.criador = criador;
        return this;
    }

    public void addPropriedades(Perfil perfil) {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public UsuarioComum getCriador() {
        return criador;
    }

    public void setCriador(UsuarioComum criador) {
        this.criador = criador;
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                ", criador=" + criador.getNome() +
                '}';
    }
}
