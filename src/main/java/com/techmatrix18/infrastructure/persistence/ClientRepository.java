package com.techmatrix18.infrastructure.persistence;

import com.techmatrix18.infrastructure.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

/**
 * Client repository
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

public interface ClientRepository extends JpaRepository<ClientEntity, UUID> {
    //
}

