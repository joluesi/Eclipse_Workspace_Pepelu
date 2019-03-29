'''
Created on 25 mar. 2019
Práctica 4.
Ejerc.- 1. Programa que cuente el número de vocales de una frase.
@author: joseluis
'''

vocales = {'a': 0, 'e': 0, 'i': 0, 'o': 0, 'u': 0}

frase = input("Introduzca una frase: ")

for letra in frase:
    if letra in vocales.keys():
            vocales[letra] += 1

print(vocales)

        
        