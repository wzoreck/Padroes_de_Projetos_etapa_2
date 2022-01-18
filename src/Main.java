import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioDAOInterface usuarioDAO = new UsuarioDAODecorator();
        Usuario u;
        int menuEscolha = 0;
        boolean execucao = true;

        while (execucao) {
            System.out.println("\n[1] - Adicionar usuário no BD");
            System.out.println("[2] - Recuperar usuário no BD");
            System.out.println("[99] - Encerrar programa");
            System.out.print("Informe sua escolha: ");
            menuEscolha = sc.nextInt();
            sc.nextLine();

            switch (menuEscolha) {
                case 1:
                    String nome, senha, email, dataNascimento;
                    System.out.println("\nPrimeiro precisamos criar um usuário!");
                    System.out.print("Informe um nome para o usuário: ");
                    nome = sc.nextLine();
                    System.out.print("Informe uma senha para o usuário: ");
                    senha = sc.nextLine();
                    System.out.print("Informe um email para o usuário: ");
                    email = sc.nextLine();
                    System.out.print("Informe a data de nascimento do usuário: ");
                    dataNascimento = sc.nextLine();

                    u = new Usuario(nome, senha, email, dataNascimento);

                    try {
                        usuarioDAO.addUsuario(u);
                    } catch (UsuarioException e) {
                        System.err.println("Não consegui adicionar o usuário " + u.getNome() + "!");
                        System.err.println(e.getMessage());
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("\nInforme o nome do usuário que deseja recuperar: ");
                    nome = sc.nextLine();

                    try {
                        u = usuarioDAO.getUsuario(nome);
                        System.out.println("\nO usuário " + u.getNome() + " foi recuperado com sucesso!");
                    } catch (UsuarioException e) {
                        System.err.println("Não consegui recuperar o usuário " + nome + "!");
                        System.err.println(e.getMessage());
                        System.out.println();
                    }
                    break;
                case 99:
                    System.out.println("\nFinalizando o programa...");
                    execucao = false;
                    break;
            }
        }
        System.out.println("Programa finalizado com sucesso.");
    }
}
