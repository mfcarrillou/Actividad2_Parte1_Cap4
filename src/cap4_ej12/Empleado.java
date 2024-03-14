package cap4_ej12;

public class Empleado {
    String NOM; //Nombre del trabajador
    double NHT; //Número de horas trabajadas
    double VHN; //Valor hora normal trabajada    
    double HET; //Horas extras trabajadas
    double HEE8; //Horas extras que exceden de 8 horas
    double SALARIO; //Pago total que recibe el trabajador
    
    protected double Salario(){
        if(NHT > 40){
            HET = NHT - 40;
            if (HET <= 8){
            SALARIO = 40 * VHN + HET * 2 * VHN;
            } else{
                HEE8 = HET - 8;
                SALARIO = 56 * VHN + HEE8 * 3 * VHN;
            }
        } else{
            SALARIO = NHT * VHN;
        }
        return SALARIO;
    }
    
}
