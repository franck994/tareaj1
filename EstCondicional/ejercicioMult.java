package EstCondicional;

import java.util.Scanner;

public class ejercicioMult {

   public void profesor () { 
    System.out.println("enseñar");
   }

   public void estudiante() {
    System.out.println("aprender o estudiar");   
   }

   public static void maquinapc() {
     System.out.println("procesa informacion");  
   }

   public static void proyecto() {
    System.out.println("proyecta imagenes");    
   }

    public static void main(String[] args) {

      ejercicioMult obj=new ejercicioMult();
      Scanner lt=new Scanner(System.in);
    System.out.println("ingrese el numero de algoritmo:\n1=profesor\n2=estudiante"+
    "\n3=maquinapc\n4=proyector");
      int opcionMet=lt.nextInt();
     switch (opcionMet) {
         case 1: obj.profesor(); break;
         case 2: obj.estudiante(); break; 
         case 3: maquinapc(); break;
         case 4: proyecto(); break;
         default:System.out.println("esa opcion no existe "); break;
     }
        
    }
}