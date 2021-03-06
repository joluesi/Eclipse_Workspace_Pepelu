'''
Created on 25 mar. 2019
Práctica 4.
Ejercicio 2- Una empresa multinacional dispone de una secuencia FEMPLE (versión con un diccionario), con los datos de sus empleados. Cada elemento
tiene la siguiente información (en la primera versión se pueden poner los datos fijos de la
secuencia):
Número de empleado
Nombre
Categoría
País al que pertenece
Las categorías laborales son A, B, C, D, E, F. La empresa tiene empleados destinados en 7
países (Francia, España, Portugal, Alemania, Suiza, Noruega, China).
A partir de esta secuencia se desea obtener la siguiente información:
 Número total de empleados por categoría
 Número total de empleados por país
 País con máximo número de empleados (se supone que no hay dos países
coincidentes en ello).
@author: joseluis
'''

empleados = [{'numero' : 1, 'nombre' : 'pepito', 'categoria' : 'A', 'pais' : 'España'},
             {'numero' : 2, 'nombre' : 'juanito', 'categoria' : 'B', 'pais' : 'Francia'},
             {'numero' : 3, 'nombre' : 'jorgito', 'categoria' : 'C', 'pais' : 'Portugal'},
             {'numero' : 4, 'nombre' : 'jaimito', 'categoria' : 'D', 'pais' : 'Alemania'},
             {'numero' : 5, 'nombre' : 'luis', 'categoria' : 'E', 'pais' : 'Suiza'},
             {'numero' : 6, 'nombre' : 'rafa', 'categoria' : 'F', 'pais' : 'Noruega'},
             {'numero' : 7, 'nombre' : 'laura', 'categoria' : 'A', 'pais' : 'China'},
             {'numero' : 8, 'nombre' : 'ana', 'categoria' : 'B', 'pais' : 'España'},
             {'numero' : 9, 'nombre' : 'rosa', 'categoria' : 'B', 'pais' : 'España'}]


categorias = {'A': 0, 'B': 0, 'C': 0, 'D': 0, 'E': 0, 'F': 0}

for emple in empleados:
    if emple['categoria'] in categorias.keys():
        categorias[emple['categoria']] += 1        
print(categorias)        

'''
Otra forma más explícita de recorrer el bucle anterior:

for emple in empleados:  
    if emple['categoria'] == 'A':
        categorias['A'] += 1
    elif emple['categoria'] == 'B':    
        categorias['B'] += 1
    elif emple['categoria'] == 'C':    
        categorias['C'] += 1
    elif emple['categoria'] == 'D':    
        categorias['D'] += 1
    elif emple['categoria'] == 'E':    
        categorias['E'] += 1
    elif emple['categoria'] == 'F':    
        categorias['F'] += 1        
print(categorias)   
'''
print()
print("Empleados por categoría: ")
print("Categoría A:", categorias['A'], "empleados")
print("Categoría B:", categorias['B'], "empleados")
print("Categoría C:", categorias['C'], "empleados")
print("Categoría D:", categorias['D'], "empleados")
print("Categoría E:", categorias['E'], "empleados")
print("Categoría F:", categorias['F'], "empleados")
print()
paises = {'Francia': 0, 'España': 0, 'Portugal': 0, 'Alemania': 0, 'Suiza': 0, 'Noruega': 0, 'China': 0}

for emple in empleados:
    if emple['pais'] in paises.keys():
        paises[emple['pais']] += 1       
print(paises)

print()
print("Empleados por países: ")
print("España:", paises['España'], "empleados")
print("Francia:", paises['Francia'], "empleados")
print("Portugal:", paises['Portugal'], "empleados")
print("Alemania:", paises['Alemania'], "empleados")
print("Suiza:", paises['Suiza'], "empleados")
print("Noruega:", paises['Noruega'], "empleados")
print("China:", paises['China'], "empleados")
print()

mayor = 0
for pais in paises:
    if mayor < paises[pais]:
        mayor = paises[pais]
        paisBuscado = pais
#print(mayor)
#print(paisBuscado)

print("El país con mayor número de empleados es", paisBuscado)

    
    
























