def cuenta_atras():
    num=input("Dame un n�mero : ")
    suma=1
    for cont in range(num,-1,-1):
        print(cont,suma)
        suma=suma*cont

cuenta_atras()
