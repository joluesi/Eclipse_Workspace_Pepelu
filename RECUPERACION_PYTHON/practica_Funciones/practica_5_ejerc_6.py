'''
Created on 2 abr. 2019
Práctica 5.
Ejercicio 6.- Escribe una función que lea una cadena de texto y nos diga si la cadena está formada
mediante la concatenación de una cadena consigo misma. 
@author: joseluis
'''

def es_repeticion(cadena):
    if len(cadena) % 2 == 0: 
        
        mitad1 = cadena[:(len(cadena) //2)]
                
        mitad2 = cadena[(len(cadena) //2):]
        
        if mitad1 == mitad2:
            return True
        else:
            return False

    else:
        return False
    
print(es_repeticion('abcabc'))
