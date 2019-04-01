'''
Created on 01 abr. 2019
Práctica 4.
Ejercicio 9.- Programa que permita catalogar coches. SIN BREAK.
@author: joseluis
'''

coches = []

'''
coches = [{'Marca': 'nissan', 'Modelo': 'cascai', 'Cilindrada': 1600, 'Potencia(CV)': 130, 'Velocidadmaxima': 192},
        {'Marca': 'audi', 'Modelo': 'a3', 'Cilindrada': 2700, 'Potencia(CV)': 230, 'Velocidadmaxima': 292},
        {'Marca': 'opel', 'Modelo': 'corsa', 'Cilindrada': 1300, 'Potencia(CV)': 100, 'Velocidadmaxima': 172}]
'''

salir = False
while not salir:
    
    print("1.- Alta coche.")
    print("2.- Baja coche.")
    print("3.- Listar coches.")
    print("4.- Salir.")
    opcion = input("Elija opción (1-4): ")    

    if opcion == "1":                 
        if len(coches) < 20:
            coche = {}            
            coche['Marca'] = input("Introduzca marca del coche: ")
            coche['Modelo'] = input("Introduzca modelo: ")
            
            i = 0
            repetido = False 
            while not repetido and i < len(coches) :                        
                if ((coche['Marca'] == coches[i]['Marca']) and (coche['Modelo'] == coches[i]['Modelo'])):
                    print("-"*30)  
                    print("coche repetido")
                    print("-"*30) 
                    repetido = True 
                i += 1                   
                    
            if not repetido:                        
                coche['Cilindrada'] = input("Introduzca cilindrada del coche: ")
                coche['Potencia(CV)'] = input("Introduzca potencia(CV) del coche: ")
                coche['Velocidadmaxima'] = input("Introduzca velocidad máxima del coche: ")
                coches.append(coche)
                print(coches)
                print()
                
    
    elif opcion == "2":
        if len(coches) == 0:
            print("-"*30) 
            print("No existen coches para dar de baja.")
            print("-"*30) 
            print()
        else:
            marca = input("Introduzca marca del coche: ")
            modelo = input("Introduzca modelo: ")
            for coche in coches:
                if ((marca == coche['Marca']) and (modelo == coche['Modelo'])): 
                    coches.remove(coche) 
                    print("-"*30)                        
                    print("Coche encontrado y borrado")
                    print("-"*30) 
                    print(coches)
                    
                else: 
                    print("-"*30)                
                    print("No existe ese coche en el listado")
                    print("-"*30) 
                    print()
                
    elif opcion == "3":
        print("Listado de vehículos disponibles")
        print("-"*80)
        
        print('{0:^10}   {1:^10}   {2:^10}   {3:^10}   {4:^10}'.format("MARCA", "MODELO", "CILINDRADA", "POTENCIA(CV)", "VELOCIDAD MAX."))
        print("-"*80)

        for coche in coches:
            print('{0:^10}   {1:^10}   {2:^10}   {3:^10}   {4:^10}'.format(coche['Marca'], coche['Modelo'], coche['Cilindrada'], 
            coche['Potencia(CV)'], coche['Velocidadmaxima']))
            print("-"*80)
            print()
            
    elif opcion == "4":
        confirma = input("¿Seguro que desea salir. Pulse 'S' para salir: ")
        if confirma == 'S' or confirma == 's':
            print("Adiós!")
            salir = True
        else:
            opcion = input("Elija opción (1-4): ")    
        
    
    
                

