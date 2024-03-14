
package cap4_ej23;

public class Ecuacion2doGrado {
    double A;
    double B;
    double C;
    double d;
    double x1,x2;
    
    protected void SolucionEc(){
        d = Math.pow(B,2) - 4 * A * C;
        if (d < 0){
            System.out.println("\nLa ecuación de segundo grado no tiene soluciones reales");
        } else if (d == 0){
            x1 = -B / (2 * A);
            System.out.println("\nLa ecuación de segundo grado tiene dos soluciones iguales: x1= x2= " + x1);
        } else{
            x1 = (-B + Math.sqrt(d))/ (2 * A);
            x2 = (-B - Math.sqrt(d))/ (2 * A);
            System.out.println("\nLa ecuación de segundo grado tiene dos soluciones: x1= " + x1 + " y x2= " + x2);
        }
    }
    
}
