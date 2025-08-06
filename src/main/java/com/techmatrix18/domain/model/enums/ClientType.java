package com.techmatrix18.domain.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * ClientType
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

public enum ClientType {
    REGULAR, VIP, POTENTIAL, ACTIVE, CORPORATE;

    @JsonCreator
    public static ClientType fromString(String value) {
        return ClientType.valueOf(value.toUpperCase());
    }
}

