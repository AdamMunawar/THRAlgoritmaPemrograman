#include <stdio.h>

#define HARGA_BAJU 5000
#define HARGA_KAOS 3000
#define HARGA_CELANA 7000

int main() {
    int pilihan;
    int jumlahBaju = 0, jumlahKaos = 0, jumlahCelana = 0;

    printf("Selamat datang di Layanan Laundry!\n");

    do {
        printf("\nMenu:\n");
        printf("1. Cuci Baju (Rp%d per item)\n", HARGA_BAJU);
        printf("2. Cuci Kaos (Rp%d per item)\n", HARGA_KAOS);
        printf("3. Cuci Celana (Rp%d per item)\n", HARGA_CELANA);
        printf("4. Selesai dan Hitung Total\n");
        printf("Pilihan Anda: ");
        scanf("%d", &pilihan);

        switch (pilihan) {
            case 1:
                printf("Masukkan jumlah baju yang ingin dicuci: ");
                scanf("%d", &jumlahBaju);
                break;
            case 2:
                printf("Masukkan jumlah kaos yang ingin dicuci: ");
                scanf("%d", &jumlahKaos);
                break;
            case 3:
                printf("Masukkan jumlah celana yang ingin dicuci: ");
                scanf("%d", &jumlahCelana);
                break;
            case 4:
                printf("Menghitung total...\n");
                break;
            default:
                printf("Pilihan tidak valid. Silakan coba lagi.\n");
                break;
        }
    } while (pilihan != 4);

    int totalBiaya = (jumlahBaju * HARGA_BAJU) + (jumlahKaos * HARGA_KAOS) + (jumlahCelana * HARGA_CELANA);
    printf("Total biaya yang harus dibayar: Rp%d\n", totalBiaya);

    printf("Terima kasih telah menggunakan layanan laundry kami!\n");

    return 0;
}
