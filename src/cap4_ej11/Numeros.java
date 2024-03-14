package cap4_ej11;

public class Numeros {
    protected static int Mayor(int N1, int N2, int N3){
        if(N1 > N2 && N1 > N3){
            return N1;
        } else if (N2 > N1 && N2 > N3){
            return N2;
        } else{
            return N3;
        }
    }

}
