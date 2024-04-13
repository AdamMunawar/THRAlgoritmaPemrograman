#include <stdio.h>
#include <time.h>


void absenMasuk() {
    time_t rawtime;
    struct tm *info;
    char buffer[80];

    time(&rawtime);
    info = localtime(&rawtime);

    strftime(buffer, 80, "%Y-%m-%d %H:%M:%S", info);
    printf("Absen masuk pada: %s\n", buffer);
}

void absenKeluar() {
    time_t rawtime;
    struct tm *info;
    char buffer[80];

    time(&rawtime);
    info = localtime(&rawtime);

    strftime(buffer, 80, "%Y-%m-%d %H:%M:%S", info);
    printf("Absen keluar pada: %s\n", buffer);
}

int main() {
    int pilihan;

    printf("Selamat datang!\n");
    printf("Pilih opsi:\n");
    printf("1. Absen Masuk\n");
    printf("2. Absen Keluar\n");
    printf("Pilihan Anda: ");
    scanf("%d", &pilihan);

    switch (pilihan) {
        case 1:
            absenMasuk();
            break;
        case 2:
            absenKeluar();
            break;
        default:
            printf("Opsi tidak valid.\n");
            break;
    }

    return 0;
}
