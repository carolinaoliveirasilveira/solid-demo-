# Projeto Notificação de Usuários com SOLID

Este projeto demonstra a aplicação prática dos princípios **SOLID** em um sistema simples de **notificação de usuários**, com envio de mensagens por **e-mail** e **SMS**. A proposta é mostrar como a aplicação consciente dos princípios pode tornar o código mais **organizado**, **escalável** e **manutenível**.

---

## Objetivo

- Registrar usuários
- Notificá-los por e-mail ou SMS
- Aplicar os princípios **SOLID** na arquitetura do sistema

---

## Tecnologias Utilizadas

- Java 
- Spring Boot
- Padrões SOLID
- Gradle (ou Maven)
- IDE de sua preferência (ex: IntelliJ)

---

## Estrutura do Projeto

```plaintext
com/solid/
├── controllers/
│   └── UserController.java
├── domain/
│   ├── interfaces/
│   │   └── Notifier.java
│   ├── models/
│   │   └── User.java
│   └── services/
│       ├── EmailNotifierService.java
│       ├── SmsNotifierService.java
│       ├── UserNotificationService.java
│       └── UserService.java
├── SolidDemoApplication.java
```

---

 ## Princípios SOLID aplicados:
 ### S – Single Responsibility Principle
Cada classe tem uma única responsabilidade.
Ex: UserService apenas registra usuários. EmailNotifierService apenas envia e-mails.

  ### O – Open/Closed Principle
O sistema é aberto para extensão e fechado para modificação.
Basta criar uma nova implementação de Notifier (ex: WhatsappNotifierService) sem alterar código existente.

 ### L – Liskov Substitution Principle
As implementações de Notifier podem ser substituídas entre si sem impactar o comportamento.

 ### I – Interface Segregation Principle
A interface Notifier é enxuta, com apenas um método necessário para todas as notificações.

 ### D – Dependency Inversion Principle
A classe UserNotificationService depende da abstração Notifier, não das implementações concretas.

---

## Como Executar:

1. Clone o repositório:
```
bash
git clone https://github.com/seu-usuario/notificacao-solid.git
```
2. Importe o projeto na sua IDE.

3. Execute a classe SolidDemoApplication.

---

##  Autora
**Carolina Oliveira Silveira**  
Desenvolvedora Back-end | Estudante de Análise e Desenvolvimento de Sistemas

- 💼 [LinkedIn](https://www.linkedin.com/in/carolinaoliveirasilveira/)
- 📧 carolinaoliveirasilveira@outlook.com

