'''
Created on 25 mar. 2019
Práctica 4.
Ejercicio 1 - Versión 1.b.- Dado un texto por el usuario formado por letras y espacios (introducido en una
cadena), escribir un algoritmo que obtenga la frecuencia de aparición de cada letra del alfabeto
en el texto. Finalmente debe aparecer cada letra junto al número de veces que aparece en el
texto.

@author: joseluis
'''

alfabeto = {'a':0, 'b':0, 'c':0, 'd':0, 'e':0, 'f':0,'g':0, 'h':0,'i':0,'j':0,'k':0,'l':0,'m':0,'n':0,'ñ':0,'o':0,
'p':0,'q':0,'r':0,'s':0,'t':0,'u':0,'v':0,'w':0,'x':0,'y':0,'z':0}

texto = input("Introduzca un texto: ")

for letra in texto:
    if letra in alfabeto.keys():
        alfabeto[letra] += 1
        
print(alfabeto)