'''
Created on 20/3/2019

@author: dam18-27
'''

M = []
for i in range (0, 4):
    M.append(list())
    for j in range(0, 4):
        if i == j:
            M[i].append(1)
        else:
            M[i].append(0) 
      
print(M)

#otra opción --> OJO! SÓLO FUNCIONA SI ES MATRIZ CUADRADA
'''
M = []
for i in range(0, 4):
    M.append([0] * 4)
    M[i][i] = 1
    
print(M)
'''
