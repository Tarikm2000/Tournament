
package exceptions;

public class NotPowerOfTwoException extends Exception {

 /** exception caused by play in Tournament if the number of competitores is not power of two */
    public NotPowerOfTwoException() {
        super();
    }

    public NotPowerOfTwoException(String msg){
        super(msg);
    }
}
