'''
Created on 1 abr. 2019
Ejercicio libro 272. Función que devuelve el producto de todos los números de una lista.
@author: joseluis
'''

def producto_lista(lista):
    
    producto = 1
    if len(lista) > 0:
        for num in lista:
            producto *= num
        
    else:
        producto = None
 
    return producto


lista1 = [0] 
print(producto_lista(lista1))