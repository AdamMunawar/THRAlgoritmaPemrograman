 import java.util.Scanner;

public class ValidasiTanggal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal (format: DD MM YYYY): ");
        int tanggal = input.nextInt();
        int bulan = input.nextInt();
        int tahun = input.nextInt();
        boolean valid = true;
        if (bulan < 1 || bulan > 12) {
            valid = false;
        } else if (tanggal < 1 || tanggal > 31) {
            valid = false;
        } else if ((bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) && tanggal == 31) {
            valid = false;
        } else if (bulan == 2) {
            if (tahun % 4 == 0) {
                if (tanggal > 29) {
                    valid = false;
                }
            } else {
                if (tanggal > 28) {
                    valid = false;
                }
            }
        }
        if (valid) {
            System.out.println("Tanggal valid.");
        } else {
            System.out.println("Tanggal tidak valid.");
        }
    }
}

