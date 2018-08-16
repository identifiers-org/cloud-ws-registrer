package org.identifiers.org.cloud.ws.register.data.models;

import org.identifiers.org.cloud.ws.register.models.Requester;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

/**
 * Project: register
 * Package: org.identifiers.org.cloud.ws.register.data.models
 * Timestamp: 2018-08-16 12:02
 *
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * ---
 */
@RedisHash("RegistryPrefixRegistrationRequest")
public class PrefixRegistrationRequest implements Serializable {
    private String name;
    private String description;
    private String homePage;
    private String organization;
    private String preferredPrefix;
    private String resourceAccessRule;
    private String exampleIdentifier;
    private String regexPattern;
    private String[] references;
    private String additionalInformation;
    private Requester requester;
    // Management
    private String token = "";
    private Long timeToLeave;
}
