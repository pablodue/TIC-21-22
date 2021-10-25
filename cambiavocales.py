def cambia_vocales():
    palabra = raw_input("Dime una palabra:  ")
    cont=0
    vocal=raw_input("Que vocal quieres que cambie: ")
    while(cont<len(palabra)):
        if(palabra[cont]=='a'):
            print(str(vocal))
        else:
            if(palabra[cont]=='e'):
                print(str (vocal))
            else:
                if(palabra[cont]=='i'   ):
                    print(str (vocal))
                else:
                    if(palabra[cont]=='o'):
                        print(str(vocal))
                    else:
                        if (palabra[cont]=='u'):
                            print(str(vocal))
                        else:
                            print(palabra[cont])
                            
        cont=cont+1

    print("Has escrito>"+   palabra)
       
cambia_vocales()
