'''
Created on 14/3/2019

@author: dam18-27
'''

matriz = [[1, 2, 3], [2, 12, 6], [1, 0, -3], [0,-12, 0]]

for fila in matriz:
    for j in fila:    
        print(j, end = "\t")
    print()
    
print()

print("Columna:    1     2       3")
print("---------------------------")        
for i in range(len(matriz)):
    print("Fila: "+str(i)+" |", end = " ")
    for j in range(len(matriz[i])):        
        if matriz[i][j] > -10 and matriz[i][j] < 10:   # es para ajustar todos los numeros de 1 cifra    
            print(" ", end = "")
        if matriz[i][j] >= 0:   # es para ajustar los negativos (le mete espacio a los +)
            print(" ", end = "")
        print(matriz[i][j], end = "\t")        
    print()
    