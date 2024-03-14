package cap4_ej23;

import java.util.Scanner;

public class Actividad2_Ej23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ecuacion2doGrado ec = new Ecuacion2doGrado();
        
        System.out.println("Ingrese el valor del parámetro A de la ecuación: ");
        ec.A = entrada.nextDouble();
        System.out.println("Ingrese el valor del parámetro B de la ecuación: ");
        ec.B = entrada.nextDouble();
        System.out.println("Ingrese el valor del parámetro C de la ecuación: ");
        ec.C = entrada.nextDouble();
        
        ec.SolucionEc();
    }
    
}
