def devuelve_el_mayor(num1,num2,num3):
    if(num1>num2 and num1>3):
        mayor=num1
    else:
        if(num2>num3):
            mayor=num2
        else:
            mayor=num3
    return(mayor)
            
def mayot():
    num1=input("Primer numero: ")
    num2=input("Segundo numero: ")
    num3=input("Tercer numero: ")
    print("El mayor es"+str(devuelve_el_mayor(num1,num2,num3)))
    
    
mayot()
