#include<stdio.h>

int main(){
	char palabra[];
	int cont;
	printf("Escribe una palabra: ");
	scanf("%s",palabra);
	printf("\nHAS ESCRITO LA PALABRA %s",palabra);
	printf("\nVOY A DELETREARLA: ");
	for(cont=0;cont<=4;cont++){
			printf("\n%c",palabra[cont]);
		}
			
			
			
	palabra[1]='U';
	printf("\nPalabra cambiada: %s",palabra);
	printf("\nQuien es quien:");
	printf("\npalabra[0] = %x",palabra);
	
	return(0);

}
