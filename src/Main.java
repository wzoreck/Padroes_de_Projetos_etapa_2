import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioDAOInterface usuarioDAO = new UsuarioDAODecorator();
        Usuario u;
        int menuEscolha = 0;
        boolean execucao = true;

        Loja loja;

        List<Usuario> melhoresVendedores = new ArrayList<Usuario>();
        melhoresVendedores.add(new UsuarioComum("Joao Carlos", "jc@heaven.com", "1234", "1984-12-02"));
        melhoresVendedores.add(new UsuarioComum("Andrilei Andreas", "aa@oreon.com", "12345", "1994-11-26"));

        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Camiseta", 45.6f, melhoresVendedores.get(0)));
        produtos.add(new Produto("Copo Personalizado", 61.2f, melhoresVendedores.get(1)));
        produtos.add(new Produto("Capa Celular", 22.7f, melhoresVendedores.get(0)));

        UsuarioComum daniel = new UsuarioComum("Daniel", "daniel@email.com", "1234", "2000-07-08");

        List<Usuario> todosAmigos = new ArrayList<Usuario>();
        UsuarioComum jonas = new UsuarioComum("Jonas", "melodojonas@oficial.com", "1234", "2000-01-03");
        todosAmigos.add(new UsuarioComum("Ana", "ana@email.com", "1234", "2000-01-01"));
        todosAmigos.add(new UsuarioComum("Marcos", "marcos@email.com", "1234", "2000-01-02"));
        todosAmigos.add(jonas);

        List<Usuario> amigosProximos = new ArrayList<Usuario>();
        amigosProximos.add(jonas);

        while (execucao) {
            System.out.println("\n[1] - Adicionar usuário no BD");
            System.out.println("[2] - Recuperar usuário no BD");
            System.out.println("[3] - Adicionar produtos na loja");
            System.out.println("[4] - Adicionar melhores vendedores na loja");
            System.out.println("[5] - Criar publicacao");
            System.out.println("[6] - Adicionar amigo");
            System.out.println("[7] - Remover amigo");
            System.out.println("[8] - Criar publicacao");
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
                case 3:
                    loja = Loja.criaComProdutos(produtos);
                    System.out.println("Referência objeto loja - " + loja);
                    System.out.println("\n--- Produtos adicionados na loja ---");
                    for (Produto p : loja.getProdutos()) {
                        System.out.println("Produto: " + p.getNome());
                    }
                    break;
                case 4:
                    loja = Loja.criaComMelhoresVendedores(melhoresVendedores);
                    System.out.println("Referência objeto loja - " + loja);
                    System.out.println("\n--- Melhores vendedores da loja ---");
                    for (Usuario vendedor : loja.getMelhoresVendedores()) {
                        System.out.println("Vendedor: " + vendedor.getNome());
                    }
                    break;
                case 5:
                    System.out.println("\n--- Usuários ---");
                    for (int i = 0; i < melhoresVendedores.size(); i++) {
                        System.out.println("ID: " + i + " Nome: " + melhoresVendedores.get(i).getNome());
                    }
                    System.out.print("\nInforme o ID de quem será o criador da publicacao: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    Publicacao p = new Publicacao().criadaPor((UsuarioComum) melhoresVendedores.get(id)).publicadaEm("hoje").entitulada("Vejam esse meme que legal! HAHA").conteudo("Lorem ipsum...");
                    System.out.println();
                    System.out.println(p.toString());
                    break;
                case 6:
                    System.out.println("\n--- Usuários ---");
                    for (int i = 0; i < melhoresVendedores.size(); i++) {
                        System.out.println("ID: " + i + " Nome: " + melhoresVendedores.get(i).getNome());
                    }
                    System.out.print("\nInforme o ID de quem sera adicionado como amigo: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();

                    daniel.adicionarAmigo(melhoresVendedores.get(id2).getNome());

                    break;
                case 7:
                    System.out.print("\nVocê está removendo o último amigo adicionado...");
                    daniel.removerAmigo();
                    break;
                case 8:
                    System.out.println("\n--- Criar publicacao ---");
                    System.out.println("\n[0] - Publicacao Pública");
                    System.out.println("[1] - Publicacao Privada");
                    System.out.print("Informe sua escolha: ");
                    int escolhaPublicacao = sc.nextInt();
                    sc.nextLine();
                    System.out.println("\n--- Tipo de publicacao ---");
                    System.out.println("[7] - Publicacao Comum");
                    System.out.println("[8] - Status");
                    System.out.println("[9] - Story");
                    System.out.print("Informe sua escolha: ");
                    int tipoPublicacao = sc.nextInt();
                    sc.nextLine();

                    Perfil perfil = new Perfil();

                    if (escolhaPublicacao == 0) {
                        if(tipoPublicacao == 7) {

                        } else if (tipoPublicacao == 8) {

                        } else if (tipoPublicacao == 9) {

                        }
                    } else if (escolhaPublicacao == 1) {
                        if(tipoPublicacao == 7) {
                            PublicacaoPrivada pp = new PublicacaoPrivada(amigosProximos, PropriedadesPerfil.PUBLICACAO);
                            perfil.addPublicacao(pp);
                        } else if (tipoPublicacao == 8) {
                            PublicacaoPrivada pp = new PublicacaoPrivada(amigosProximos, PropriedadesPerfil.STATUS);
                            perfil.addPublicacao(pp);
                        } else if (tipoPublicacao == 9) {
                            PublicacaoPrivada pp = new PublicacaoPrivada(amigosProximos, PropriedadesPerfil.STORY);
                            perfil.addPublicacao(pp);
                        }
                    }
                    System.out.println("\nTotal de Publicacoes Comuns: " + perfil.getTotalPublicacoes());
                    System.out.println("Total de Status: " + perfil.getTotalStatus());
                    System.out.println("Total de Story: " + perfil.getTotalStory());
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
