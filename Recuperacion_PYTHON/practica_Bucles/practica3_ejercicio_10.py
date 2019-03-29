'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 10.
Escribir un programa que tome 100 números aleatorios entre 0 y 99. A continuación debe
mostrar cuántos números están comprendidos en los intervalos [0-19], [20-39], [40-59], [60-79] y
[80-99]. 
@author: joseluis
'''
import random
cont1 = cont2 = cont3 = cont4 = cont5 = 0

for i in range (0, 100):
    num = random.randint(0, 99)

    if num <= 19:
        cont1 += 1
    elif num <= 39:
        cont2 += 1
    elif num <= 59:
        cont3 += 1
    elif num <= 79:
        cont4 += 1
    else:
        cont5 += 1    
        
print("[ 0-19]:", cont1)
print("[20-39]:", cont2)
print("[40-59]:", cont3)
print("[60-79]:", cont4)
print("[80-99]:", cont5)
print("Total: ", cont1 + cont2 + cont3 + cont4 + cont5)



