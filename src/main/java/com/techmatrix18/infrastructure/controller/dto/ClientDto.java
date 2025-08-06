package com.techmatrix18.infrastructure.controller.dto;

import java.util.UUID;

/**
 * ClientDto class
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

public class ClientDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;

    // Конструкторы, геттеры, сеттеры
    public ClientDto() {}

    public ClientDto(UUID id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

