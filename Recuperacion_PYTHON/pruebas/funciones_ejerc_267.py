'''
Created on 1 abr. 2019
Ejercicio libro 267.
@author: joseluis
'''

def sumatorio_dif (lista):
    suma = 0
    for i in range (len(lista)-1):
        suma += ((lista[i+1]) - (lista[i]))
    return suma
 

lista1 = [3, 7, 14, -20, 56, 4, 7, 8, 9] 

print(sumatorio_dif(lista1))

      