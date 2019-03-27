'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 13.
Escribir un programa que solicite un número n y a continuación imprima todos los números
primos comprendidos en el intervalo [2-n]. 
@author: joseluis
'''

num = int(input("Introduzca un número: "))
print("Números primos [2-"+str(num)+"]:", end = " ")

for i in range (2, num+1):
    esPrimo = True
    for d in range (2, i):
        if i % d == 0: 
            esPrimo = False
            break
    if esPrimo:
        print(i, end=", ")



    