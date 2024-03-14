package cap4_ej12;

import java.util.Scanner;

public class Actividad2_Ej12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empleado empleado = new Empleado();
        
        System.out.println("Ingrese el nombre del trabajador: ");
        empleado.NOM = entrada.nextLine();
        
        System.out.println("Ingrese el número de horas trabajadas: ");
        empleado.NHT = entrada.nextDouble();
        
        System.out.println("Ingrese el valor por hora de trabajo: ");
        empleado.VHN = entrada.nextDouble();
        
        System.out.println("\nEl trabajador " + empleado.NOM + " devengó: $ "+ empleado.Salario());
        
    }
    
}
