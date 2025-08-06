package com.techmatrix18.application.service;

import com.techmatrix18.domain.model.Client;
import com.techmatrix18.domain.model.enums.ClientType;
import com.techmatrix18.domain.port.in.CreateClientUseCase;
import com.techmatrix18.domain.port.in.command.CreateClientCommand;
import com.techmatrix18.domain.port.out.SaveClientPort;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Service for Client
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

public class ClientService implements CreateClientUseCase {

    private final SaveClientPort saveClientPort;

    public ClientService(SaveClientPort saveClientPort) {
        this.saveClientPort = saveClientPort;
    }

    @Override
    public void createClient(CreateClientCommand command) {
        Client client = new Client(
                command.getId(),
                command.getFirstName(),
                command.getLastName(),
                command.getEmail(),
                command.getPhone(),
                command.getCompany(),
                // 1. Преобразование строки в enum
                ClientType.valueOf(command.getType()),
                // 2. Преобразование строки в LocalDateTime
                LocalDateTime.parse(command.getRegisteredAt()),
                // 3. Просто передаём строку
                command.getSource(),
                // 4. Преобразование строки в Set<String>
                Arrays.stream(command.getTags().split(","))
                        .map(String::trim)
                        .collect(Collectors.toSet()),
                // 5. Преобразование строки в Long
                Long.parseLong(command.getOwnerId())
        );
        saveClientPort.save(client);
    }
}

