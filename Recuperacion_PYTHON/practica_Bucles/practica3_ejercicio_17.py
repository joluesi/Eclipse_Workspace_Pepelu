'''
Created on 17 mar. 2019
Práctica 3 - Ejercicio 17.
Escribir un programa que haga que el usuario piense un número entero de 1 a 100, el
programa deberá adivinarlo en el menor número de intentos posible. Al final debe decir en
cuántos intentos lo ha conseguido.
@author: joseluis
'''
import random

print("Piense un número del 0 al 100 (no me engañe ni cambie de número): ")
input("ENTER para comenzar")
cont = 0
acertado = False
menor = 0
mayor = 100

while not acertado:
    numGen = random.randint(menor, mayor)   
    opcion = input("Es el "+ str(numGen) + "? (m-mayor, n-menor, i-igual) ")
        
    if opcion == "m":
        menor = numGen + 1
        cont += 1
    elif opcion == "n":
        mayor = numGen - 1
        cont += 1
    else:
        acertado = True
        cont += 1
            
        if cont == 1:
            print("Qué bueno soy!!!, lo he acertado a la primera.")
        elif(cont <= 4):
            print("¡¡¡Soy bueno, lo he acertado en sólo",cont,"intentos!!!")
        elif(cont <= 7):
            print("Lo acerté!!!... pero necesité",cont,"intentos")
        elif(cont < 10):
            print("bufff¡¡¡...Lo conseguí tras",cont,"intentos")
        elif(cont >= 10):
            print("Por fin¡¡¡...Lo conseguí tras",cont,"intentos")
                        
        jugar = input("¿Desea jugar otra vez (S/N)?: ")
        if(jugar == 'S' or jugar == 's'):
            print("Piense un número del 0 al 100 (no me engañe ni cambie de número): ")
            input("ENTER para comenzar")
            cont = 0
            acertado = False  
            menor = 0
            mayor = 100   
            numGen = random.randint(menor, mayor)                         
        else:
            acertado = True 
            print("Adiós!!!") 

    
