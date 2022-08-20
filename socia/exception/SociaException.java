package ir.saman.socia.exception;

public class SociaException extends RuntimeException {

    private final SociaErrorType errorType;

    public SociaException(SociaErrorType errorType) {
        this.errorType = errorType;
    }

    public SociaErrorType getErrorType() {
        return errorType;
    }
}
