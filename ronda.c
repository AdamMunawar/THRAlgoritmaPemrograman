#include <stdio.h>
#include <unistd.h>

#define MAX_LOKASI 3 

typedef struct {
    int id;
    char nama[50];
} Lokasi;

void delayDetik(int detik) {
    sleep(detik);
}

void tampilkanDaftarLokasi(Lokasi lokasi[], int jumlah) {
    printf("Daftar Lokasi:\n");
    for (int i = 0; i < jumlah; ++i) {
        printf("%d. %s\n", lokasi[i].id, lokasi[i].nama);
    }
}

void patroli(Lokasi lokasi[], int jumlahLokasi) {
    printf("Memulai patroli...\n");
    for (int i = 0; i < jumlahLokasi; ++i) {
        printf("Sedang memeriksa lokasi: %s\n", lokasi[i].nama);
        // Simulasi pemeriksaan di lokasi
        delayDetik(3); // Delay 3 detik untuk setiap lokasi
    }
    printf("Patroli selesai.\n");
}

int main() {
    Lokasi daftarLokasi[MAX_LOKASI] = {
        {1, "Gedung A"},
        {2, "Gedung B"},
        {3, "Area Parkir Utama"}
    };
    int jumlahLokasi = MAX_LOKASI;

    int pilihan;
    do {
        printf("\nMenu:\n");
        printf("1. Tampilkan Daftar Lokasi\n");
        printf("2. Mulai Patroli\n");
        printf("3. Keluar\n");
        printf("Pilihan Anda: ");
        scanf("%d", &pilihan);

        switch (pilihan) {
            case 1:
                tampilkanDaftarLokasi(daftarLokasi, jumlahLokasi);
                break;
            case 2:
                patroli(daftarLokasi, jumlahLokasi);
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
