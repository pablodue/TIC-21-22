def tabla4 ():
       
    n=input("que tabla deseas: ")
    print("***************************")
    print("*        TABLA DEL "+str(n)+"     *")
    print("***************************")

    cont=0
    while(cont<=10):
   
        print(" "+str(n)+" x "+str(cont)+" = "+str(cont*n))
        cont=cont+1




                
tabla4()
