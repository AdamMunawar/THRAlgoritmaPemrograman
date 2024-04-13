#include <stdio.h>

int main() {

    char operator;
    int numb1, numb2;

    printf("Masukkan operator (+, -, *, /): ");
    scanf("%c", &operator);

    printf("Masukkan dua angka: ");
    scanf("%lf %lf", &numb1, &numb2);

    switch(operator) {
        case '+':
            printf("%.1lf + %.1lf = %.1lf", numb1, numb2, numb1 + numb2);
            break;
        case '-':
            printf("%.1lf - %.1lf = %.1lf", numb1, numb2, numb1 - numb2);
            break;
        case '*':
            printf("%.1lf * %.1lf = %.1lf", numb1, numb2, numb1 * numb2);
            break;
        case '/':
            if(num2 != 0)
                printf("%.1lf / %.1lf = %.1lf", numb1, numb2, numb1 / numb2);
            else
                printf("Pembagian dengan nol Haram");
            break;
        default:
            printf("Operator tidak valid");
    }

    return 0;
}










}