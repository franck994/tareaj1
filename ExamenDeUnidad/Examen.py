def ejercicio1_FLIH ():
    #1.- Diseñe un algoritmo que permita determinar el nivel del perfil de ingreso de un postulante con la 
    #que obtiene una vacante a la carrera de ingeniería de Sistemas; considerando que, si su nota es mayor 
    #o igual a 17 su nivel es 4, si la nota es menor de 17 y mayor o igual a 14 su nivel es 3, si su nota es 
    #menor a 14 y mayor o igual a 11 su nivel es 2; mientras que si su nota es menor de 11 ya no puede 
    #obtener la vacante y por ende también está en el nivel 1.
    #Considera que la nota final es vigesimal según el siguiente ponderado:
    #Examen de conocimiento 40%
    #Entrevista Personal 35%
    #Test Psicológico 25%

    #definir variables
    excom:float()
    enpe:float()
    test:float()
    pan:float()
    queso:float()
    jamon:float()
    nota:float()
    nivel:float()
    #datos de entrada 
    excom=float(input("ingrese su nota del examen 0 a 20"))
    enpe=float(input("ingrese su nota de extrevista 0 a 20"))
    test=float(input("ingrese nota de test personal 0 a 20"))
    #proceso
    jamon=excom*0.4
    queso=enpe*0.35
    pan=test*0.25
    nota=pan+queso+jamon
    if nota>20:
       nivel=("introduzca de nuevo los datos")
    elif nota>=17:
       nivel=("su nivel es 4")
    elif nota<17 and nota>=14:
        nivel=("su nivel es 3")
    elif nota<14 and nota>=11:
        nivel=("su nivel es 2")
    else:
         nota<11
         nivel=("su nivel es 1,no obtiene vacante")
    #datos de salida
    print(f"{nivel}")
    de
def ejercico2_FLIH ():
    #2.-Tiendas Plaza Norte desea un programa que permita calcular el IVG de la venta de sus artefactos 
    #además desea hacer un descuento de 10% cuando el monto base de venta supera los 2000 soles, 
    #mientras que si el monto supera los 1000 desea hacer un descuento del 5% Y si supera los 500 soles 
    #realiza un descuento del 2%, El algoritmo debe permitir calcular el IGV, el descuento y el monto total 
    #a pagar.

    #definir variable
    igv:float()
    descu:float()
    preciob:float()
    montotal:float()
    pfi:float()
    #datos de entrada
    preciob=float(input("ingrese el precio del articulo"))
    #proceso
    if preciob>=2000:
       descu=preciob*0.10
    elif preciob>=1000 and preciob<2000:
       descu=preciob*0.05
    elif preciob>=500 and preciob<1000:
        descu=preciob*0.02
    else:
        descu=preciob*0   
    montotal=preciob-descu
    igv=montotal*0.18
    pfi=montotal+igv
    #datos de salida
    print(f"el igv total es:{igv}")
    print(f"el descuento es:{descu}")
    print(f"el monto total a pagar es:{montotal}")
def ejercicio3_FLIH ():
    #3.-Diseñar un algoritmo que permita calcular una operación aritmética entre 2 valores introducidos y 
    #el signo correspondiente por teclado: si es el signo es + debe realizar una suma, si es el signo – debe 
    #realizar la resta, si es el signo / debe realizar la división, si es el signo * debe realizar la multiplicación, 
    #si es el signo ^ debe calcular la potencia; por otro lado, si introduce R debe permitir calcular la raíz 
    #cuadrada de un número, si introduce % debe permitir calcular el módulo de 2.

    #definir variable
    priN:float()
    seguN:float()
    simbolo:str()
    total:float()
    #datos de entrada
    priN=float(input("ingrese el primer numero"))
    seguN=float(input("ingrese el segundo numero"))
    print("+=suma")
    print("-=resta")
    print("/=divicion")
    print("*=multiplicacion")
    print("^=potencia")
    print("R=raiz")
    print("%=mudulo de 2")
    simbolo=str(input("ingrese simbolo"))
    #proceso
    if simbolo=="+":
        total=priN+seguN
    elif simbolo=="-":
        total=priN-seguN
    elif simbolo=="/":
        total=priN/seguN
    elif simbolo=="*":
        total=priN*seguN
    elif simbolo=="^":
        total=priN**seguN
    elif simbolo=="R":
        total=priN**(seguN**-1)
    else:
        total=9
    #datos de salida
    print(f"el resultado es:{total}")
def ejercicio4_FLIH ():
    #4.-Secretaría de salud requiere un algoritmo que permita determinar qué tipo de vacuna (A, B o C) 
    #aplicar a una persona, considerando que, si es mayor de 70, sin importar el sexo, se le aplica el tipo C; 
    #si tiene entre 16 y 69 años, y es mujer se le aplica el tipo B, y si es hombre, la A; sí es menor de 16 
    #años, se aplica el tipo A sin importar el sexo.

    #definir variable
    genero:str()
    edad:int()
    mensaje:float
    #Datos de entrada
    edad=int(input("Ingrese la cantidad de años: "))
    genero=str(input("Ingrese el genero (masculino o femenino): "))
    #Proceso
    if edad>=70:
        mensaje=("Su vacuna es de tipo C")
    elif edad>=16 and edad<70 and genero=="masculino":
        mensaje=("Su vacuna es de tipo A")
    elif edad>=16 and edad<70 and genero=="femenino":
        mensaje=("Su vacuna es de tipo B")
    else:
        mensaje=("Su vacuna es de tipo A")
    #Datos de salida
    print(mensaje)
def ejercicio5_FLIH():
    #5.-Realice un algoritmo que permita probar uno de los 3 algoritmos que ha diseñado anteriormente 
    #aplicando una estructura condicional múltiple o algo similar, y las estructuras de control que se 
    #requieran para tal fin.

    #Definir variables
    nivel=float()
    #Datos de entrada
    nivel=float(input("Ingrese el numero del ejercicio(1-4): "))
    #Proceso
    if nivel>=5:
        print("Ese ejercicio no existe ingrese otro")
    elif nivel==4:
        ejercicio4_FLIH()
    elif nivel==3:
        ejercicio3_FLIH()
    elif nivel==2:
        ejercicio2_FLIH()
    else:
        ejercicio1_FLIH()


ejercicio5_FLIH()
    

  


    




    

    
