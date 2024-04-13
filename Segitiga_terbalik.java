import java.util.Scanner;

public class Segitiga_terbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" tinggi segitiga (dalam angka): ");
        int tinggi = input.nextInt();
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
