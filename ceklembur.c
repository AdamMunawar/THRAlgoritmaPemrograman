#include <stdio.h>

int main() {
    float jam_kerja;

    printf("Masukkan jumlah jam kerja: ");
    scanf("%f", &jam_kerja);

    if (jam_kerja > 40) {
        printf("Anda bekerja lembur\n");
    } else {
        printf("Anda tidak bekerja lembur\n");
    }

    return 0;
}
