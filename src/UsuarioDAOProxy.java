import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOProxy implements UsuarioDAOInterface{
    private List<Usuario> usuarios;

    public UsuarioDAOProxy() {
        this.usuarios = new ArrayList<Usuario>();
    }

    @Override
    public void addUsuario(Usuario usuario) throws UsuarioException {
        this.usuarios.add(usuario);
        System.out.println("\nUsuário " + usuario.getNome() + " adicionado ao banco de dados.");
    }

    @Override
    public Usuario getUsuario(String nome) throws UsuarioException {
        for (Usuario u : usuarios) {
            if (u.getNome().contentEquals(nome))
                return u;
        }
        return null;
    }
}
