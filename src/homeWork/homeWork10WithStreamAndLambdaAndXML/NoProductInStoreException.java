package homeWork.homeWork10WithStreamAndLambdaAndXML;

import javax.xml.bind.JAXBException;

public class NoProductInStoreException extends JAXBException {
    public NoProductInStoreException(String message) {
        super(message);
    }

    public NoProductInStoreException(String message, String errorCode) {
        super(message, errorCode);
    }

    public NoProductInStoreException(Throwable exception) {
        super(exception);
    }

    public NoProductInStoreException(String message, Throwable exception) {
        super(message, exception);
    }

    public NoProductInStoreException(String message, String errorCode, Throwable exception) {
        super(message, errorCode, exception);
    }
}
