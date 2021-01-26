package pl.miloszkajetan.serwisAukcyjny.exceptations;

public class UserExistsException extends RuntimeException{

    public UserExistsException(String message) {
        super(message); // Wiadomość do rejestracji.
    }
}
