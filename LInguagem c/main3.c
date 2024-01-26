#include <stdio.h>
#include <conio.h>

float soma(int a, int b){
    
    float res;
    res = a+b;
    return res;
}

float subtracao(float a, float b){
    float res;
    res = a-b;
    return res;
}

float multiplicacao(float a, float b){
    float res;
    res = a*b;
    return res;
}

float divisao(float a, float b){
    float res;
    res = a/b;
    return res;
}
int main()
{

    float a,b, adicao, sub, mul, divi;

    printf("DIigite o valor de A: \n");
    scanf("%f", &a);
    printf("Digite o valor de B: \n");
    scanf("%f", &b);

    adicao = soma(a, b);
    sub = subtracao(a, b);
    mul = multiplicacao(a, b);
    divi = divisao(a, b);
    
    printf("\nOs resultados são: \n");
    printf("Soma: %.2f", adicao);
    printf("Subtracao: %.2f", sub);
    printf("Multiplicacao: %.2f", mul);
    printf("Divisão: %.2f", divi);
    
    return 0;
}