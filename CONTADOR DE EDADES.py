def contador():
    
    suma=0
    num=input("Dame un número:")
    mayor=num
    menor=num
    suma=suma+num
    for cont in range(1,4):
        num=input("Dame un número:")
        if(num>mayor):
            mayor=num
        if(num<menor):
            menor=num
        suma=suma+num
    media=suma/4.00
    print("MAYOR= "+str(mayor))
    print("MENOR= "+str(menor))
    print("MEDIA= "+str(media))
    
    







contador()
