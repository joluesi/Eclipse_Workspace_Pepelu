'''
Created on 21/3/2019

@author: dam18-27
'''
from generarLista import GenerarLista, Semejantes

M1 = GenerarLista()
M2 = GenerarLista()

print(M1)
print(M2)
'''
M1 = [[1,2,3], [1,2], [1]]
M2 = [[13,23,31], [10,27], [19]]
'''

if Semejantes(M1, M2):
    print("Son semejantes")
else:
    print("No son semejantes")


