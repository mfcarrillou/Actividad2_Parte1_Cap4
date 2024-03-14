package cap4_ej07;

import java.util.Scanner;

public class Actividad2_Ej07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B;
        
        System.out.println("Ingrese el valor de A: ");
        A = entrada.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        B = entrada.nextDouble();
        
        Numeros.Comparar(A,B);   
    }
    
}
