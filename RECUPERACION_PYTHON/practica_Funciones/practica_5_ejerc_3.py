'''
Created on 2 abr. 2019
Práctica 5.
Ejercicio 3.- Escribe un programa que lea una cadena de texto, a continuación debe comprobar que se trata de un NIF correcto (8 dígitos y 1 letra). 
Debe contar con la función 'es_nif' que devuelva si el NIF es correcto o no.
@author: joseluis
'''

def es_nif(dniSinLetra, letra):
    letrasDNI = {0:'T', 1:'R', 2:'W', 3:'A', 4:'G', 5:'M', 6:'Y', 7:'F', 8:'P', 9:'D', 10:'X', 11:'B', 
                12:'N', 13:'J', 14:'Z', 15:'S', 16:'Q', 17:'V', 18:'H', 19:'L', 20:'C', 21:'K', 22:'E'}
    
    letra = letra.upper()                        
    numero = int(dniSinLetra) % 23        
    if letrasDNI[numero] == letra:
        return True
    else:
        return False


cadena = input("Introduzca NIF(8dígitos+1letra): ")
digitos = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
contadorDigitos = 0

'''
OTRA OPCIÓN PARA SACAR LOS DÍGITOS:
for i in range(len(cadena)):
    if ord(cadena[i]) in range(48, 58): # utilizo los códigos equivalentes del ASCII(del 48 al 58 son los digitos del 0 al 9) y cada carácter de la cadena
                                        # lo transformo con ord() --> recibe un carácter y devuelve un entero del código ASCII 
        contadorDigitos += 1                                chr() --> recibe un entero y devuelve el carácter equivalente
'''
for i in range(len(cadena)):
    if cadena[int(i)] in digitos:
        contadorDigitos += 1

if contadorDigitos == 8:
    if es_nif(int(cadena[0:8]), cadena[8]):
        print ("NIF correcto")
    else:
        print("letra de NIF incorrecta")
else:
    print("Introduzca DNI de 8 números")
            
            
    
        
            
         
         