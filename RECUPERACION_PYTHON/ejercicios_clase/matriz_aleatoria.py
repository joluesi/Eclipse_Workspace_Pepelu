'''
Created on 21/3/2019
Generar matrices aleatorias de máximo 5 filas y columnas, con un máximo de 9 elementos
@author: dam18-27
'''

from random import randint

M = []

for i in range (randint(1,5)):
    M.append(list())
    for j in range (randint(1,5)):
        M[i].append(randint(0,9))
        
print(M)