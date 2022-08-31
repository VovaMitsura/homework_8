package exceptions;

/*
* Exception occurs when invalid value passed to the method
* */
public class IllegalNameException extends IllegalArgumentException{
    public IllegalNameException(String s) {
        super(s);
    }

}
