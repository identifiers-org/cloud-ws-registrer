package org.identifiers.org.cloud.ws.register.data.services;

import org.identifiers.org.cloud.ws.register.data.models.PrefixRegistrationRequest;
import org.identifiers.org.cloud.ws.register.data.repositories.PrefixRegistrationRequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: register
 * Package: org.identifiers.org.cloud.ws.register.data.services
 * Timestamp: 2018-08-16 14:21
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@Component
public class PrefixRegistrationRequestService {
    private static final Logger logger = LoggerFactory.getLogger(PrefixRegistrationRequest.class);

    @Autowired
    private PrefixRegistrationRequestRepository repository;

    // Find the request that matches the given prefix and token
    public PrefixRegistrationRequest findRequest(String preferredPrefix, String token) throws PrefixRegistrationRequestServiceException {
        try {
            // TODO
        } catch ();
        return null;
    }
    // TODO
}
