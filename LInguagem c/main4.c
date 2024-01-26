#include <stdio.h>
#include <conio.h>

int main(){

    int a = 27;
    int *p;

    p = &a;

    printf("=======TRABALHANDO COM PONTEIROS======");

    printf("Conteudo do variavel A: %d\n", a);
    printf("Endereço da variavel A: %x\n", &a);
    printf("Conteudo da Variavel P: %x\n", p);
    printf("Conteudo do ponteiro: %d\n", *p);

    return 0;
}