package homework.exercise.homework11.medicalCenter.exception;

public class MedicalNotFoundException extends Exception{

    public MedicalNotFoundException() {
    }

    public MedicalNotFoundException(String message) {
        super(message);
    }

    public MedicalNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MedicalNotFoundException(Throwable cause) {
        super(cause);
    }

    public MedicalNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
