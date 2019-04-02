'''
Created on 2 abr. 2019

@author: joseluis
'''

def empieza_minuscula(cadena):  
    if ord(cadena[0]) in range(97, 123):
        return True  
    else:
        return False

cadena = input("Introduzca cadena: ")
print(empieza_minuscula(cadena))