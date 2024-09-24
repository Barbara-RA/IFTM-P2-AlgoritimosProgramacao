import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    s.nextLine();

    int t = s.nextInt();

    ArrayList<String> lista1 = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      lista1.add(s.nextLine());
    }

    ArrayList<String> lista2 = new ArrayList<>();

    for (String str : lista1) {
      if (str.length() <= t) {
        lista2.add(str);
      }
    }

    lista1.removeAll(lista2);

    System.out.println("Lista 1 : " + lista1.size());
    System.out.println("Lista 2 : " + lista2.size());

    s.close();
  }
}