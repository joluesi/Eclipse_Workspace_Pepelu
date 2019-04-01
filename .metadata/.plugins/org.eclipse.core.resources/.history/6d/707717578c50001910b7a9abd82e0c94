'''
Created on 26 mar. 2019
Práctica 4.
Ejercicio 6.- Programa que calcule los 100 primeros números de la sucesión de Fibonacci y los almacene en una lista y muestre por pantalla.
Versión 1 - Hecho con diccionario.
@author: joseluis
'''
from __future__ import print_function

listaFibo = dict()

for i in range(0, 100):
    if i == 0:
        listaFibo[0] = 0
    elif i == 1:
        listaFibo[1] = 1
    else:
        listaFibo[i] = listaFibo[i-1] + listaFibo[i-2]
        
for i, fibo in listaFibo.items():
    print(fibo, end = ', ')
