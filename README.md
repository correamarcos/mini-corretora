# 🏦 Mini Corretora de Investimentos

Este projeto simula uma corretora de investimentos com arquitetura de microserviços orientada a eventos, utilizando Java (Spring Boot) e Apache Kafka. Ele foi desenvolvido como estudo prático para sistemas financeiros distribuídos.

---

## 🔧 Tecnologias Principais

* Java 17 + Spring Boot 3+
* Apache Kafka
* PostgreSQL
* Docker + Docker Compose
* Prometheus, Grafana, Loki, Jaeger
* Spring Security + JWT
* Testcontainers
* OpenAPI (Swagger)

---

## 🏗️ Arquitetura do Sistema

> Arquitetura baseada em microserviços com comunicação via eventos Kafka.

```
                                Será adicionado posteriormente
```

---

## 📦 Microserviços

| Serviço                | Responsabilidade Principal                             |
| ---------------------- | ------------------------------------------------------ |
| `user-service`         | Cadastro, autenticação e gestão de saldo de usuários   |
| `portfolio-service`    | Controle da carteira de investimentos do usuário       |
| `trade-service`        | Criação e execução de ordens de compra e venda         |
| `quote-service`        | Simulação e envio de atualizações de cotação de ativos |
| `notification-service` | Envio de e-mails/avisos de eventos importantes         |
| `gateway-service`      | API Gateway e roteamento de requisições externas       |
| `auth-service`         | Autenticação centralizada via JWT                      |

---

## 🔄 Kafka - Tópicos e Eventos

* `user.created`
* `user.balance.updated`
* `quote.updated`
* `trade.requested`
* `trade.executed`
* `portfolio.updated`
* `notification.sent`

---

## 🔐 Segurança

* Autenticação via JWT (Spring Security)
* Validação de token no `gateway-service`
* Comunicação entre serviços protegida com mTLS (opcional)

---

## 🧪 Testes

* **Unitários**: JUnit, Mockito
* **Integração**: Testcontainers (PostgreSQL e Kafka)
* **Contratos**: Spring Cloud Contract
* **Performance**: Gatling

---

## 📚 Documentação

* Swagger/OpenAPI por serviço
* Diagrama de arquitetura no diretório `/docs`
* README detalhado por serviço
* Coleção do Postman/Insomnia no diretório `/tests`

---

## 📁 Versionamento

* Versionamento de API: `/api/v1/...`
* Kafka: Payload com `schema.version`

---

## 🚀 Como Executar Localmente

```bash
# Clone o projeto
$ git clone https://github.com/correamarcos/mini-corretora.git
$ cd mini-corretora

# Suba os serviços com Docker
$ docker-compose up --build

# Acesse a documentação Swagger
http://localhost:8080/swagger-ui.html
```

---

> Projeto desenvolvido para fins de estudo e prática com microserviços, Kafka e sistemas financeiros.
