package cap4_ej11;

import java.util.Scanner;

public class Actividad2_Ej11 {

    public static void main(String[] args) {
        int N1, N2, N3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        N1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        N2 = entrada.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        N3 = entrada.nextInt();
        
        System.out.println("\nEl valor mayor entre "+ N1 + ", "+ N2 + " y "+ N3 + " es: " + Numeros.Mayor(N1,N2,N3));
    }
    
}
