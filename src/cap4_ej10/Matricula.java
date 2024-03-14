package cap4_ej10;

public class Matricula {
    String NI; //Número de inscripción
    String NOM; // Nombre
    double PAT; //Patrimonio
    int EST; //Estrato social
    double pagoMatricula;//Valor a pagar de la matrícula
    
    protected double pagoMatricula(){
        pagoMatricula = 50000;
        if (PAT > 2000000 && EST > 3){
            pagoMatricula = pagoMatricula + 0.03 * PAT;
        }
        return pagoMatricula;
    }    

}
