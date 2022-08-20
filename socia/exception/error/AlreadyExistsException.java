package ir.saman.socia.exception.error;

import ir.saman.socia.exception.SociaErrorType;
import ir.saman.socia.exception.SociaException;

public class AlreadyExistsException extends SociaException {

    public AlreadyExistsException() {
        super(SociaErrorType.ALREADY_EXISTS);
    }
}
