#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
	char aux[10];//reservo una variable auxiliar para guardar la palabra
	int longitud;
	int cont;
	char*lista[3];
	for(cont=0;cont<3;cont++){
	//1. Leo el nombre de un
		printf("\nDime el nombre del rey %d: ",cont);
	//2. Lo guardo en una varisable auxiliar
		scanf("%s",aux);
	//3. Cuento el numero de letras
		longitud=strlen(aux);
	//4. Busco en la memoria de ese tamaño y me apunto su direcion
		lista[cont]=(char*)malloc(longitud*sizeof(char));
	//5. Copio el nombre desde auxiliar hasta el hueco	
		strcpy(lista[cont],aux);
		
	}
	printf("\n LOS TRES REYES MAGOS SON: ");
	for(cont=0;cont<3;cont++){
		printf("\n %s",lista[cont]);
		}


	
}
