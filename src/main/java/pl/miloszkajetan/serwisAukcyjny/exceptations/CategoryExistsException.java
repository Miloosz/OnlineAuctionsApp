package pl.miloszkajetan.serwisAukcyjny.exceptations;

public class CategoryExistsException extends RuntimeException {
    public CategoryExistsException(String message){
        super(message);
    }
}