'''
Created on 2 abr. 2019

@author: joseluis
'''


cadena = "34829857Z"
digitos = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
contadorDigitos = 0

for i in range(len(cadena)):
    if cadena[i] in digitos:
        contadorDigitos += 1

print(contadorDigitos)


