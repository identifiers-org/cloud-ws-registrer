package org.identifiers.org.cloud.ws.register.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author Manuel Bernal Llinares <mbdebian@gmail.com>
 * Project: register
 * Package: org.identifiers.org.cloud.ws.register.models
 * Timestamp: 2018-01-30 17:11
 * ---
 */
@JsonIgnoreProperties(value = {"httpStatus"})
public class RegisterApiResponse implements Serializable {
    private HttpStatus httpStatus = HttpStatus.OK;
}
