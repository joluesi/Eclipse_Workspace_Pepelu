'''
Created on 20 mar. 2019

@author: joseluis
'''

a = [0] * 6
print(a)

c = [a] * 3
print(c)

c[0][0] = 1
print(c)

# lo mismo, pero en un paso
M = [[0] * 6] * 3
print(M)
M[0][0] = 1
print(M)

#Apartado 5.4.1 - Sobre la  creación de matrices
matriz = []
for i in range(0,3):
    x = [0] * 6
    matriz.append(x)
print(matriz)
matriz[0][0] = 1
print(matriz)



        
        
        
        
        
        
