package cap4_ej22;

import java.util.Scanner;

public class Actividad2_Ej22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empleado empleado = new Empleado();
        
        System.out.println("Ingrese el nombre del empleado: ");
        empleado.nombre = entrada.nextLine();
        System.out.println("Ingrese el salario básico por hora del empleado: ");
        empleado.salario_hora = entrada.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas en el mes: ");
        empleado.horas_trabajadas = entrada.nextDouble();
        
        empleado.infoEmpleado();
    }
    
}
