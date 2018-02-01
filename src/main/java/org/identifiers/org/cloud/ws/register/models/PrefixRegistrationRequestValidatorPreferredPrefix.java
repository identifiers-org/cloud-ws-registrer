package org.identifiers.org.cloud.ws.register.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * Project: register
 * Package: org.identifiers.org.cloud.ws.register.models
 * Timestamp: 2018-01-31 14:40
 * ---
 */
@Component
@Scope("prototype")
public class PrefixRegistrationRequestValidatorPreferredPrefix implements PrefixRegistrationRequestValidator {
    private static Logger logger = LoggerFactory.getLogger(PrefixRegistrationRequestValidatorPreferredPrefix.class);

    // TODO - Let's see how this plays with Docker, later. It should go through a discovery service, but I'll find out
    // TODO - later how to lay all the pieces together for testing, development and production
    @Value("${org.identifiers.cloud.ws.register.resolver.host}")
    private String resolverHost;
    @Value("${org.identifiers.cloud.ws.register.resolver.port}")
    private int resolverPort;

    @Override
    public boolean validate(RegisterApiRequestRegisterPrefix request) throws PrefixRegistrationRequestValidatorException {
        // TODO - This method is going to call a Resolver WS, and it will do it straight away for this iteration of the
        // TODO - software, but in the future, we need to provide Resolver Web Service clients for several languages,
        // TODO - e.g. Java and Python, so people don't have to write their own code every time
        // TODO
        if (request.getPreferredPrefix() == null) {
            throw new PrefixRegistrationRequestValidatorException("MISSING Preferred Prefix");
        }
        String fakeCompactId = String.format("%s:093846", request.getPreferredPrefix());
        String queryUrl = String.format("http://%s:%d/%s", resolverHost, resolverPort, fakeCompactId);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(queryUrl, String.class);
        if (response.getStatusCode() != HttpStatus.NOT_FOUND) {
            String errorMessage = String.format("Preferred Prefix COULD NOT BE VALIDATED, internal status %s, IT MAY ALREADY BEEN REGISTERED", response.getStatusCode());
            logger.error(errorMessage);
            throw new PrefixRegistrationRequestValidatorException(errorMessage);
        }
        return true;
    }
}