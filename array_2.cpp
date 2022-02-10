#include<stdio.h>

int main(){
	float x[10];
	int cont;
	float suma=0;
	float media;
	//for cont in range(1,10): (esto seria en pyth)
	//cont++ es lo mismo que cont=cont+1  . Sin embargo si quiero aumentar en 2->  cont=cont+2
	/*el for de abajo equivale a 
	    while(cont<=10){
	   ...
	   cont++;
	}*/
	for(cont=0;cont<10;cont++){
		//num=input("Dame un numero:  ")
		printf("Dame un numero:  ");
		scanf("%f",&x[cont]);
		
	}
	for(cont=0;cont<10;cont++){
		printf("\n%f",x[cont]);
		suma=suma+x[cont];
		//suma+=x[cont]; (otra opcion)
	//ponemos el \n para que salga por consola en forma de columna y no lista
	//lo que esta entre comillas es literal,por eso delante de [%d] podemos poner lo que queramos,pero delante del [cont] hay que poner x
		
	}
	//ESCRIBO datos en la pantalla
	media=suma/10;
	printf("\nLA MEDIA VALE : %.2f",media);
	return(0);



}
