package exceptions;

public class TrueResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new CustomException1("Exception when closing true resource");
    }
}
