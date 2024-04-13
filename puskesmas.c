#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

#define MAX_PASIEN 10

typedef struct {
    char nama[50];
    int nomorAntrian;
} Pasien;

typedef struct {
    char nama[50];
    bool sedangTersedia;
} Dokter;

void tampilkanMenu() {
    printf("\nMenu:\n");
    printf("1. Daftar Pasien\n");
    printf("2. Panggil Antrian\n");
    printf("3. Keluar\n");
    printf("Pilihan Anda: ");
}

void daftarPasienn(Pasien daftarPasien[], int *jumlahPasien) {
    if (*jumlahPasien >= MAX_PASIEN) {
        printf("Maaf, tidak dapat mendaftar pasien lagi. Kapasitas penuh.\n");
        return;
    }

    printf("Masukkan nama pasien: ");
    scanf("%s", daftarPasien[*jumlahPasien].nama);
    daftarPasien[*jumlahPasien].nomorAntrian = *jumlahPasien + 1;
    (*jumlahPasien)++;
    printf("Pasien berhasil didaftarkan dengan nomor antrian %d\n", *jumlahPasien);
}

void panggilAntrian(Pasien daftarPasien[], int *jumlahPasien) {
    if (*jumlahPasien == 0) {
        printf("Tidak ada pasien yang mengantri saat ini.\n");
        return;
    }

    printf("Memanggil pasien: %s (Nomor Antrian: %d)\n", daftarPasien[0].nama, daftarPasien[0].nomorAntrian);
    for (int i = 0; i < *jumlahPasien - 1; ++i) {
        daftarPasien[i] = daftarPasien[i + 1];
    }
    (*jumlahPasien)--;
}

int main() {
    Pasien daftarPasien[MAX_PASIEN];
    int jumlahPasien = 0;

    int pilihan;
    do {
        tampilkanMenu();
        scanf("%d", &pilihan);

        switch (pilihan) {
            case 1:
                daftarPasienn(daftarPasien, &jumlahPasien);
                break;
            case 2:
                panggilAntrian(daftarPasien, &jumlahPasien);
                break;
            case 3:
                printf("Terima kasih. Sampai jumpa!\n");
                break;
            default:
                printf("Pilihan tidak valid. Silakan coba lagi.\n");
                break;
        }
    } while (pilihan != 3);

    return 0;
}
