package pl.miloszkajetan.serwisAukcyjny.exceptations;

public class CategoryNotExistException extends RuntimeException {
    public CategoryNotExistException(String message) {
        super(message);
    }
}
