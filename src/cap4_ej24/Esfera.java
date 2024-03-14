package cap4_ej24;

public class Esfera {
    
    protected static void mayorPeso(double A, double B, double C){
        if(A > B && A > C){
            System.out.println("\nLa esfera de mayor peso es A");
        } else if (B > A && B > C){
            System.out.println("\nLa esfera de mayor peso es B");
        } else{
            System.out.println("\nLa esfera de mayor peso es C");
        }
    }
    
}
