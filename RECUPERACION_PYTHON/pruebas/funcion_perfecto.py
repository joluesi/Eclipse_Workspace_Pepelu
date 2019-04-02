'''
Created on 2 abr. 2019

@author: joseluis
'''


def es_perfecto(num):
    suma = 0
    for i in range(1, num):      
        if num % i == 0:
            suma += i
    
    if suma == num:
        return True
    else:
        return False
    
print(es_perfecto(28))

    