'''
Created on 16 mar. 2019
Práctica 3 - Ejercicio 16.
Escribir un programa para que dada una cantidad de euros la devuelva en el menor número
de billetes y monedas de curso legal posible (billetes: 500 €, 200 €, 100 €, 50 €, 20 €, 10 € y 5€.
Monedas: 2 €, 1 €.
@author: joseluis
'''

cantidad = int(input("Introduzca una cantidad(entero positivo > 1): "))

efectivo = [500, 200, 100, 50, 20, 10, 5, 2, 1]

for i in range(len(efectivo)):
    
    if cantidad >= efectivo[i]:
        desglose = int(cantidad / efectivo[i])
        
        if efectivo[i] >= 5:
            if desglose > 1:
                print(desglose, "billetes de", efectivo[i])
            else:
                print(desglose, "billete de", efectivo[i])
        else:
            if desglose > 1:
                print(desglose, "monedas de", efectivo[i])
            else:
                print(desglose, "moneda de", efectivo[i])
                
    cantidad = float(cantidad % efectivo[i])  
            
                
