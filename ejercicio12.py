#definir variable 
descuento:float=0.20
igv:float=0.18
pbase:float
pcd:float
pf:float
#datos de entrada
pbase=float(input("ingrese precio del articulo"))
#proceso 
pcd=pbase-(pbase*descuento)
igv=pcd*0.18
pf=pcd+igv
#datos de salida 
print(f"el precio con descuento es:{pcd}")
print(f"el precio final es:{pf}")