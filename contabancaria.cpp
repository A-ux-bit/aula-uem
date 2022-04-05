#include <iostream>
#include <stdio.h>

struct propriedade {
      char titular [30];
      int cpf;
      float pagamento;
      };

      int main() {
    propriedade P;

    printf("\n Entre com o titular do usuário =");
    scanf("[^\n]", &P.titular);

    printf("\n Entre com numero do cpf =");
    scanf("%i", &P.cpf);

    printf ("\n Entre com conta de pagamento = ");
    scanf("%f", &P.pagamento);
    fflush(stdin);

    printf(" \n\n Titular lido = %s ", P.titular);
    printf(" \n\n cpf lido = %s ", P.cpf);
    printf(" \n\n pagamento lido = %s ", P.pagamento);
}
