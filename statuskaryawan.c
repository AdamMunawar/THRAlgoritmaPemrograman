#include <stdio.h>

int main() {
    int usia;

    printf("Masukkan usia karyawan: ");
    scanf("%d", &usia);

    if (usia < 30) {
        printf("Karyawan muda\n");
    } else if (usia >= 30 && usia < 50) {
        printf("Karyawan dewasa\n");
    } else {
        printf("Karyawan senior\n");
    }

    return 0;
}
