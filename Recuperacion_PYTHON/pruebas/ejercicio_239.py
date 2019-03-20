'''
Created on 20 mar. 2019
Ejercicio 239 - libro python
@author: joseluis
'''
'''
matriz = []
for i in range(0, 4): 
    matriz.append([0] * 4)      
    for j in range(0, 4):
        if i == j:           
            matriz[i][j] = 1       
print(matriz)
'''

#Otra forma de hacer lo mismo, EN MATRICES CUADRADAS ¡ ¡ ¡ 
matriz = []
for i in range(0, 4): 
    matriz.append([0] * 4)                    
    matriz[i][i] = 1
        
print(matriz)
        