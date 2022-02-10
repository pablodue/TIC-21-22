#include<stdio.h>

int main(){
	char letras[11];
	int cont;

	for(cont=1;cont<11;cont++){
		
		printf("\nIntroduce  la letra %d: ",cont);
		scanf(" %c",&letras[cont]);
		
	}
	printf("\nHas escrito la palabra: ");
	for(cont=1;cont<11;cont++){
		printf("%c",letras[cont]);
		
		
		
	}

	



}
