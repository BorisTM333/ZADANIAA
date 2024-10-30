import java.util.Scanner;

public class NajwiekszaLiczba {
    
    public static int MAX(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj drugą liczbę całkowitą: ");
        int liczba2 = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę całkowitą: ");
        int liczba3 = scanner.nextInt();

        int max1 = MAX(liczba1, liczba2);
        int najwieksza = MAX(max1, liczba3);

        System.out.println("Największa liczba to: " + najwieksza);

        scanner.close();
    }
}
