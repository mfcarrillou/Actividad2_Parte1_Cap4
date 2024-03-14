package cap4_ej14;

import java.util.Scanner;

public class Actividad2_Ej14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PlanIncentivo depto1 = new PlanIncentivo();
        PlanIncentivo depto2 = new PlanIncentivo();
        PlanIncentivo depto3 = new PlanIncentivo();
        PlanIncentivo empresa = new PlanIncentivo();
        
        System.out.println("Ingrese el valor de las ventas del departamento 1: ");
        depto1.VD1 = entrada.nextDouble();
        System.out.println("Ingrese el valor de las ventas del departamento 2: ");
        depto2.VD2 = entrada.nextDouble();
        System.out.println("Ingrese el valor de las ventas del departamento 3: ");
        depto3.VD3 = entrada.nextDouble();
        System.out.println("Ingrese el salario de los vendedores: ");
        empresa.SALAR = entrada.nextDouble();
        
        empresa.TOTVEN = depto1.VD1 + depto2.VD2 + depto3.VD3;
        depto1.SALAR1 = empresa.Incentivo(depto1.VD1);
        depto2.SALAR2 = empresa.Incentivo(depto2.VD2);
        depto3.SALAR3 = empresa.Incentivo(depto3.VD3);
        
        System.out.println("\nSalario vendedores depto. 1: " + depto1.SALAR1);
        System.out.println("Salario vendedores depto. 2: " + depto2.SALAR2);
        System.out.println("Salario vendedores depto. 3: " + depto3.SALAR3);
    }
    
}
