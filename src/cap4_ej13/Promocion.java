package cap4_ej13;

public class Promocion {
    double VALCOMP; //Valor de la compra
    String COLOR; //Color de la bolita
    double PDES; //Porcentaje de descuento
    double VALPAG; //Valor a pagar
    
    protected double valorPagar(){
        COLOR = COLOR.toUpperCase();
        
        if (COLOR.equals("BLANCO")){
            PDES = 0;
        } else if (COLOR.equals("VERDE")){
            PDES = 0.10;
        } else if(COLOR.equals("AMARILLA")|| COLOR.equals("AMARILLO")){
            PDES = 0.25;
        } else if(COLOR.equals("AZUL")){
            PDES = 0.5;
        } else {
            PDES = 1;
        }
        
        VALPAG = VALCOMP * (1 - PDES);
        return VALPAG;
    }
    
}
