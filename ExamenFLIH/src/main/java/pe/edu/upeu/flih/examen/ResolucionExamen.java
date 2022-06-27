paquete  pe.edu.upeu.flih.examen;

importar  java.útil.escáner ;

public  class  ResolucionExamen{
    Scanner  leer = nuevo  Scanner ( System . in );

    public void exaxmen2 () {
        // definir variables
        int  yo , n = 3 ;
        doble  cate1 , cate2 , cate3 , clave , costo ;
        doble  impuesto , impuestopagar ;
        cate1 = 0 ;
        cate2 = 0 ;
        cate3 = 0 ;
        impuestopagar = 0 ;
        // datos de entrada proceso y salida
        sistema _ fuera _ print ( "Ingresa el numero de autos:" );
        n = leer . siguienteInt ();

        para ( yo = 1 ; yo <= norte ; yo ++) {
            sistema _ fuera _ imprimir ( "PROCESO" + i );

            sistema _ fuera _ print ( "Ingresa la categoria 1-2-3:" );
            clave = leer . siguienteDoble ();

            Leer _ siguienteLinea ();
            sistema _ fuera _ print ( "Ingresa el costo del vehiculo:" );
            costo = leer . siguienteDoble ();
            Leer _ siguienteLinea ();
            impuesto = 0 ;
            if ( clave == 1 ) {
                impuesto = costo * 0.1 ;
                cate1 = cate1 + impuesto ;
            }
            si ( clave == 2 ) {
                impuesto = costo * 0.07 ;
                cate2 = cate2 + impuesto ;
            }
            if ( clave == 3 ) {
                impuesto = costo * 0.05 ;
                cate3 = cate3 + impuesto ;
            }
            impuestopagar = impuestopagar + impuesto ;
            sistema _ fuera _ println ( "total del impuesto: " + impuesto );
            sistema _ fuera _ imprimirln ();
        }
        sistema _ fuera _ println ( "total del impuesto categoria 1: " + cate1 );
        sistema _ fuera _ println ( "total del impuesto categoria 2: " + cate2 );
        sistema _ fuera _ println ( "total del impuesto 3:" + cate3 );
        sistema _ fuera _ println ( "total a pagar del impuesto es de : " + impuestopagar );
    }
    public void examen3() {
        int n;
        System.out.print("pon la altura de la X:");
        n = leer.nextInt();
        if (n>=3 && n%2==1){
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
        if (i == j || i + j == n + 1)
            System.out.print("*");
        else
            System.out.print(" ");
        }
            System.out.println();

        } 
        }else {
            System.out.println("es no valido :(");
        }
    }

    public void ejer5_1() {
        int n;
        do {
            System.out.print("Introduzca numero >0: ");
            n = lt.nextInt();
        } while (n < 0);
        System.out.print("Binario: ");
        ejer5_2(n);
    }
    public static void ejer5_2(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            ejer5_2(n / 2);
            System.out.print(n % 2);
            return;
        }
    }

}

