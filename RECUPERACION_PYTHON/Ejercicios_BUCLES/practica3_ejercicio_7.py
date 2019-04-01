'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 7.
Escribir un programa que solicite números (enteros o reales), el programa terminará cuando
se introduzca el cero. A continuación debe mostrar el mayor número.
@author: joseluis
'''

num = float(input("Introduzca un número ('0' para terminar): "))
mayor = 0
while num != 0:
    num = float(input("Introduzca un número ('0' para terminar): "))   
    if num > mayor:
        mayor = num

print("Mayor es:", mayor)
