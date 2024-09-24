import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numeros.add(s.nextInt());
        }
        int contadorPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
                contadorPares++;
            }
        }
        System.out.println(contadorPares);
        s.close();
    }
    
}
