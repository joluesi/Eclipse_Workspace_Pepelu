'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 8.
Escribir un programa que “dibuje” un mes del calendario. El programa recibirá como entrada el
número de días del mes y el día de la semana del primer día del mes. Ejemplo:
@author: joseluis
'''

numDias = -1
diaSemana = -1
while numDias <= 0 or numDias > 31:
    numDias = int(input("Número de días del mes: "))
    
while diaSemana < 0 or diaSemana > 6:
    diaSemana = int(input("Día 1 es (0 - Lunes, 6 - Domingo): "))
    
print (" L  M  X  J  V  S  D")
print ("   "*diaSemana, end = "")

for i in range (1, numDias+1):
    if i < 10:
        print (" ", end = "")
    print(str(i) + " ", end = "")
    diaSemana += 1
    if (diaSemana % 7 == 0):
        print()
        
        
    
    
        
    

    