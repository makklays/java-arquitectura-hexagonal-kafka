package com.techmatrix18.domain.port.in;

import com.techmatrix18.domain.port.in.command.CreateClientCommand;

/**
 * CreateClientUseCase interface
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

public interface CreateClientUseCase {

    void createClient(CreateClientCommand command);
}

