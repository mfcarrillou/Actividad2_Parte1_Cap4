package cap4_ej14;

public class PlanIncentivo {
    double VD1,VD2,VD3; //Ventas del departamento 1,2 y 3
    double SALAR,salario; //Salario que reciben los vendedores
    double TOTVEN; //Total ventas en la empresa
    double SALAR1, SALAR2, SALAR3; //Salario de los vendedores en el depto. 1,2 y 3
    
    
    protected double Incentivo(double VD){
        if (VD > (0.33*TOTVEN)){
            salario = 1.20 * SALAR;
        } else{
            salario = SALAR;
        }
        return salario;
    }

}
