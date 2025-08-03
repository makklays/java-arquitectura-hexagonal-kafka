package com.techmatrix18.domain.model;

import com.techmatrix18.domain.model.enums.InteractionStatus;
import com.techmatrix18.domain.model.enums.InteractionType;

import java.time.LocalDateTime;

public class Interaction {

    private final Long id;
    private final Long clientId;
    private final InteractionType type;
    private final String description;
    private final LocalDateTime dateTime;
    private final Long responsibleEmployeeId;
    private final InteractionStatus status;

    public Interaction(Long id,
                       Long clientId,
                       InteractionType type,
                       String description,
                       LocalDateTime dateTime,
                       Long responsibleEmployeeId,
                       InteractionStatus status) {
        this.id = id;
        this.clientId = clientId;
        this.type = type;
        this.description = description;
        this.dateTime = dateTime;
        this.responsibleEmployeeId = responsibleEmployeeId;
        this.status = status;
    }

    // Геттеры (без сеттеров — неизменяемость)

    public Long getId() {
        return id;
    }

    public Long getClientId() {
        return clientId;
    }

    public InteractionType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Long getResponsibleEmployeeId() {
        return responsibleEmployeeId;
    }

    public InteractionStatus getStatus() {
        return status;
    }
}


