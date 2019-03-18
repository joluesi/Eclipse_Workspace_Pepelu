'''
Created on 16 mar. 2019
Práctica 3 - Ejercicio 15.
Escribir un programa que dándole un número (entre 2 y 40) imprima un rombo como el de la figura.
@author: joseluis
'''

nivel = 0

while nivel > 40 or nivel < 2:
    nivel = int(input("Introduzca nivel(2-40): "))
    
    #parte superior del rombo
    for i in range(1, nivel +1):
        #primera línea
        if i == 1:
            print("X" * 2 * nivel)
        #resto de líneas de parte superior 
        else:
            print("X" * (nivel - i+1) + " " * ((i*2)-3) + " " + "X" * (nivel - i+1))
    
    #parte inferior del rombo, lo mismo pero invertido
    for i in range(nivel, 0, -1):
        #primera línea
        if i == 1:
            print("X" * 2 * nivel)
        #resto de líneas de parte inferior 
        else:
            print("X" * (nivel - i+1) + " " * ((i*2)-3) + " " + "X" * (nivel - i+1))
    
    
    
    
    
    
    

