package ir.saman.socia.exception.error;

import ir.saman.socia.exception.SociaErrorType;
import ir.saman.socia.exception.SociaException;

public class NotFoundException extends SociaException {

    public NotFoundException() {
        super(SociaErrorType.NOT_FOUND);
    }
}
