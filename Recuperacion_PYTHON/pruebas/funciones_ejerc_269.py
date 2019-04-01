'''
Created on 1 abr. 2019
Ejercicio libro 269. Función que devuelve el número de series en una lista.
@author: joseluis
'''

def numero_series(lista):
    series = 1    
    i = 0
    while i < len(lista):
        if (lista[i-1] == lista[i]):
            series += 1                  
        else:
            series += 1
        i += 1  
 
    return series


lista1 = [1, 1, 8, 8, 8, 8, 0, 0, 0, 8] 
print(numero_series(lista1))
