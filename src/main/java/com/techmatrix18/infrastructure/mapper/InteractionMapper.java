package com.techmatrix18.infrastructure.mapper;

import com.techmatrix18.domain.model.Interaction;
import com.techmatrix18.infrastructure.entity.InteractionEntity;

public class InteractionMapper {

    public static Interaction toDomain(InteractionEntity entity) {
        if (entity == null) return null;
        return new Interaction(
                entity.getId(),
                entity.getClientId(),
                entity.getType(),
                entity.getDescription(),
                entity.getDateTime(),
                entity.getResponsibleEmployeeId(),
                entity.getStatus()
        );
    }

    public static InteractionEntity toEntity(Interaction domain) {
        if (domain == null) return null;
        InteractionEntity entity = new InteractionEntity();
        entity.setId(domain.getId());
        entity.setClientId(domain.getClientId());
        entity.setType(domain.getType());
        entity.setDescription(domain.getDescription());
        entity.setDateTime(domain.getDateTime());
        entity.setResponsibleEmployeeId(domain.getResponsibleEmployeeId());
        entity.setStatus(domain.getStatus());
        return entity;
    }
}

