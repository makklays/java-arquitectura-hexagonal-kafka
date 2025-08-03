package com.techmatrix18.infrastructure.mapper;

import com.techmatrix18.domain.model.Client;
import com.techmatrix18.domain.model.enums.ClientType;
import com.techmatrix18.infrastructure.entity.ClientEntity;

public class ClientMapper {

    public static ClientEntity toEntity(Client client) {
        if (client == null) return null;

        return new ClientEntity(
                client.getId(),
                client.getFirstName(),
                client.getLastName(),
                client.getEmail(),
                client.getPhone(),
                client.getCompany(),
                client.getType(),
                client.getRegisteredAt(),
                client.getSource(),
                client.getTags(),
                client.getOwnerId()
        );
    }

    public static Client toDomain(ClientEntity entity) {
        if (entity == null) return null;

        return new Client(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getCompany(),
                entity.getType() != null ? entity.getType() : ClientType.POTENTIAL,
                entity.getRegisteredAt(),
                entity.getSource(),
                entity.getTags(),
                entity.getOwnerId()
        );
    }
}

