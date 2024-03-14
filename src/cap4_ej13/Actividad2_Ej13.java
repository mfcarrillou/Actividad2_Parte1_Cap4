package cap4_ej13;

import java.util.Scanner;

public class Actividad2_Ej13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Promocion cliente = new Promocion();
        
        System.out.println("Ingrese el valor de la compra: ");
        cliente.VALCOMP = entrada.nextDouble();
        
        System.out.println("Ingrese el color de la bolita sacada: ");
        cliente.COLOR = entrada.next();
        
        System.out.println("El cliente debe pagar: $ " + cliente.valorPagar());
    }
    
}
