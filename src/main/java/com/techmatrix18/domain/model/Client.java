package com.techmatrix18.domain.model;

import java.time.LocalDateTime;
import java.util.*;

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

    // Примеры поведения
    // Методы, которые "изменяют" состояние, возвращают **новый объект**
    public Client updateContactInfo(String newEmail, String newPhone) {
        return new Client(
                this.id,
                this.firstName,
                this.lastName,
                Objects.requireNonNull(newEmail),
                Objects.requireNonNull(newPhone),
                this.company,
                this.type,
                this.registeredAt,
                this.source,
                this.tags
        );
    }

    public Client updateName(String newFirstName, String newLastName) {
        return new Client(
                this.id,
                Objects.requireNonNull(newFirstName),
                Objects.requireNonNull(newLastName),
                this.email,
                this.phone,
                this.company,
                this.type,
                this.registeredAt,
                this.source,
                this.tags
        );
    }

    public Client promoteToActive() {
        return new Client(
                this.id,
                this.firstName,
                this.lastName,
                this.email,
                this.phone,
                this.company,
                ClientType.ACTIVE,  // меняем тип
                this.registeredAt,
                this.source,
                this.tags
        );
    }

    public Client addTag(String tag) {
        Set<String> newTags = new HashSet<>(this.tags);
        newTags.add(tag);
        return new Client(
                this.id,
                this.firstName,
                this.lastName,
                this.email,
                this.phone,
                this.company,
                this.type,
                this.registeredAt,
                this.source,
                Collections.unmodifiableSet(newTags)  // чтобы не нарушать иммутабельность
        );
    }

    public Client removeTag(String tag) {
        Set<String> newTags = new HashSet<>(this.tags);
        newTags.remove(tag);
        return new Client(
                this.id,
                this.firstName,
                this.lastName,
                this.email,
                this.phone,
                this.company,
                this.type,
                this.registeredAt,
                this.source,
                Collections.unmodifiableSet(newTags)
        );
    }

    // equals / hashCode по id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return id.equals(client.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

