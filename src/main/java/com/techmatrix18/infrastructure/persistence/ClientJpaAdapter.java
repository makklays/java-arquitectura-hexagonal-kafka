package com.techmatrix18.infrastructure.persistence;

import com.techmatrix18.domain.model.Client;
import com.techmatrix18.domain.port.out.SaveClientPort;
import com.techmatrix18.infrastructure.entity.ClientEntity;
import java.util.Optional;
import java.util.UUID;

/**
 * Client JPA Adapter
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

public class ClientJpaAdapter implements SaveClientPort {
    private final ClientRepository clientRepository;

    public ClientJpaAdapter(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void save(Client client) {
        ClientEntity entity = new ClientEntity(
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
        clientRepository.save(entity);
    }

    @Override
    public Optional<Client> findById(UUID id) {
        return clientRepository.findById(id)
                .map(entity -> new Client(
                        entity.getId(),
                        entity.getFirstName(),
                        entity.getLastName(),
                        entity.getEmail(),
                        entity.getPhone(),
                        entity.getCompany(),
                        entity.getType(),
                        entity.getRegisteredAt(),
                        entity.getSource(),
                        entity.getTags(),
                        entity.getOwnerId()
                ));
    }
}

