'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 12.
Escribir un programa que solicite un número n y a continuación muestre si el número es o no
primo.
@author: joseluis
'''

num = int(input("Introduzca un número: "))
if num > 1:
    esPrimo = True
    for d in range (2, num):
        if num % d == 0:
            esPrimo = False
            break
else:
    esPrimo = False

if esPrimo:
    print("El número", num, "es primo")
else:
    print("El número", num, "no es primo")
        
