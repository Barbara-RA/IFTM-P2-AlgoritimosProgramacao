import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            numeros.add(s.nextInt());
        }

        for (int i = N - 1; i >= 0; i--) {
            if (numeros.get(i) < 0) {
                System.out.println(numeros.get(i));
            }
        }

        s.close();
    }
}
