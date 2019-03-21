'''
Created on 20 mar. 2019
Apartado 5.4.2 - libro python
@author: joseluis
'''

m = int(input("Introduzca filas de la matriz: "))
n = int(input("Introduzca columnas de la matriz: "))
M = []
for i in range(0, m): 
    M.append([0] * n)      
    for j in range(0, n):                   
        M[i][j] = float(input("Dame el elemento ({0},{1}): ".format(i, j)))  
           
print(M)





        