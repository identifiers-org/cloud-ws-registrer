package org.identifiers.org.cloud.ws.register.models;

/**
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * Project: register
 * Package: org.identifiers.org.cloud.ws.register.models
 * Timestamp: 2018-02-02 13:36
 * ---
 */
public class RequesterValidatorName implements RequesterValidator {
    @Override
    public boolean validate(Requester requester) throws RequesterValidatorException {
        return false;
    }
}
