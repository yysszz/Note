package springsourcecode.designpatternnote.chapter37;

import java.net.UnknownHostException;

public class IdGenerationFailureException extends RuntimeException {

    public IdGenerationFailureException(String s, UnknownHostException e) {
    }
}
