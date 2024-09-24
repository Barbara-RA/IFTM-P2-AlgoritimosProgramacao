import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantos nomes você quer adicionar?");
        int n = s.nextInt();
        s.nextLine(); 

        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o nome " + (i + 1) + ":");
            String nome = s.nextLine();
            nomes.add(nome);
        }

        System.out.println("Qual número corresponde ao nome que você quer excluir?");
        int elemento = s.nextInt();
        s.nextLine();

        if (elemento > 0 && elemento <= nomes.size()) {
            nomes.remove(elemento - 1);
        }

        System.out.println("Nomes restantes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        s.close();
    }
}
