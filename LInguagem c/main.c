#include <stdio.h>

int main(){
    
    int matriz[3][3];
    int i,j;

    for (i=0; i<3; i++){
        for(j=0; j<3; j++){
    printf("Digite o valor da matriz na posição %d e %d\n", i, j);
    scanf("%d", &matriz[i][j]);
    
    }
    }
    for (i=0; i<3; i++){
    for(j=0;j<3;j++){
    printf("Mostre o valor da matriz na posição %d e %d:\n %d", i, j, matriz[i][j]);
    return 0;

    }
    }
}