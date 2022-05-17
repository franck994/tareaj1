package UNIejer;

import java.util.Scanner;

/**
 * ejercicio418
 */
public class ejercicio418 {

    static Scanner lt=new Scanner(System.in);

    public static void inpuestovehiculo418() {
        //definir variables
        int cantidad=0;
        double costov=0,inpunit=0,imptotal=0,totalimpuv=0;
        //datos de entrada y proceso y salida
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese cantidad vehiculos de categoorias"+(i+1)+": ");
            cantidad=lt.nextInt();
            System.out.println("ingrese el precio de la categoria"+(i+1)+": ");
            costov=lt.nextDouble();
            if(i==0){
                inpunit=costov*0.10;
            }else if(i==1){
                inpunit=costov*0.07;
            
            }else {
                imptotal=costov*0.05;
            
            }
            imptotal=inpunit*cantidad;
            System.out.println("impuesto de categorias "+(i+1)+"es:"+inpunit);
            System.out.println("impuesto total de categorias "+(i+1)+"es:"+imptotal);
            totalimpuv=totalimpuv+imptotal;
            
        }
        System.out.println("impuesto total de los vehiculos es: "+totalimpuv);              
        
    }
    public static void main(String[]arg) {
        inpuestovehiculo418();
    }
}