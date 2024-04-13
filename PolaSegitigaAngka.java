 import java.util.Scanner;

public class PolaSegitigaAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();
        int angka = 1;
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}

