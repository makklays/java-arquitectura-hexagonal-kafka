package com.techmatrix18.infrastructure.mapper;

import com.techmatrix18.domain.model.Deal;
import com.techmatrix18.infrastructure.entity.DealEntity;

public class DealMapper {

    public static Deal toDomain(DealEntity entity) {
        if (entity == null) return null;
        return new Deal(
                entity.getId(),
                entity.getClientId(),
                entity.getName(),
                entity.getAmount(),
                entity.getCurrency(),
                entity.getStage(),
                entity.getStartDate(),
                entity.getCloseDate(),
                entity.getResponsibleManagerId()
        );
    }

    public static DealEntity toEntity(Deal domain) {
        if (domain == null) return null;
        DealEntity entity = new DealEntity();
        entity.setId(domain.getId());
        entity.setClientId(domain.getClientId());
        entity.setName(domain.getName());
        entity.setAmount(domain.getAmount());
        entity.setCurrency(domain.getCurrency());
        entity.setStage(domain.getStage());
        entity.setStartDate(domain.getStartDate());
        entity.setCloseDate(domain.getCloseDate());
        entity.setResponsibleManagerId(domain.getResponsibleManagerId());
        return entity;
    }
}

