package pe.edu.upeu.arrays;

/**
 * matrizesejemplos
 */
public class matrizesejemplos {

    public void matricesbasicos() {
        int notas[][];//declarar una matriz
        int [][] notasx;
        notas=new int[2][2];//tamaño dimension
        notas[0][0]=20;
        notas[0][1]=18;
        notas[1][0]=16;
        notas[1][1]=10; 
        System.out.println(notas[1][1]);//mostrar nota
        System.out.println("cant filas"+notas.length);//cantidad de filas
        System.out.println("cant columnas"+notas[0].length);//cantidad columnas

        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c< notas[0].length; c++) {
                System.out.print(notas[f][c]+"\t");
                
            }
            System.out.println("");
            
        }
      
        
    }
    public static void main(String[] args) {
        new matrizesejemplos().matricesbasicos();
    }
}