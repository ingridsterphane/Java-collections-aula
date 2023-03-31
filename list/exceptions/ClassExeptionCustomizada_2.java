package list.exceptions;
public class ClassExeptionCustomizada_2  extends Exception{

    private int numerador;
    private int denominador;

    public ClassExeptionCustomizada_2(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;

    }
}
