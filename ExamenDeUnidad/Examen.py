def ejercicio1 ():
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
def ejercico2 ():
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
def ejercicio3 ():
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
def ejercicio4 ():
    #definir variable
    genero:str()
    edad:int()
    mensaje:float


ejercicio3()
    

  


    




    

    
