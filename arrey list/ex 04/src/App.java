import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;
    private String celular;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class App {
    private static ArrayList<Contato> listaContatos = new ArrayList<Contato>();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            imprimeMenu();
            opcao = s.nextInt();
            switch (opcao) {
                case 1:
                    inserirContato();
                    break;
                case 2:
                    listarContato();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    public static void imprimeMenu() {
        System.out.println("1 - Inserir Contato");
        System.out.println("2 - Listar Contatos");
        System.out.println("3 - Sair");
    }

    public static void inserirContato() {
        Contato contato = new Contato();
        System.out.println("Insira o nome:");
        contato.setNome(s.next());
        System.out.println("Insira o telefone:");
        contato.setTelefone(s.next());
        System.out.println("Insira o celular:");
        contato.setCelular(s.next());
        System.out.println("Insira o email:");
        contato.setEmail(s.next());
        listaContatos.add(contato);

    }

    public static void listarContato() {
        for (Contato contato : listaContatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Celular: " + contato.getCelular());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("--------------------");
        }
    }
}