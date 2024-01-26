#include <stdio.h>
#include <conio.h>

int main() {

    struct ficha_aluno {
         char nome[50];
         char disciplina[50];
         float nota1;
         float nota2;
    };

    struct ficha_aluno aluno;
    
    printf("========FICHA DE ALUNO==========\n\n");

    printf("Escreva o nome do aluno: ");
    fflush(stdin);
    fgets(aluno.nome, 40, stdin);

    printf("\nDigite o valor da nota 1: ");
    scanf("%f", &aluno.nota1);

    printf("\nDigite o valor da nota 2: ");
    scanf("%f", &aluno.nota2);

    printf("========MOSTRANDO VALORES NA TELA========\n\n");

    printf("Nome: %s", aluno.nome);
    printf("\nNota 1: %f", aluno.nota1);
    printf("\nNota 2: %f", aluno.nota2);
    
    return 0;
}