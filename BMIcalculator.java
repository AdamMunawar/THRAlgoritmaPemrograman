import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan berat badan
        System.out.println("Masukkan berat badan Anda (kg):");
        double weight = scanner.nextDouble();
        
        // Meminta pengguna memasukkan tinggi badan
        System.out.println("Masukkan tinggi badan Anda (meter):");
        double height = scanner.nextDouble();
        
        // Menghitung BMI
        double bmi = calculateBMI(weight, height);
        
        // Menampilkan hasil BMI
        System.out.println("BMI Anda adalah: " + bmi);
        
        // Menampilkan interpretasi BMI
        interpretBMI(bmi);
        
        scanner.close();
    }
    
    // Metode untuk menghitung BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    
    // Metode untuk memberikan interpretasi BMI
    public static void interpretBMI(double bmi) {
        System.out.print("Interpretasi BMI: ");
        if (bmi < 18.5) {
            System.out.println("Berat badan kurang");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Berat badan normal");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Berat badan berlebih (kelebihan berat badan)");
        } else {
            System.out.println("Obesitas");
        }
    }
}
