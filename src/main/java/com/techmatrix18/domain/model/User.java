package com.techmatrix18.domain.model;

import com.techmatrix18.domain.model.enums.Role;
import com.techmatrix18.domain.model.enums.Status;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private final UUID id;
    private final String username;       // логин
    private final String email;
    private final String phone;          // номер телефона
    private final String passwordHash;   // хэш пароля
    private final Role role;             // роль (например, ADMIN, MANAGER)
    private final Status status;         // активен / заблокирован
    private final LocalDateTime createdAt;

    public User(UUID id, String username, String email, String phone, String passwordHash,
                Role role, Status status, LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.passwordHash = passwordHash;
        this.role = role != null ? role : Role.MANAGER;
        this.status = status != null ? status : Status.ACTIVE;
        this.createdAt = createdAt != null ? createdAt : LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public Role getRole() {
        return role;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Пример дополнительных методов
    public boolean isActive() {
        return this.status == Status.ACTIVE;
    }

    public boolean isAdmin() {
        return this.role == Role.ADMIN;
    }
}

