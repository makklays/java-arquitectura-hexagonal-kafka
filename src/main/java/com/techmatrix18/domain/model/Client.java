package com.techmatrix18.domain.model;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class Client {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String company;
    private final ClientType type;
    private final LocalDateTime registeredAt;
    private final String source;
    private final Set<String> tags;

    public Client(UUID id, String firstName, String lastName, String email,
                  String phone, String company, ClientType type,
                  LocalDateTime registeredAt, String source, Set<String> tags) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.type = type != null ? type : ClientType.POTENTIAL;
        this.registeredAt = registeredAt != null ? registeredAt : LocalDateTime.now();
        this.source = source;
        this.tags = tags;
    }

    // getters

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

    public ClientType getType() {
        return type;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public String getSource() {
        return source;
    }

    public Set<String> getTags() {
        return tags;
    }
}

