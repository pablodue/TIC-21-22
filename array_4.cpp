#include<stdio.h>

int main(){
	char letras[5];
	int cont;

	for(cont=0;cont<5;cont++){
		
		printf("\nIntroduce  la letra %d: ",cont);
		scanf(" %c",&letras[cont]);
		
	}
	printf("\nHas escrito la palabra: ");
	for(cont=0;cont<5;cont++){
		printf("%c",letras[cont]);
		
		
		
	}
	//para escribir la palabra al revés
	printf("\n");
	for(cont=4;cont>=0;cont--);{
		printf("%c",letras[cont]);
	
	}
	
	return(0);

}
	



