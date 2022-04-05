#include <stdio.h>
#include <iostream>


struct Pessoa {

    char nome [40];
    int  idade;
    float altura, peso;
    char  sexo;
 };



int main () {

    Pessoa P;
    printf ("\n Escreva nome da pessoa = " );
    scanf ("%[^\n]", &P.nome);
    printf ("\n Escreva idade da pessoa =");
    scanf ("%i", &P.idade);
    printf ("\n Entre com o altura da pessoa =");
    scanf ("%f", &P.altura);
    printf ("\n Entre com o peso da pessoa =");
    scanf ("%f", &P.peso);
    printf ("\n Entre com o sexo da pessoa =");
    fflush(stdin);
    scanf ("%c", &P.sexo);

   printf (" \n\n NOME LIDO= %s \n\n", P.nome);
   printf (" \n\n NOME LIDO= %i \n\n", P.idade);
   printf (" \n\n NOME LIDO= %f \n\n", P.altura);
   printf (" \n\n NOME LIDO= %f \n\n", P.peso);
   printf (" \n\n NOME LIDO= %c \n\n", P.sexo);

}
