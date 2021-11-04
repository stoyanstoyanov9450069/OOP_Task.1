package Validators;

import java.security.InvalidParameterException;

public class StringValidator {

    public void isStringEmpty(String string) throws InvalidParameterException{
        if (string.isEmpty()){
            throw new InvalidParameterException("Invalid input");
        }
    }
}

