
---

### README em Inglês logo abaixo / README in English below
---

### README.md

#### Descrição do Projeto:
Este projeto consiste em um backend Java Spring que permite o gerenciamento de usuários e departamentos. É possível listar todos os usuários, buscar usuários pelo ID e adicionar novos usuários, com as informações de nome, email e departamento (informática ou Recursos Humanos).

---

### Como executar o projeto

#### Pré-requisitos

- **Java JDK 11** ou superior
- **Maven** (ou use a ferramenta integrada à sua IDE)
- **Postman** ou outro software para testes de APIs REST
- Banco de dados **H2** embutido (não é necessária configuração externa)

#### Passos para rodar a aplicação localmente:

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/GabrielVinhati/Projeto-Usuario-Departamento
   cd Projeto-Usuario-Departamento
   ```

2. **Compile e rode o projeto:**

   Se estiver usando o Maven, utilize o seguinte comando:

   ```bash
   mvn spring-boot:run
   ```

   Ou rode a aplicação diretamente pela sua IDE de preferência (como IntelliJ ou Eclipse).

3. **Acesse a aplicação:**

   O projeto será executado na URL: `http://localhost:8080`.

---

### Endpoints Disponíveis

#### Listar todos os usuários:

- **Método:** GET
- **URL:** `/users`
- **Exemplo de resposta:**

  ```json
  [
    {
      "id": 1,
      "name": "João",
      "email": "joao@empresa.com",
      "department": {
        "id": 1,
        "name": "Informática"
      }
    },
    {
      "id": 2,
      "name": "Maria",
      "email": "maria@empresa.com",
      "department": {
        "id": 2,
        "name": "Recursos Humanos"
      }
    }
  ]
  ```

#### Buscar um usuário pelo ID:

- **Método:** GET
- **URL:** `/users/{id}`
- **Exemplo de resposta:**

  ```json
  {
    "id": 1,
    "name": "gabriel",
    "email": "gabriel.vinhati@outlook.com",
    "department": {
      "id": 1,
      "name": "Informática"
    }
  }
  ```

#### Inserir um novo usuário:

- **Método:** POST
- **URL:** `/users`
- **Body (JSON):**

  ```json
  {
    "name": "Pedro",
    "email": "pedro@empresa.com",
    "department": {
      "id": 1
    }
  }
  ```

- **Exemplo de resposta:**

  ```json
  {
    "id": 3,
    "name": "Pedro",
    "email": "pedro@empresa.com",
    "department": {
      "id": 1,
      "name": "Informática"
    }
  }
  ```

---

### Estrutura do projeto

- **UserController.java:** Controlador que expõe os endpoints REST.
- **UserRepository.java:** Interface que lida com operações de banco de dados (usando JPA).
- **User.java:** Entidade que representa os usuários.
- **Department.java:** Entidade que representa os departamentos.

---

### Observações

- A aplicação utiliza um banco de dados **H2** em memória, que será inicializado e destruído automaticamente a cada execução.
- Caso queira visualizar o banco de dados em memória, acesse: `http://localhost:8080/h2-console`.

---

ENGLISH

---

### README.md

#### Project Description:
This project consists of a Java Spring backend that allows the management of users and departments. It is possible to list all users, search for users by ID, and add new users with information like name, email, and department (Informatics or Human Resources).

---

### How to run the project

#### Prerequisites

- **Java JDK 11** or higher
- **Maven** (or use the integrated tool in your IDE)
- **Postman** or other software for testing REST APIs
- Embedded **H2** database (no external configuration required)

#### Steps to run the application locally:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/GabrielVinhati/Projeto-Usuario-Departamento
   cd Projeto-Usuario-Departamento
   ```

2. **Compile and run the project:**

   If you're using Maven, use the following command:

   ```bash
   mvn spring-boot:run
   ```

   Or run the application directly through your preferred IDE (such as IntelliJ or Eclipse).

3. **Access the application:**

   The project will run at the URL: `http://localhost:8080`.

---

### Available Endpoints

#### List all users:

- **Method:** GET
- **URL:** `/users`
- **Response example:**

  ```json
  [
    {
      "id": 1,
      "name": "João",
      "email": "joao@empresa.com",
      "department": {
        "id": 1,
        "name": "Informatics"
      }
    },
    {
      "id": 2,
      "name": "Maria",
      "email": "maria@empresa.com",
      "department": {
        "id": 2,
        "name": "Human Resources"
      }
    }
  ]
  ```

#### Search for a user by ID:

- **Method:** GET
- **URL:** `/users/{id}`
- **Response example:**

  ```json
  {
    "id": 1,
    "name": "Gabriel",
    "email": "gabriel.vinhati@outlook.com",
    "department": {
      "id": 1,
      "name": "Informatics"
    }
  }
  ```

#### Insert a new user:

- **Method:** POST
- **URL:** `/users`
- **Body (JSON):**

  ```json
  {
    "name": "Pedro",
    "email": "pedro@empresa.com",
    "department": {
      "id": 1
    }
  }
  ```

- **Response example:**

  ```json
  {
    "id": 3,
    "name": "Pedro",
    "email": "pedro@empresa.com",
    "department": {
      "id": 1,
      "name": "Informatics"
    }
  }
  ```

---

### Project structure

- **UserController.java:** Controller that exposes the REST endpoints.
- **UserRepository.java:** Interface that handles database operations (using JPA).
- **User.java:** Entity representing the users.
- **Department.java:** Entity representing the departments.

---

### Notes

- The application uses an in-memory **H2** database, which will be automatically initialized and destroyed with each execution.
- If you want to view the in-memory database, access: `http://localhost:8080/h2-console`.

---
