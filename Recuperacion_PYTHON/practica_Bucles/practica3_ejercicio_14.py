'''
Created on 16 mar. 2019
Práctica 3 - Ejercicio 14.
Escribir un programa que dándole un número (entre 2 y 40) imprima un triángulo como el de
la figura.
@author: joseluis
'''

nivel = 0

while nivel > 40 or nivel < 2:
    nivel = int(input("Introduzca nivel(2-40): "))

    if nivel % 2 == 0:    
        for i in range(1, nivel + 1):
            espacios = nivel - i
            print(" "*espacios + "XX"*i)
    else:
        for i in range(1, nivel + 1):
            espacios = nivel - i
            print(" "*espacios + "X"*(i * 2 - 1))  
    
