package com.techmatrix18.infrastructure.mapper;

import com.techmatrix18.domain.model.Contact;
import com.techmatrix18.infrastructure.entity.ContactEntity;

public class ContactMapper {

    public static Contact toDomain(ContactEntity entity) {
        if (entity == null) return null;
        return new Contact(
                entity.getId(),
                entity.getClientId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getPosition()
        );
    }

    public static ContactEntity toEntity(Contact domain) {
        if (domain == null) return null;
        ContactEntity entity = new ContactEntity();
        entity.setId(domain.getId());
        entity.setClientId(domain.getClientId());
        entity.setFirstName(domain.getFirstName());
        entity.setLastName(domain.getLastName());
        entity.setEmail(domain.getEmail());
        entity.setPhone(domain.getPhone());
        entity.setPosition(domain.getPosition());
        return entity;
    }
}

