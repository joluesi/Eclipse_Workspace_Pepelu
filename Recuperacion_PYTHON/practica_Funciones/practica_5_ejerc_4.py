'''
Created on 1 abr. 2019
Práctica 5.
Ejercicio 4.- Escribe un programa que lea un NIF sin letra por teclado, a continuación debe mostrar el NIF con la letra asociada. 
Debe contar con la función letra_nif que devuelva la letra correspondiente.
@author: joseluis
'''


def letra_nif(dniSinLetra):
    letrasDNI = {0:'T', 1:'R', 2:'W', 3:'A', 4:'G', 5:'M', 6:'Y', 7:'F', 8:'P', 9:'D', 10:'X', 11:'B', 
                12:'N', 13:'J', 14:'Z', 15:'S', 16:'Q', 17:'V', 18:'H', 19:'L', 20:'C', 21:'K', 22:'E'}
                            
    numero = int(dniSinLetra) % 23        
    return letrasDNI[numero]
    
dni = int(input("Introduzca número de DNI (sin letra): "))    
print("Su NIF es: "+str(dni)+letra_nif(dni))
