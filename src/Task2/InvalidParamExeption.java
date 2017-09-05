package Task2;

/**
 * @author Fominykh Vladimir
 */
public class InvalidParamExeption extends Exception {

    private String message;

    public InvalidParamExeption(String message) {
        this.message = message;
        System.out.println("Exception InvalidParamExeption");
    }
    public void myOwnException(){
        System.out.println("This is exception massage for srting: " + message );
    }
}
