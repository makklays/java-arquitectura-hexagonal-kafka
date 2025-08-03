package com.techmatrix18.domain.model;

import com.techmatrix18.domain.model.enums.DealStage;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Deal {

    private final Long id;
    private final Long clientId;           // Внешний ключ на клиента
    private final String name;             // Название сделки
    private final BigDecimal amount;       // Сумма
    private final String currency;         // Валюта, например, "USD", "EUR"
    private final DealStage stage;         // Этап сделки
    private final LocalDate startDate;     // Дата начала
    private final LocalDate closeDate;     // Дата закрытия (если есть)
    private final Long responsibleManagerId; // Ответственный менеджер (User)

    public Deal(Long id,
                Long clientId,
                String name,
                BigDecimal amount,
                String currency,
                DealStage stage,
                LocalDate startDate,
                LocalDate closeDate,
                Long responsibleManagerId) {
        this.id = id;
        this.clientId = clientId;
        this.name = name;
        this.amount = amount;
        this.currency = currency;
        this.stage = stage;
        this.startDate = startDate;
        this.closeDate = closeDate;
        this.responsibleManagerId = responsibleManagerId;
    }

    // Геттеры (без сеттеров для неизменяемости)

    public Long getId() {
        return id;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public DealStage getStage() {
        return stage;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getCloseDate() {
        return closeDate;
    }

    public Long getResponsibleManagerId() {
        return responsibleManagerId;
    }
}

