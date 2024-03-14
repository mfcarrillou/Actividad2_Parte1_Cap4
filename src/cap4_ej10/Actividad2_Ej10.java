package cap4_ej10;

import java.util.Scanner;

public class Actividad2_Ej10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Matricula estudiante = new Matricula();
        
        System.out.println("Ingrese el número de inscripción del estudiante:");
        estudiante.NI = entrada.nextLine();
        System.out.println("Ingrese el nombre del estudiante:");
        estudiante.NOM = entrada.nextLine();
        System.out.println("Ingrese el patrimonio del estudiante:");
        estudiante.PAT = entrada.nextDouble();
        System.out.println("Ingrese el estrato social del estudiante:");
        estudiante.EST = entrada.nextInt();
        
        System.out.println("\nEl estudiante con número de inscripción " + estudiante.NI + " y nombre " + estudiante.NOM + " debe pagar: $ " + estudiante.pagoMatricula());
    }
    
}
