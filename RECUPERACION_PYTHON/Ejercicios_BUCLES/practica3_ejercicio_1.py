'''
Created on 13 mar. 2019
Pr�ctica 3 - Ejercicio 1.
Programa que lee un n�mero y muestra la tabla de multiplicar de dicho n�mero. Hacer el
ejercicio de dos formas, con bucle while y con bucle for
'''

num = int(input("Introduzca un n�mero del 1 al 10: "))

i = 0
while (i >= 0 and i <= 10):
    print(num, "x", i, "=", num*i)
    i += 1

print()    
    
for i in range(0, 11):
        print(num, "x", i, "=", num*i)



