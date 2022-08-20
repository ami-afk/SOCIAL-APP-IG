package ir.saman.socia.exception.error;

import ir.saman.socia.exception.SociaErrorType;
import ir.saman.socia.exception.SociaException;

public class FileOpException extends SociaException {

    public FileOpException() {
        super(SociaErrorType.FILE_OPERATION_FAILED);
    }
}
