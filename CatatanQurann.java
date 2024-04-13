import java.util.Scanner;

public class CatatanQurann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPages = 604; // Total jumlah halaman Al-Qur'an
        
        System.out.println("Selamat datang di Pencatat Bacaan Al-Qur'an!");
        System.out.println("Berapa halaman yang sudah Anda baca hari ini?");
        int pagesReadToday = scanner.nextInt();
        
        System.out.println("Berapa halaman yang sudah Anda baca sebelumnya?");
        int pagesReadBefore = scanner.nextInt();
        
        int totalPagesRead = pagesReadToday + pagesReadBefore;
        int remainingPages = totalPages - totalPagesRead;
        double progressPercentage = (double) totalPagesRead / totalPages * 100;
        int roundedProgress = (int) Math.round(progressPercentage); 
        
        System.out.println("Anda telah membaca " + totalPagesRead + " halaman.");
        System.out.println("Sisa halaman yang harus dibaca: " + remainingPages);
        System.out.println("Progres membaca Al-Qur'an: " + roundedProgress + "%");
        
        scanner.close();
    }
}
