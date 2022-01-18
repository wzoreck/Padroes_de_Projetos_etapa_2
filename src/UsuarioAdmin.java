public class UsuarioAdmin extends Usuario {

    public UsuarioAdmin(String nome, String email, String senha, String dataNascimento) {
        super(nome, email, senha, dataNascimento);
    }

    @Override
    public String toString() {
        return "UsuarioAdmin";
    }
}
