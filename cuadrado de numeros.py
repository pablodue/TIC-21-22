def cuadrado_de_numeros():
    fila=""
    num=input("Dame un numero:  ")


    for fil in range(1,num+1):
        for col in range(1,num+1):
            if (fil%2==1):
                fila=fila+"1"
            else:
                    fila=fila+"0"
        print fila
        fila=""
        
           
        
        
                
       
cuadrado_de_numeros()
