package org.identifiers.org.cloud.ws.register.models;

/**
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * Project: register
 * Package: org.identifiers.org.cloud.ws.register.models
 * Timestamp: 2018-01-31 10:26
 * ---
 */
public class PrefixRegistrationRequestValidatorDescription implements PrefixRegistrationRequestValidator {
    public static final int DESCRIPTION_CONTENT_MIN_CHARS = 50;
    
    @Override
    public boolean validate(RegisterApiRequestRegisterPrefix request) throws PrefixRegistrationRequestValidatorException {
        return false;
    }
}
