public interface UsuarioDAOInterface {
    public void addUsuario(Usuario usuario) throws UsuarioException;
    public Usuario getUsuario(String nome) throws UsuarioException;
}
