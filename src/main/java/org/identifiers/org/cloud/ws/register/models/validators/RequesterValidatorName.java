package org.identifiers.org.cloud.ws.register.models.validators;

import org.identifiers.org.cloud.ws.register.models.Requester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * Project: register
 * Package: org.identifiers.org.cloud.ws.register.models
 * Timestamp: 2018-02-02 13:36
 * ---
 */
public class RequesterValidatorName implements RequesterValidator {
    private static Logger logger = LoggerFactory.getLogger(RequesterValidatorName.class);

    @Override
    public boolean validate(Requester requester) throws RequesterValidatorException {
        if (requester.getName() == null) {
            logger.info("MISSING Requester Name");
        }
        return true;
    }
}
