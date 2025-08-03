package com.techmatrix18.domain.model;

public class Contact {

    private final Long id;
    private final Long clientId;            // Ссылка на клиента (Client)
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String position;          // Должность / роль в компании

    public Contact(Long id, Long clientId, String firstName, String lastName,
                   String email, String phone, String position) {
        this.id = id;
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.position = position;
    }

    // Геттеры (без сеттеров — для иммутабельности)

    public Long getId() {
        return id;
    }

    public Long getClientId() {
        return clientId;
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

    public String getPosition() {
        return position;
    }
}

