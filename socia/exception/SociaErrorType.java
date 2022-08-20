package ir.saman.socia.exception;

public enum SociaErrorType {

    FILE_OPERATION_FAILED(-101, "در ذخیره و بازیابی فایل مشکل بوجود آمد."),
    NOT_FOUND(-102, "یافت نشد."),
    ALREADY_EXISTS(-103, "رکورد تکراری"),
    AUTHENTICATION_FAILED(-104, "نام کاربری و یا رمز عبور اشتباه است.")
    ;


    private final int code;
    private final String helpDescription;

    SociaErrorType(int code, String helpDescription) {
        this.code = code;
        this.helpDescription = helpDescription;
    }

    public int getCode() {
        return code;
    }

    public String getHelpDescription() {
        return helpDescription;
    }
}
