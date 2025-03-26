// listas ligadas

#include <stdio.h>
#include <stdlib.h>

struct no
{
    int info;
    struct no * proximo;
};

int main(){
    printf("tamanho do inteiro: %ld\n", sizeof (int));
    printf("tamanho da estrutura: %ld\n", sizeof (struct no));

    struct no no1, no2;

    no1.info = 5;
    no1.proximo = &no2;

    printf("\nno1.info: %d\nno1.proximo: %p\n", no1.info, no1.proximo);

    struct no * pt_no;
    // casting  = conversão de tipos
    pt_no = (struct no*) malloc (sizeof(struct no));
    pt_no->info = 8;

    printf("onde está o ponteiro pt_no: %p\n", &pt_no);
    printf("para onde o pt_no aponta: %p\n", pt_no);

    return 0;
}