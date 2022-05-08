#Declarar Variables
pagohora:float
cantidadhora:float
suelsemanal:float
#Datos de Entrada
pagohora=float(input("Ingrese el costo por hora:"))
cantidadhora=float(input("Ingrese cantidad horas trabajadas en la semana:"))
#Proceso y Datos de Salida
if cantidadhora>40:
  suelsemanal=40*pagohora+2*((cantidadhora-40)*pagohora)
else:
  suelsemanal=cantidadhora*pagohora
#Datos de Salida
print(f"El sueldo del trabajador es {suelsemanal}")