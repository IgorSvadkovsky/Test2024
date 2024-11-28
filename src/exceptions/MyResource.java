package exceptions;

public class MyResource {
    public void close() throws CustomException1 {
        System.out.println("Closing resource ...");
        throw new CustomException1("Exception when closing resource");
    }
}
