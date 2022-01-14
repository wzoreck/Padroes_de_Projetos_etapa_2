public class Publicacao {
    private String titulo;
    private String conteudo;
    private String dataPublicacao;
    private UsuarioComum criador;

    public Publicacao(String titulo, String conteudo, String dataPublicacao, UsuarioComum criador) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataPublicacao = dataPublicacao;
        this.criador = criador;
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
}
