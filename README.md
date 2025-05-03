# Planner NLW 

Planner NLW é uma aplicação desenvolvida com Spring Boot para gerenciar viagens, atividades, participantes e links relacionados a eventos de viagem.

## 🎯 Funcionalidades 

- **Gerenciamento de Viagens**:
  - Criar, atualizar, confirmar e visualizar detalhes de viagens.
- **Gerenciamento de Participantes**:
  - Convidar participantes para viagens.
  - Confirmar presença de participantes.
  - Listar todos os participantes de uma viagem.
- **Gerenciamento de Atividades**:
  - Registrar atividades relacionadas a uma viagem.
  - Listar todas as atividades de uma viagem.
- **Gerenciamento de Links**:
  - Registrar links úteis relacionados a uma viagem.
  - Listar todos os links de uma viagem.

## 🗂️ Estrutura do Projeto

```
planner-nlw/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── rocketseat/
│   │   │           └── planner/
│   │   │               ├── activity/         # Pacote com lógica de atividades
│   │   │               ├── link/             # Pacote com lógica de links
│   │   │               ├── participant/      # Pacote com lógica de participantes
│   │   │               └── trip/             # Pacote com lógica de viagens
│   │   ├── resources/                        # Arquivos de configuração e recursos
│   │   └── db/
│   │       └── migration/                    # Scripts de versionamento Flyway
│
├── test/
│   └── java/
│       └── com/
│           └── rocketseat/                  # Testes automatizados
│
├── target/                                   # Arquivos compilados
├── pom.xml                                   # Gerenciador de dependências Maven
└── README.md                                 # Documentação do projeto
```

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.1**
  - Spring Data JPA
  - Spring Web
- **H2 Database** (banco de dados em memória)
- **Flyway** (migração de banco de dados)
- **Lombok** (para reduzir boilerplate de código)
- **JUnit 5** (para testes)

## ⚙️ Configuração do Ambiente

1. Certifique-se de ter o Java 17 instalado.

2. Clone este repositório:
  ```
  git clone https://github.com/seu-usuario/planner-nlw.git
  ```

3. Navegue até o diretório do projeto:

  ```
  cd planner-nlw
  ```

4. Execute o projeto com o Maven Wrapper:

  ```
  ./mvnw spring-boot:run
  ```

### 🔗 Endpoints da API

***Viagens***: 
- POST **/trips/create** - Criar uma nova viagem.
- GET **/trips/{id}/details** - Obter detalhes de uma viagem.
- PUT **/trips/{id}/update** - Atualizar uma viagem.
- GET **/trips/{id}/confirm** - Confirmar uma viagem.

***Participantes***: 
- POST **/trips/{id}/invite** - Convidar um participante para uma viagem.
- GET **/trips/{id}/participants** - Listar todos os participantes de uma viagem.

***Atividades***: 
- POST **/trips/{id}/activities** - Registrar uma atividade em uma viagem.
- GET **/trips/{id}/activities** - Listar todas as atividades de uma viagem.

***Links***: 
- POST **/trips/{id}/links** - Registrar um link relacionado a uma viagem.
- GET **/trips/{id}/links** - Listar todos os links de uma viagem.

## 🎲 Banco de Dados
O projeto utiliza o banco de dados em memória H2. As migrações de banco de dados são gerenciadas pelo Flyway e estão localizadas em **src/main/resources/db/migration**.

***Tabelas***
- **trips**: Gerencia as viagens.
- **participants**: Gerencia os participantes das viagens.
- **activities**: Gerencia as atividades relacionadas às viagens.
- **links**: Gerencia os links úteis relacionados às viagens.

## 🧩 Testes

Os testes estão localizados em **src/test/java/com/rocketseat/planner**. Para executar os testes, utilize o comando:

```
./mvnw test
```
---

Desenvolvido por: **Vitor**.