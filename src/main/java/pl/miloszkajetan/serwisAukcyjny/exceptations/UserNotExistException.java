package pl.miloszkajetan.serwisAukcyjny.exceptations;

public class UserNotExistException extends RuntimeException {

    public UserNotExistException(String message) {
        super(message);
    }
}
