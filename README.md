# 🧠 Simple CRM — Arquitectura Hexagonal + TDD

**Simple CRM** es un sistema ligero de gestión de clientes, desarrollado con **Arquitectura Hexagonal (Puertos y Adaptadores)** y utilizando **TDD (Desarrollo guiado por pruebas)**.

## 🎯 Propósito

Este sistema está pensado para **pequeñas empresas, freelancers y equipos** que necesitan:
- gestionar una base de clientes de forma sencilla,
- almacenar contactos e historial de interacciones,
- encontrar rápidamente la información necesaria.

Ejemplos de uso:
- un freelancer que quiere organizar sus clientes,
- una agencia que almacena contactos y notas de conversaciones,
- un equipo de ventas que necesita seguimiento de interacciones.

## ⚙️ Funcionalidades principales

- 👤 Gestión de clientes: crear, editar, eliminar
- 📞 Datos de contacto: teléfono, correo electrónico, mensajería
- 📝 Historial de interacciones: llamadas, correos, reuniones
- 🔍 Búsqueda de clientes por nombre, correo, etiquetas
- 🗂️ Categorización y segmentación: etiquetas, estado

## 🧱 Arquitectura

- Arquitectura **Hexagonal pura**: el dominio no depende del framework
- Desarrollo con enfoque **TDD**
- Separación clara entre puertos y adaptadores
- Controladores REST, JPA y (opcionalmente) Kafka/RabbitMQ

## 🧪 Tecnologías utilizadas

- Java 17+
- Spring Boot
- JPA (Hibernate)
- REST API
- JUnit + Mockito (TDD)
- Testcontainers (para pruebas de integración)
- Kafka o RabbitMQ (opcional)

Java Arquitectura Hexagonal, Ports, Adapters, Kafka, RabbitMQ
<pre>
src
└── main
    └── java
        └── com.example.project
            ├── domain              # 🧠 Домен: сущности и порты (интерфейсы)
            │   ├── model           #   - бизнес-сущности (Entity/ValueObject)
            │   └── port            #   - порты: интерфейсы входные/выходные
            │
            ├── application         # 📘 Use Cases (входные порты + сервисы)
            │   └── service         #   - реализация бизнес-логики
            │
            ├── infrastructure      # ⚙️ Адаптеры: БД, API, REST, Kafka и т.д.
            │   ├── persistence     #   - адаптер БД (JPA, JDBC и т.п.)
            │   ├── controller      #   - REST-контроллеры (входные адаптеры)
            │   └── client          #   - внешние API (например, REST clients)
            │
            └── HexagonalApp.java   # 🚀🇪🇸 Точка входа (Spring Boot)
</pre>
---

> ⚠️ Este proyecto es educativo, pero puede servir como base para una solución real.

