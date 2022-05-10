#include <stdio.h>
#include <iostream>
#include <stdlib.h>
int main() {

double *x;

  x = (double *) malloc( sizeof (double) );
//  x = new (int);

  *x = 100;

  printf ("\n Valor colocado em X = %f ....", *x);

  free (x);

  *x = NULL;
  *x = 101010;
  printf("\n Valor colocado em x = %i ....", sizeof(double));

}
