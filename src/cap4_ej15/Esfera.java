package cap4_ej15;

public class Esfera {
    double peso;
    String diferente;
    String comparar;
    
    protected void esferaDiferente(double p1, double p2, double p3, double p4){
        if (p1 == p2){
            if (p2 == p3){
                diferente = "\nLa esfera D es la diferente";
                if (p4 > p1){
                    comparar = " y es de mayor de peso";
                } else{
                    comparar = " y es de menor de peso";
                }
            } else{
                diferente = "\nLa esfera C es la diferente";
                if (p3 > p1){
                    comparar = " y es de mayor de peso";
                } else{
                    comparar = " y es de menor de peso";
                }
            }
        } else if (p1 == p3 && p3 == p4){
            diferente = "\nLa esfera B es la diferente";
            if (p2 > p1){
                comparar = " y es de mayor de peso";
            } else{
                comparar = " y es de menor de peso";
            }
        } else{
            diferente = "\nLa esfera A es la diferente";
            if (p1 > p2){
                    comparar = " y es de mayor de peso";
                } else{
                    comparar = " y es de menor de peso";
                    }
                }
        System.out.println(diferente + comparar);
    }
    
}
