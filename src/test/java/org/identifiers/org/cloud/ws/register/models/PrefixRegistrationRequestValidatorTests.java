package org.identifiers.org.cloud.ws.register.models;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * Project: register
 * Package: org.identifiers.org.cloud.ws.register.models
 * Timestamp: 2018-01-30 23:21
 * ---
 */
@RunWith(Parameterized.class)
public class PrefixRegistrationRequestValidatorTests {
    private PrefixRegistrationRequestValidator validator;
    private RegisterApiRequestRegisterPrefix request;
    private String testDescription;

    @Parameterized.Parameters
    public static Collection<Object[]> getTestingValues() {
        // TODO
        return; Arrays.asList(new Object[][]{
                // Test name validator
                {new PrefixRegistrationRequestValidatorName(),}
    }
}