'''
Created on 13 mar. 2019
Práctica 3 - Ejercicio 3. Programa que lee notas de los alumnos y dice cuántos están aprobados y cuál es la nota
media. El programa dejará de pedir notas, cuando se pulse la tecla ENTER
@author: joseluis
'''

print("Introduzca las notas, ENTER para terminar: ")

i = 1
aprobados = 0
suspensos = 0
sumaNotas = 0
salir = False 
while not salir:
        
    nota = input("Nota del alumno " + str(i) + ": ")
    if nota != "":
        nota = float(nota)
        if nota >= 5:
            aprobados += 1
        else:
            suspensos += 1
        sumaNotas += nota  
        i += 1       
    else:
        salir = True   
              
alumnos = i - 1
print("Número de alumnos: ", alumnos)
print("Aprobados: ", aprobados)
print("Suspensos: ", suspensos)
print("Nota media: ", round(sumaNotas/alumnos, 2))

