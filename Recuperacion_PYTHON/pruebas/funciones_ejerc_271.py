'''
Created on 1 abr. 2019
Ejercicio libro 271. Función que devuelve la media de una lista de números.
@author: joseluis
'''

def media_lista(lista):

    if len(lista) > 0:
        media = sum(lista) / len(lista)
            
    else:
        media = 0
 
    return media


lista1 = [1, 2, 3, 4, 4] 
print(media_lista(lista1))
