'''
Created on 14 mar. 2019
Práctica 3 - Ejercicio 9.
Escribir un programa para calcular superficies. Constará de un menú que solicitará la figura a
la que se va a calcular la superficie, pedirá los datos (lado, base y altura, radio ...) según la figura
de la que se trate y visualizará el resultado. El programa deberá calcular superficies de las
siguientes figuras: cuadrados, triángulos y círculos.
@author: joseluis
'''
from math import pi

opcion = ""
while opcion != 4:
    
    print("Cálculo de superficies: ")
    print("1.- Cuadrados")
    print("2.- Triángulos")
    print("3.- Círculos")
    print("4.- Salir")
    opcion = int(input("Elija opción (1-4): "))
    
    if opcion == 1:
        lado = float(input("Lado: "))
        superficie = lado * lado
        print ("La superficie del cuadrado es de", round(superficie, 2), "cm²")        
        print()
        
    elif opcion == 2:
        base = float(input("Base: "))
        altura = float(input("Altura: "))
        superficie = (base * altura) / 2
        print ("La superficie del triángulo es de", round(superficie, 2), "cm²")
        print()
        
    elif opcion == 3:
        radio = float(input("Radio: "))        
        superficie = pi * radio**2
        print ("La superficie del circulo es de", round(superficie, 2), "cm²")        
        print()
        
    elif opcion == 4:
        salir = True
        print("Adiós")
        
                

        
    