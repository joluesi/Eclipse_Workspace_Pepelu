'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 4.
Escribir un programa que solicite un número positivo, acto seguido debe calcular la suma de
todos los números pares comprendidos entre 0 y el numero solicitado.
@author: joseluis
'''

num = int(input("Introduzca número entero positivo: "))

sumaPares = 0
for i in range (0, num+1):
    if i % 2 == 0:
        sumaPares += i
print("La suma es: ", sumaPares)

    