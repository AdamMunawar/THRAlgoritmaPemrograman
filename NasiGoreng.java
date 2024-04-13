 import java.util.Scanner;

public class NasiGoreng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program masak nasi goreng!");
        System.out.println("Langkah-langkah:");
        System.out.println("1. Panaskan minyak dalam wajan.");
        System.out.println("2. Tumis bawang putih dan bawang merah hingga harum.");
        System.out.println("3. Masukkan daging ayam, aduk hingga berubah warna.");
        System.out.println("4. Masukkan sayuran dan udang, aduk hingga layu.");
        System.out.println("5. Tambahkan nasi, kecap manis, kecap asin, garam, dan merica, aduk rata.");
        System.out.println("6. Kocok telur, lalu tuangkan ke dalam wajan. Aduk cepat hingga telur matang.");
        System.out.println("7. Angkat dan hidangkan.");
        System.out.println();

        System.out.println("Apakah Anda siap memasak? (ya/tidak)");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.println("Memasak...");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Langkah " + i + " selesai.");
                try {
                    Thread.sleep(1000); // Delay 1 detik
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Nasi goreng siap disajikan!");
        } else {
            System.out.println("Baik, mungkin lain kali.");
        }

        scanner.close();
    }
}
