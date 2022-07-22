package pe.edu.upeu.arrays;

import java.util.Scanner;
/**
 * transformadas20eje
 */
public class transformadas20eje {
    Scanner cs=new Scanner(System.in);
    public void transformada05() {
        System.out.println("Ingrese dimension de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= f; c++) {
                matriz[f][(dimension - 1) - c] = String.valueOf(valor);
                valor++;

            }

        }
        imprimirMatriz(matriz);
    }
    public void transformada06() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valort = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna <= fila; columna++) {
                matriz[fila][columna] = String.valueOf(valort);
                valort++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void transformada07() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valort = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna <= (matriz.length - 1) - fila; columna++) {
                matriz[fila][columna] = String.valueOf(valort);
                valort++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void transformada08() {
        String[][] matriz;
        System.out.println("Ingrese la dimension de la Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese la valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = fila; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = String.valueOf(valor);
                valor++;

            }

        }
        imprimirMatriz(matriz);

    } 
    public void transformada09() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz[0].length - 1) - f; c <= matriz[0].length - 1; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void transformada10() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valort = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna <= fila; columna++) {
                matriz[fila][fila - columna] = String.valueOf(valort);
                valort++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void transformada11() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();  
        String[][] matriz=new String[dimension][dimension];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz[0].length-1-fila; columna>= 0; columna--) {
                matriz[fila][columna]=""+valorInit;
                valorInit++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void transformada12() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();  
        String[][] matriz=new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz[0].length-1; columna>=(0+fila) ; columna--) {
                matriz[fila][columna]=String.valueOf(valorInit);
                valorInit++;//1
            }
        } 
        imprimirMatriz(matriz);
    }
    public void transformada13() {
        
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();  
        String[][] matriz=new String[dimension][dimension];

        for (int columna = 0; columna < matriz.length; columna++) {
            for (int fila = 0; fila <= (matriz.length - 1) - columna; fila++) {
                matriz[fila][columna]=""+valorInit;
                valorInit++;
            }
        } 
        imprimirMatriz(matriz);
    }
    public void transformada14() {

        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        String[][] matriz = new String[dimension][dimension];
        for (int columnas = 0; columnas < matriz.length; columnas++) {
            for (int filas = 0; filas <= columnas; filas++) {
                matriz[filas][columnas] = String.valueOf(valor);
                valor=valor+1;
            }
        }
        imprimirMatriz(matriz);
     }
    public void transformada17() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor=cs.nextInt();            
        String[][] matriz=new String[dimension][dimension];   
        for (int c = matriz[0].length-1; c >=0 ; c--) {
            for (int f =0 ; f < matriz.length-((dimension-1)-c); f++) {               
                matriz[f][c]=String.valueOf(valor);
                valor++;
            }
        }        
        imprimirMatriz(matriz);
    }
    public void transformada20() {


        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = matriz[0].length - 1; fila >= 0; fila--) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[columna][fila] = String.valueOf(valor); 
                valor=valor+1;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public void transformada21() {
        String[][] matriz;
        System.out.println("Ingrese la dimension de la Matriz:");
        int dimension=cs.nextInt();//5
        System.out.println("");
        int valor=0;
        matriz=new String[dimension][dimension];
        for (int columna = 0; columna < matriz[0].length; columna++) {
            if(columna%2==0){
                 for (int fila = 0; fila < matriz.length; fila++) {
                     matriz[fila][columna]=String.valueOf(valor);
                     valor=valor+1;
                 }
            }else{
                for (int fila = matriz.length-1; fila >= 0; fila--) {
                     matriz[fila][columna]=String.valueOf(valor);
                     valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
     }
    public void transformada22() {

        String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=cs.nextInt();
       System.out.println("");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int columna = 0; columna < matriz[0].length; columna++) {
        if(columna%2==0){
            for (int fila = matriz.length-1; fila >= 0; fila--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
           }
        }else{
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
       imprimirMatriz(matriz);
    }
    public void transformada23() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valort = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int columna = (matriz[0].length - 1); columna >= 0; columna--) {
            if (columna % 2 == 0) {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valort);
                    valort = valort + 1;
                }
            } else {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valort);
                    valort = valort + 1;
                }
            }

        }
        imprimirMatriz(matriz);

    }
    public void transformada24() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valort = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int columna = (matriz[0].length - 1); columna >= 0; columna--) {
            if (columna % 2 == 0) {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valort);
                    valort = valort + 1;
                }
            } else {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valort);
                    valort = valort + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void transformada25() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valort = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            if (fila % 2 == 0) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] = String.valueOf(valort);
                    valort = valort + 1;
                }
            } else {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] = String.valueOf(valort);
                    valort = valort + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void transformada26() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valort = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            if (fila % 2 == 0) {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] = String.valueOf(valort);
                    valort = valort + 1;
                }
            } else {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] = String.valueOf(valort);
                    valort = valort + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void transformada28() {
        System.out.println("Ingrese la Dimension de la Matriz:"); 
        int dimension=cs.nextInt();
        System.out.println("");
        String[][] matriz=new String[dimension][dimension];
        int valor=0;
         for (int fila = matriz.length-1; fila >= 0; fila--) {
             if(fila%2==0){
                 for (int columna = 0; columna < matriz.length; columna++) {
                     matriz[fila][columna]=""+valor;
                     valor++;
                 }
             }else{
                 for (int columna = matriz[0].length-1; columna >= 0; columna--) {
                     matriz[fila][columna]=""+valor;
                     valor++;
                 }
             }
         }
         imprimirMatriz(matriz);
        }
    public void transformada29() {
        String[][] matriz;
        System.out.println("Ingrese la dimension de la Matriz:");
        int dimension=cs.nextInt();//5
        System.out.println("");
        int valor=0;
        matriz=new String[dimension][dimension];         
        for (int v = 0; v < dimension/2; v++) {
            for (int ls = v; ls < dimension-1-v; ls++) {
                matriz[v][ls]=String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld < dimension-1-v; ld++) {
                matriz[ld][dimension-1-v]=String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension-1-v; lin > v; lin--) {
                matriz[dimension-1-v][lin]=String.valueOf(valor);
                valor++;
            }
            for (int liz =dimension-1-v; liz > v; liz--) {
                matriz[liz][v]=String.valueOf(valor);
                valor++;
            }            
        }
        if (dimension%2!=0) {
            matriz[dimension/2][dimension/2]=String.valueOf(valor);
        }
        imprimirMatriz(matriz);

    }

    public void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if(m[f][c]==null){
                    System.out.print("\t");
                }else{
                    System.out.print(m[f][c]+"\t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //new transformadas20eje().transformada05();
        //new transformadas20eje().transformada06();
        //new transformadas20eje().transformada07();
        //new transformadas20eje().transformada08();
        //new transformadas20eje().transformada09();
        //new transformadas20eje().transformada10();
        //new transformadas20eje().transformada11();
        //new transformadas20eje().transformada12();
        //new transformadas20eje().transformada13();
        //new transformadas20eje().transformada14();
        //new transformadas20eje().transformada17();
        //new transformadas20eje().transformada20();
        //new transformadas20eje().transformada21();
        //new transformadas20eje().transformada22();
        //new transformadas20eje().transformada23();
        //new transformadas20eje().transformada24();
        //new transformadas20eje().transformada25();
        //new transformadas20eje().transformada26();
        //new transformadas20eje().transformada28();
        new transformadas20eje().transformada29();
    }


}
