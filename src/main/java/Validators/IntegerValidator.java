package Validators;

import java.security.InvalidParameterException;

public class IntegerValidator {

    public void isIntegerValid (int integer) throws Exception{
        if(integer < 0 ){
            throw new InvalidParameterException("Invalid input!");
        }
        }
    }

