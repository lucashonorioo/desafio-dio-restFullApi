# Santander Dev Week-2025
Java RESTful API criada para a Sandander Dev Week

## Diagrama de Classes 

```mermaid
classDiagram
    class User {
        -long id
        -String name
        -Account account
        -Features[] features
        -Card card
        +News[] news
    }

    class Account {
        -long id
        -String number
        -String agency
        -String balance
        -String limit
    }

    class Features {
        -long id
        -String icon
        -String description
    }

    class Card {
        -long id
        -String number
        -String limit
    }

    class News {
        -long id
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Features
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
