import random

def tirar_dados():
    
    print("***Jugador 1***")
    for cont in range(1,4):
        print("Lanza")
        for cont in range(1,7):
            num1=random.randint(1,6)
        print(num1)
        
print("***Jugador 2***")

for cont in range(1,4):
        print("Lanza")
        cont=0
        for cont in range(1,7):
            num2=random.randint(1,6)
        print(num2)
        print(str(num2)+str(cont+1))

tirar_dados()
        
    
