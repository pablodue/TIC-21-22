#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main(){
	char provisional[10];
	char *aux;//reservo una variable auxiliar para guardar de momento la direccion de  la palabra
	int *longitud;
	int cont;
	int repetir;
	char*mispalabras[5];
	for(cont=0;cont<5;cont++){
	//1. Leo el nombre de un
		printf("\nDime la palabra %d: ",cont);
	//2. Lo guardo en una varisable auxiliar
		scanf("%s",provisional);
	//3. Cuento el numero de letras
		longitud=strlen(*provisional);
		printf("\nMIDE %d",longitud);
	//4. Busco en la memoria de ese tamaño y me apunto su direcion
		mispalabras[cont]=(char*)malloc(longitud*sizeof(char));
	//5. Copio el nombre desde auxiliar hasta el hueco	
		strcpy(mispalabras[cont],provisional);
	
	}
	printf("\n LAS PALABRAS SON: ");
	for(cont=0;cont<3;cont++){
		printf("\n %s",*(mispalabras+cont));
		
		//LAS ORDENO POR ORDEN ALFABETICO
		//LA ORDENO DE MENOR A MAYOR
	for(repetir=1;repetir<5;repetir++){
		for(cont=0;cont<=3;cont++);	{
			if(strcmp(mispalabras[cont],mispalabras[cont+1])>0){
				aux=mispalabras[cont];
				mispalabras[cont]=mispalabras[cont+1];
				mispalabras[cont+1]=aux;
			}
		}
	}
	
	//VUELVO A MOSTRAR LAS PALABRAS PERO ORDENADAS
	printf("\n LAS CINCO PALABRAS SON: ");
	for(cont=0;cont<3;cont++){
		printf("\n %s",*(mispalabras+cont));
}

return(0);



}
}

