'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 5.
Escribe un programa que dado un número, muestre todos los múltiplos de 11 desde el cero
hasta el número.
@author: joseluis
'''

num = int(input("Introduzca un número entero positivo: "))
print("Los múltiplos son:", end = ' ')
for i in range (0, num+1):
    if i % 11 == 0:
        print(i, end = ', ')