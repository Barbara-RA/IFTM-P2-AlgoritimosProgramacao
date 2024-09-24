import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine(); // Consumir a linha restante

        ArrayList<String> frases = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            frases.add(s.nextLine());
        }

        String novaFrase = "";
        for (String frase : frases) {
            novaFrase += frase.split(" ")[0] + " ";
        }
        novaFrase = novaFrase.trim().toUpperCase();

        System.out.println("Total de frases : "  + (n+1));
        System.out.println(novaFrase);

        s.close();
    }
}
