import java.util.Scanner;

public class SystemKontroliDostepu {
    private static final int ADMIN_CODE = 1234;
    private static final int USER_CODE = 5678;

    public static boolean IS_ADMIN(int x) {
        return x == ADMIN_CODE;
    }

    public static boolean IS_USER(int x) {
        return x == USER_CODE;
    }

    public static boolean HAS_ACCESS(int x) {
        return IS_ADMIN(x) || IS_USER(x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź kod dostępu: ");
        int kod = scanner.nextInt();

        if (HAS_ACCESS(kod)) {
            if (IS_ADMIN(kod)) {
                System.out.println("Dostęp przyznany jako administrator.");
            } else {
                System.out.println("Dostęp przyznany jako użytkownik.");
            }
        } else {
            System.out.println("Dostęp odmówiony.");
        }

        scanner.close();
    }
}
