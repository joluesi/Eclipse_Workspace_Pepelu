'''
Created on 2 abr. 2019
Práctica 5.
Ejercicio 7.- Diseña una función que, dada una lista de cadenas, devuelva una lista con todas las cadenas más
largas, es decir, si dos o más cadenas miden lo mismo y son las más largas, la lista las contendrá a todas.
@author: joseluis
'''

def cadenas_mas_largas(lista):
    
    
    listaFinal = []
    maximo = 0
    for cad in range(len(lista)):                
        if len(lista[cad]) > maximo:
            maximo = len(lista[cad])
            
    for cad in range(len(lista)):    
        if len(lista[cad]) == maximo:    
            listaFinal.append(lista[cad])
            
    return listaFinal

print(cadenas_mas_largas(['Pepe', 'Ana', 'Juan', 'Paz']))