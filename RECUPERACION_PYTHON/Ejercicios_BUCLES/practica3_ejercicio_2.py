'''
Created on 13 mar. 2019
Práctica 3 - Ejercicio 2. Escribir un programa que imprima las 10 tablas de multiplicar.
@author: joseluis
'''
print("*"*28)

for i in range (1, 11):    
    print("Tabla de multiplicar del",i)
    print("*"*28)
    for j in range (0, 11):        
        print(i, "x", j, "=", i*j)
    print()
    print("*"*28)  

