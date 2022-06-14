package pe.edu.upeu.arrays;

/**
 * Vectoresejemplo
 */
public class Vectoresejemplo {

     public void vectorex() {
         int edades[]=new int [10];
         edades=new int[12];
         edades[0]=20;
         edades[1]=18;
         edades[11]=30;
        System.out.println("edades");
        System.out.println("indice 0:"+edades[0]);
        System.out.println("indice 11:"+edades[11]);
        //forma dos 
        System.err.println("forma dos");
        int edadesx[]={20,18,30,40,16};
        System.out.println(edadesx.length);
        System.out.println("indice 0:"+edades[0]);
        System.out.println("indice 4:"+edades[4]);


         
     }

     public static void main(String[] args) {
         Vectoresejemplo objx=new Vectoresejemplo();
         objx.vectorex();
         new Vectoresejemplo().vectorex();
         
     }

    
}