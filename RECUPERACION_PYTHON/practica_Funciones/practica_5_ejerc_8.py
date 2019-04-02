'''
Created on 2 abr. 2019
Práctica 5.
Ejercicio 8.- Dos listas con igual número de elementos. Crear funciones que relacionen ambas.
@author: joseluis
'''

alumnos = ['Ana Pi', 'Pau Lopez', 'Luis Sol', 'Mar Vega', 'Paz Mir']

notas = [10, 5.5, 2.0, 8.5, 7.0]
'''
Procedimiento que recibe como datos las 2 listas y una cadena con el nombre del estudiante. Si pertenece a la lista, el procedimiento
imprimirá su nombre y nota en pantalla, de lo contrario mostrará mensaje que lo advierta.
'''
def muestra_nota_de_alumno(alumnos, notas, alumno_buscado):
    for i in range(len(alumnos)):
        if alumnos[i] == alumno_buscado:
            print(alumno_buscado, "tiene un", notas[i])
            return 
    print("El alumno {0} no pertenece al grupo".format(alumno_buscado))
    
muestra_nota_de_alumno(alumnos, notas, 'Pau Lopez')

'''
1) Diseñar una función que reciba las dos listas y que devuelva el nombre de todos los estudiantes
que aprobaron el examen
'''

print("Alumnos aprobados: ", end = '')  
 
def alumnos_aprobados (al, nota):
    for i in range(len(nota)):
        if nota[i] >= 5: 
            print(al[i], end = ', ')
                   
alumnos_aprobados(alumnos, notas)            





