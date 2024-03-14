package cap4_ej15;

import java.util.Scanner;

public class Actividad2_Ej15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Esfera A = new Esfera();
        Esfera B = new Esfera();
        Esfera C = new Esfera();
        Esfera D = new Esfera();
        Esfera diferente = new Esfera();
        
        System.out.println("Ingrese el peso de la esfera A: ");
        A.peso = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        B.peso = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        C.peso = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera D: ");
        D.peso = entrada.nextDouble();
        
        diferente.esferaDiferente(A.peso,B.peso,C.peso,D.peso);
    }
    
}
