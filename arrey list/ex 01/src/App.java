import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome " + (i + 1) + ":");
            String nome = s.nextLine();
            nomes.add(nome);
        }

        for (int i = nomes.size() - 1; i >= 0; i--) {
            System.out.println(nomes.get(i));
        }

        s.close();
    }
}
