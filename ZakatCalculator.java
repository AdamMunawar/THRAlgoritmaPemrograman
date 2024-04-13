import java.util.Scanner;

public class ZakatCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan total kekayaan
        System.out.println("Masukkan total kekayaan Anda:");
        double wealth = input.nextDouble();
        
        // Menghitung zakat (2.5% dari total kekayaan)
        double zakat = wealth * 0.025;
        
        // Menampilkan jumlah zakat yang harus dibayarkan
        System.out.println("Jumlah zakat yang harus Anda bayarkan: " + zakat);
        
        input.close();
    }
}
