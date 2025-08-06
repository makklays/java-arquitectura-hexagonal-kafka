package com.techmatrix18.domain.port.out;

import com.techmatrix18.domain.model.Client;
import java.util.Optional;
import java.util.UUID;

/**
 * SaveClientPort interface
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

public interface SaveClientPort {
    void save(Client client);
    Optional<Client> findById(UUID id);

    //List<Client> findAll();
}

