def cuenta_atras():
    num=input("Dame un número : ")
    suma=1
    for cont in range(num,-1,-1):
        print(cont,suma)
        suma=suma*cont

cuenta_atras()
