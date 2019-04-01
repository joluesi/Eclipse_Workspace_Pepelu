'''
Created on 1 abr. 2019
Practica 5.
Ejercicio 2.- Escribir un programa que solicite un número n y a continuación imprima todos los primos comprendidos en el intervalo [2-n].
Utilizar función es_primo que dado un número devuelva si es primo o no.
@author: joseluis
'''


num = int(input("Introduzca un número: "))
print("Números primos [2-"+str(num)+"]:", end = ' ')

def es_primo():
    for i in range(2, num):
        esprimo = True
        for divisor in range (2, i):
            if i % divisor == 0:
                esprimo = False
                break
        if esprimo:
            print(i, end = ', ')
    
            
es_primo()