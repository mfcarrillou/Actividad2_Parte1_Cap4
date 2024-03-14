package cap4_ej24;

import java.util.Scanner;

public class Actividad2_Ej24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C;
        
        System.out.println("Ingrese el peso de la esfera A:");
        A = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        B = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        C = entrada.nextDouble();
        
        Esfera.mayorPeso(A, B, C);
    }
    
}
