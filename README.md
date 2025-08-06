# 🧠 Simple CRM — Arquitectura Hexagonal + TDD

**Simple CRM** es un sistema ligero de gestión de clientes, desarrollado con **Arquitectura Hexagonal (Puertos y Adaptadores)** y utilizando **TDD (Desarrollo guiado por pruebas)**.

## 🎯 Propósito

Este sistema está pensado para **pequeñas empresas, sector automotriz, sector textil, sector medicine, freelancers y equipos** que necesitan:
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
            ├── domain              # 🧠 Dominio: entidades y puertos (interfaces)
            │   ├── model           #   - entidades de negocio (Entity/ValueObject)
            │   └── port            #   - puertos: interfaces de entrada/salida
            │
            ├── application         # 📘 Casos de uso (puertos de entrada + servicios)
            │   └── service         #   - implementación de la lógica de negocio
            │
            ├── infrastructure      # ⚙️ Adaptadores: BBDD, API, REST, Kafka, etc.
            │   ├── persistence     #   - adaptador de base de datos (JPA, JDBC, etc.)
            │   ├── controller      #   - controladores REST (adaptadores de entrada)
            │   └── client          #   - APIs externas (por ejemplo, clientes REST)
            │
            └── HexagonalApp.java   # 🚀🇪🇸 Punto de entrada (Spring Boot)
</pre>
---

<img src="./src/main/resources/images/22.png" width="150" />
<img src="./src/main/resources/images/call-neo.png" width="150" />
<img src="./src/main/resources/images/11.png" width="150" />
<img src="./src/main/resources/images/call-neo2.png" width="150" />
<img src="./src/main/resources/images/33.png" width="150" />

> ⚠️ Este proyecto es educativo, pero puede servir como base para una solución real.

