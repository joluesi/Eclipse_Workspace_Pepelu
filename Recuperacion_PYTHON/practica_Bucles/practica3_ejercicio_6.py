'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 6.
Escribir un programa que muestre la tabla ASCII.
@author: joseluis
'''

print("Tabla ASCII (Caracteres de 32 a 126): ")

for i in range (32, 127):
    print (str(i) + " => " + chr(i))