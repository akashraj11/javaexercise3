
import java.io.FileNotFoundException;

public class ExceptionExample extends Exception {
    ExceptionExample(String msg){
        System.out.println(msg);
    }
    public static void main(String args[]) {
        try {
            throw new Exception("An exception in main");
        } catch(Exception e) {
            System.out.println(
                    "exception String arguement \n" + e.getMessage());
        } finally {
            System.out.println("Reached finally clause");
        }
    }
}
