# java-arquitectura-hexagonal-kafka
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
