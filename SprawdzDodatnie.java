import java.util.Scanner;

public class SprawdzDodatnie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę całkowitą: ");
        int liczba2 = scanner.nextInt();

        if (liczba1 > 0 && liczba2 > 0) {
            System.out.println("Obie liczby są dodatnie.");
        } else {
            System.out.println("Jedna lub obie liczby nie są dodatnie.");
        }

        scanner.close();
    }
}
