'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 11.
Escribir un programa que calcule el factorial de un número dado. 
@author: joseluis
'''

num = int(input("Introduce un número: "))

factorial = 1
for i in range (1, num):
    if num == 0 or num == 1:
        factorial = 1
    else:
        factorial = factorial * (i + 1)
    
print(str(num)+"! =", factorial)


