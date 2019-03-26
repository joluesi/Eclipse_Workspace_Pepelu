'''
Created on 26 mar. 2019
Práctica 4.
Ejercicio 5.- Desglose de cantidad en menor número de billetes y monedas posible. Debe haber una lista con billetes y monedas.
Versión 1.0 - Con bucle for.
@author: joseluis
'''

cantidad = int(input("Introduzca cantidad para desglose: "))

papelMoneda = [500, 200, 100, 50, 20, 10, 5, 2, 1]

for i in range(len(papelMoneda)):
    if cantidad >= papelMoneda[i]:
        desglose = cantidad // papelMoneda[i]
        if papelMoneda[i] >= 5:
            if desglose > 1:            
                print(desglose, "billetes de", papelMoneda[i])
            else:
                print(desglose, "billete de", papelMoneda[i])
        else:
            if desglose > 1:
                print(desglose, "monedas de", papelMoneda[i])
            else:
                print(desglose, "moneda de", papelMoneda[i])
                       
    cantidad = cantidad % papelMoneda[i]      
        
    
    