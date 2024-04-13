import java.util.Scanner;
public class PengelolDonasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang di Aplikasi Pengelolaan Donasi!");
        System.out.println("Silakan masukkan jumlah donasi Anda:");
        double donationAmount = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.println("Silakan masukkan tujuan donasi Anda:");
        String donationPurpose = scanner.nextLine();
        
        System.out.println("Terima kasih atas donasi Anda sebesar Rp." + donationAmount);
        System.out.println("Donasi Anda akan digunakan untuk: " + donationPurpose);
        
        
        
        scanner.close();
    }
}
 
