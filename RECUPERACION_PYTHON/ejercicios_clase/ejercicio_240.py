'''
Created on 20 mar. 2019
Ejercicio 240 - libro python
@author: joseluis
'''

n = int(input("Introduzca dimensión de la matriz: "))
M = []
for i in range(0, n): 
    M.append([0] * n)      
    for j in range(0, n):
        if i == j:           
            M[i][j] = 1       
print(M)


#Otra forma de hacer lo mismo, EN MATRICES CUADRADAS ¡ ¡ ¡ 
'''
n = int(input("Introduzca dimensión de la matriz: "))


M = []
for i in range(0, n): 
    M.append([0] * n)                    
    M[i][i] = 1        
print(M)
'''


        