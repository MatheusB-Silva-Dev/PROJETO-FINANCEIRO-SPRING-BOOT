# Projeto Financeiro – Spring Boot

Este projeto é a evolução do sistema que fizemos em **Java puro**, agora usando **Spring Boot** e **JPA/Hibernate**.  
Ele serve para **gerenciar dívidas e transações** de forma prática e organizada, funcionando como uma boa vitrine de estudos e portfólio.

---

## Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (banco em memória)

---

## Funcionalidades

### Dívidas
- Criar uma dívida nova
- Listar todas as dívidas
- Atualizar uma dívida existente
- Remover dívida

### Transações
- Criar nova transação
- Listar todas as transações
- Atualizar transação
- Remover transação

---

Toda regra básica de negócio está concentrada na **camada Service**, e a persistência é gerenciada via JPA na **camada Repository**.

---

- API **limpa, separada em camadas**
- Uso de **JPA Repository** para persistência

---

## Modelo de Dados

### Entidade Dívida
- `id` (Long)
- `descricao` (String)
- `valor` (Double)
- `data` (LocalDate)

### Entidade Transação
- `id` (Long)
- `descricao` (String)
- `valor` (Double)
- `data` (LocalDate)

---

## Endpoints da API

### Dívidas

| Método | Rota | Descrição |
|-------|-------|-----------|
| POST | `/dividas` | Criar dívida |
| GET | `/dividas` | Listar dívidas |
| PUT | `/dividas/{id}` | Atualizar dívida |
| DELETE | `/dividas/{id}` | Remover dívida |

---

### Transações

| Método | Rota | Descrição |
|-------|-------|-----------|
| POST | `/transacoes` | Criar transação |
| GET | `/transacoes` | Listar transações |
| PUT | `/transacoes/{id}` | Atualizar transação |
| DELETE | `/transacoes/{id}` | Remover transação |

---

## Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

- Evoluir o conhecimento em **Spring Boot**
- Compreender rotas REST e boas práticas
- Consolidar padrões de camadas Service/Repository
- Criar um projeto realista para estágio/portfólio


