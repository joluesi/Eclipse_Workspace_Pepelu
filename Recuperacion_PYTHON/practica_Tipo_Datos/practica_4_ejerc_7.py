'''
Created on 26 mar. 2019
Práctica 4.
Ejercicio 7.- Programa que lea una matriz de 5x5 de enteros y calcule y muestre la suma de sus filas y de sus columnas.
@author: joseluis
'''
from __future__ import print_function

matriz = []
for i in range(1,6):
    fila = input("Introduzca fila " + str(i) + ": ")
    fila = fila.split(sep = ' ', maxsplit = 4)  # maxsplit = 4 --> obliga a tener 5 números por fila (hace 4 particiones)
    matriz.append(fila)

#print(matriz)

totalFilas = []
sumaFilas = 0

for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        sumaFilas += int(matriz[i][j])
    totalFilas.append(sumaFilas)
    sumaFilas = 0
       
print("Totales filas:", end = ' ')
for i in totalFilas:
    print(i, end = ' ')

totalColumnas = []
sumaColumnas = 0

for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        sumaColumnas += int(matriz[j][i])
    totalColumnas.append(sumaColumnas)
    sumaColumnas = 0

print()
print("Totales columnas:", end = ' ')
for i in totalColumnas:
    print(i, end = ' ')

print()
sumaDiagonal = 0
diagonal_P = []
#añado operaciones con diagonal principal
for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        if i == j:
            sumaDiagonal += int(matriz[i][i])
            diagonal_P.append(matriz[i][j])

print("Total Diagonal principal:", sumaDiagonal)
print("Diagonal Principal:", end = ' ')
for i in diagonal_P:
    print(i, end = ' ')


print()
sumaDiagonal = 0
diagonal_S = []
#añado operaciones con diagonal secundaria
for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        if (i + j) == len(matriz) - 1:
            sumaDiagonal += int(matriz[i][j])
            diagonal_S.append(matriz[i][j])

print("Total Diagonal Secundaria:", sumaDiagonal)
print("Diagonal Secundaria:", end = ' ')
for i in diagonal_S:
    print(i, end = ' ')





