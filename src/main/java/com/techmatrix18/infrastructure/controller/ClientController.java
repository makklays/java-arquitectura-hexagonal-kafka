package com.techmatrix18.infrastructure.controller;

import com.techmatrix18.domain.port.in.CreateClientUseCase;
import com.techmatrix18.domain.port.in.command.CreateClientCommand;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.UUID;

/**
 * REST controller for managing clients.
 * Handles HTTP requests at the "/api/v1/clients" endpoint.
 *
 * Example operations:
 * - Retrieve a list of clients
 * - Create a new client
 * - Update client information
 * - Delete a client
 *
 * Uses the service layer for business logic.
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

@RestController
@RequestMapping("/api/v1/clients")
@Tag(name = "Клиенты", description = "Управление клиентами")  // Группа в Swagger UI
public class ClientController {

    private final CreateClientUseCase createClientUseCase;

    public ClientController(CreateClientUseCase createClientUseCase) {
        this.createClientUseCase = createClientUseCase;
    }

    @PostMapping
    @Operation(summary = "Создать нового клиента", description = "Добавляет клиента в систему")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Клиент успешно создан"),
            @ApiResponse(responseCode = "400", description = "Некорректные данные запроса")
    })
    public void createClient(@RequestBody CreateClientRequest request) {
        CreateClientCommand command = new CreateClientCommand(
                request.id(),
                request.firstName(),
                request.lastName(),
                request.email(),
                request.phone(),
                request.company(),
                request.type(),
                request.registeredAt(),
                request.source(),
                request.tags(),
                request.ownerId()
        );

        createClientUseCase.createClient(command);
    }

    public record CreateClientRequest(UUID id, String firstName, String lastName, String email, String phone,
                                      String company, String type, String registeredAt, String source,
                                      String tags, String ownerId) {}
}

