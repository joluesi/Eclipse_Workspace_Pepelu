'''
Created on 21/3/2019

@author: dam18-27
'''

from random import randint

def GenerarLista():
    M = list()
    for i in range(randint(1,5)):
        M.append(list())
        for j in range(randint(1,5)):
            M[i].append(randint(0,9))
    return M


def Semejantes(m1, m2):
    if len(m1) == len(m2): #si ambas matrices tienen igual número de sublistas
        for i in range(len(m1)): # entonces, recorro cada una de las listas
            if len(m1[i]) == len(m2[i]): # si la longitud de cada lista es igual
                semejantes = True # son semejantes
            else:
                semejantes = False
                break
    else:
        semejantes = False
    
    return semejantes

 
'''
modifico Semejantes para quitar el break (práctica para examen)
NOTA: CUANDO QUITO UN FOR POR UN WHILE, TENGO QUE PONER 3 CONDICIONES:
    - variable contador
    - pregunta la longitud / condiciones del while
    - actualizar contador 

def Semejantes(m1, m2):
    if len(m1) == len(m2):
        semejantes = True
        i = 0
        while semejantes and i < len(m1):
            if len(m1[i]) != len(m2[i]):
                semejantes = False
            i += 1
            
    else:
        semejantes = False
    
    return semejantes
'''    



