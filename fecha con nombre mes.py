def fecha():

    fecha=raw_input("Introduce una fecha (dd/mm/aa): ")
    numero_mes=fecha[3]*10+int(fecha[4])
    meses="Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Sepiembre,Octubre,Noviembre,Diciembre"
    mes_elegido=meses[(numero_mes-1)*3:(numero_mes-1)*3+3]
    print("Numero mes "+str(numero_mes))
    numero_comas=0
    cont=0
    while(numero_comas<=numero_mes-1):
        if(nombres_meses[cont]==','):
            numero_comas=numero_comas+1
        cont=cont+1
    print(cont)
        
   
    
        
              
      
 
fecha()
