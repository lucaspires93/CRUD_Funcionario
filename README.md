# 🧑‍💼 CRUD de Funcionários com Spring Boot e Java

## 💡 Sobre o Projeto
Este projeto é uma API RESTful simples desenvolvida com Spring Boot, projetada para gerenciar o cadastro completo de funcionários (CRUD: Create, Read, Update, Delete). Ele demonstra o desenvolvimento de serviços de backend robustos e a aplicação de boas práticas de arquitetura na plataforma Java moderna. O sistema inclui um tratamento de erros profissional, retornando o código HTTP 404 para recursos não encontrados.

## ⚙️ Tecnologias e Ferramentas

| Categoria | Tecnologia/Ferramenta | Destaque |
| :--- | :--- | :--- |
| **Linguagem** | **Java** | Utilização de recursos modernos da linguagem e programação orientada a objetos. |
| **Framework** | **Spring Boot** | Configuração rápida, auto-configuração, e uso de módulos-chave para desenvolvimento web. |
| **Persistência** | **Spring Data JPA & Hibernate** | Mapeamento Objeto-Relacional (ORM) e gerenciamento de transações no acesso a dados. |
| **Base de Dados** | **H2 Database** | Utilizada como banco de dados em memória para desenvolvimento e testes. |
| **Modelagem** | **Lombok** | Geração automática de código boilerplate (Getters, Setters, Construtores, Builder) para concisão. |
| **API/Testes** | **Postman** | Ferramenta utilizada para testar e validar todos os endpoints RESTful. |

## 🚀 Endpoints da API

A aplicação expõe os seguintes endpoints REST, que foram totalmente validados:

| Método HTTP | Endpoint | Descrição |
| :--- | :--- | :--- |
| **POST** | `/funcionario` | Cadastra um novo funcionário. |
| **GET** | `/funcionario/{id}` | Busca um funcionário pelo ID. |
| **PUT** | `/funcionario/{id}` | Atualiza um funcionário pelo ID. |
| **DELETE** | `/funcionario/{id}` | Remove um funcionário pelo ID. |

## 🧠 Aprendizados e Habilidades Praticadas

Este projeto solidificou as seguintes habilidades de Engenharia de Software:

1.  **Arquitetura em Camadas (Service Layer):** Implementação de uma clara separação de responsabilidades entre Controller (interface), Service (regras de negócio) e Repository (acesso a dados).
2.  **Desenvolvimento RESTful:** Criação de endpoints que aderem aos princípios REST, utilizando verbos HTTP (POST, PUT, DELETE) e Status Codes apropriados (200 OK, **404 Not Found**).
3.  **Tratamento de Exceções Profissional:** Implementação de exceções customizadas (`ResourceNotFoundException`) e um `Global Exception Handler` para retornar códigos de erro HTTP semânticos.
4.  **Persistência com JPA:** Utilização eficiente de anotações JPA/Hibernate para ORM e operações CRUD através do Spring Data.
5.  **Padrões de Código:** Uso do padrão Builder e lógica de atualização **Fetch-and-Modify** no service layer para manipular entidades de forma transacional.
6.  **Teste de APIs:** Validação e garantia de funcionalidade de todos os endpoints utilizando o **Postman**.
