public class UsuarioDAODecorator implements  UsuarioDAOInterface {
    private static UsuarioDAOInterface usuarioDAO;

    private UsuarioDAOInterface getDAO() {
        if (usuarioDAO == null)
            usuarioDAO = new UsuarioDAOProxy();
        return usuarioDAO;
    }

    @Override
    public void addUsuario(Usuario usuario) throws UsuarioException {
        if (usuario.getNome().isBlank())
            throw new UsuarioException("Digite um nome de usuário válido!");
        getDAO().addUsuario(usuario);
    }

    @Override
    public Usuario getUsuario(String nome) throws UsuarioException {
        if (nome.isBlank())
            throw new UsuarioException("Digite um nome de usuário válido!");
        Usuario u = getDAO().getUsuario(nome);
        if (u == null)
            throw new UsuarioException("Digite um nome de usuário válido!");
        return u;
    }
}
