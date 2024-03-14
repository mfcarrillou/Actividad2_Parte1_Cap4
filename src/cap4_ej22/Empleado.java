package cap4_ej22;

public class Empleado {
    String nombre; //Nombre del empleado
    double salario_hora; //Salario básico por hora
    double salario; //Salario mensual
    double horas_trabajadas; //Número de horas trabajadas en el mes
    
    protected void infoEmpleado(){
        salario = salario_hora * horas_trabajadas;
        if (salario > 450000){
            System.out.println("\nNombre del empleado: " + nombre);
            System.out.println("Salario mensual del empleado: " + salario);
        } else{
            System.out.println("\nNombre del empleado: " + nombre);
        }
    }

}
