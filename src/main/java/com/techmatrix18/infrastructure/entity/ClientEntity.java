package com.techmatrix18.infrastructure.entity;

import com.techmatrix18.domain.model.enums.ClientType;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

/**
 * Client entity
 *
 * @version 1.0
 * @author  Alexander Kuziv
 */

@Entity
@Table(name = "clients")
public class ClientEntity {
    @Id
    private UUID id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)

    private String lastName;
    private String email;
    private String phone;
    private String company;

    @Enumerated(EnumType.STRING)
    private ClientType type;

    @Column(name = "registered_at")
    private LocalDateTime registeredAt;
    private String source;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "client_tags", joinColumns = @JoinColumn(name = "client_id"))
    @Column(name = "tag")
    private Set<String> tags;

    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    // Конструктор без аргументов для JPA
    protected ClientEntity() {}

    public ClientEntity(UUID id, String firstName, String lastName, String email,
                        String phone, String company, ClientType type,
                        LocalDateTime registeredAt, String source, Set<String> tags,
                        Long ownerId) {
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

    // Getters и Setters (можно использовать Lombok, если разрешено)
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

    public Long getOwnerId() {
        return ownerId;
    }
}

