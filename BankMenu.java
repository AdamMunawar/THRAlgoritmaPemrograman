package LayananATM;
import java.util.Scanner;
public class BankMenu {
 
public static void main(String[] args) {
 
  int ambil = 0, simpan = 0;
  Scanner pilih = new Scanner(System.in);
  BankIO bk = new BankIO(100000);
 
System.out.println("Selamat Datang di layanan Bank BCC");
for (int i = 1; i >= 1 ; i++) {
System.out.println("Menu ATM");
System.out.println("1. Cek Saldo\n2. Simpan Uang\n3. Ambil Uang\n4. keluar");
System.out.print("Pilih Menu ATM : ");
int menu = pilih.nextInt();
   if (menu == 1) {
     bk.simpanAwal();
   } else if (menu == 2){
       System.out.print("input nominal Rp. ");
       bk.simpanUang(simpan);
       continue;
   } else if (menu == 3){
       System.out.print(" nominal diambil RP. ");
       bk.ambilUang(ambil);
       continue;
   } else if (menu == 4 ){
      System.out.println("Terimakasih selamat bekerja :)");
      break;
   } else
   System.out.print("Input tidak valid\n ");
   continue;
  }
  pilih.close();
 }
}