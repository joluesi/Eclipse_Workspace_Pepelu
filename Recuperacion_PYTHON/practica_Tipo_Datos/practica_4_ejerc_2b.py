'''
Created on 25 mar. 2019
Práctica 4.
Ejercicio 2b- Una empresa multinacional dispone de una secuencia FEMPLE (versión con listas) con los datos de sus empleados. Cada elemento
tiene la siguiente información (en la primera versión se pueden poner los datos fijos de la
secuencia):
Número de empleado
Nombre
Categoría
País al que pertenece
@author: joseluis
'''

empleados = [[1, 'pepito', 'A', 'España'],
             [2, 'juanito', 'B', 'Francia'],
             [3, 'jorgito', 'C', 'Portugal'],
             [4, 'jaimito', 'D', 'Alemania'],
             [5, 'luis', 'E', 'Suiza'],
             [6, 'rafa', 'F', 'Noruega'],
             [7, 'laura', 'A', 'China'],
             [8, 'ana', 'B', 'España'],
             [9, 'rosa', 'B', 'España']]


categorias = ['A', 'B', 'C', 'D', 'E', 'F']
paises = ['España', 'Francia', 'Portugal', 'Alemania', 'Suiza', 'Noruega', 'China']

emple_x_categoria = [0,0,0,0,0,0]
emple_x_pais = [0,0,0,0,0,0,0]

for emple in empleados:
    if emple[2] == 'A' or 'A' in emple: # puedo buscar de ambas formas
        emple_x_categoria[0] += 1
    elif emple[2] == 'B':
        emple_x_categoria[1] += 1
    elif emple[2] == 'C':
        emple_x_categoria[2] += 1
    elif emple[2] == 'D':
        emple_x_categoria[3] += 1
    elif emple[2] == 'E':
        emple_x_categoria[4] += 1
    elif emple[2] == 'F':
        emple_x_categoria[5] += 1

print(emple_x_categoria)   

print()
print("Empleados por categoría: ")
for i in range(len(emple_x_categoria)):
    print("\t", "Categoría:", categorias[i], "-->", emple_x_categoria[i], "empleados")

print()

for emple in empleados:
    if emple[3] == 'España' or 'España' in emple:  # puedo buscar de ambas formas
        emple_x_pais[0] += 1
    elif emple[3] == 'Francia':
        emple_x_pais[1] += 1
    elif emple[3] == 'Portugal':
        emple_x_pais[2] += 1
    elif emple[3] == 'Alemania':
        emple_x_pais[3] += 1
    elif emple[3] == 'Suiza':
        emple_x_pais[4] += 1
    elif emple[3] == 'Noruega':
        emple_x_pais[5] += 1
    elif emple[3] == 'China':
        emple_x_pais[6] += 1   

print(emple_x_pais)

print()

print("Empleados por país: ")
for i in range(len(emple_x_pais)):
    print("\t", paises[i], "-->", emple_x_pais[i], "empleados")
            
mayor = 0
for i in range(len(emple_x_pais)):
    if mayor < emple_x_pais[i]:
        mayor = emple_x_pais[i]
        paisBuscado = paises[i]
print()

print("El país con mayor número de empleados es", paisBuscado)


