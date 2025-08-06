package com.techmatrix18.domain.port.in.command;

import java.util.UUID;

/**
 * CreateClientCommand class
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

public class CreateClientCommand {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String company;
    private final String type;
    private final String registeredAt;
    private final String source;
    private final String tags;
    private final String ownerId;

    public CreateClientCommand(UUID id, String firstName, String lastName, String email, String phone, String company,
                               String type, String registeredAt, String source, String tags, String ownerId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.type = type;
        this.registeredAt = registeredAt;
        this.source = source;
        this.tags = tags;
        this.ownerId = ownerId;
    }

    public UUID getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getCompany() {
        return company;
    }
    public String getType() {
        return type;
    }
    public String getRegisteredAt() {
        return registeredAt;
    }
    public String getSource() {
        return source;
    }
    public String getTags() {
        return tags;
    }
    public String getOwnerId() {
        return ownerId;
    }
}

