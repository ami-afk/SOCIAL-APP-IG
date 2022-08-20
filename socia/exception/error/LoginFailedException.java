package ir.saman.socia.exception.error;

import ir.saman.socia.exception.SociaErrorType;
import ir.saman.socia.exception.SociaException;

public class LoginFailedException extends SociaException {

    public LoginFailedException() {
        super(SociaErrorType.AUTHENTICATION_FAILED);
    }
}
