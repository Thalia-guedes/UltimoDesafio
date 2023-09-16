# Bem-vindo ao Sistema de Vendas! 🛒💼

Seja bem-vindo ao nosso Sistema de Vendas! Este sistema foi criado para facilitar a gestão das suas vendas, clientes e vendedores. Vamos dar uma olhada nas funcionalidades principais:

## Funcionalidades Principais:

### 1. Cadastro de Clientes 🧾:
Permite registrar informações dos seus clientes, como nome, email, CPF e endereço.

### 2. Cadastro de Vendedores 🕵️:
Possibilita adicionar detalhes sobre seus vendedores, como nome, email, CPF e salário.

### 3. Gestão de Vendas 📊:
Permite registrar uma venda, incluindo nome do produto, preço, quantidade e valor total.

## Como Usar:

1. **Cadastro de Cliente:**
    - Para cadastrar um novo cliente, utilize a API de cadastro de clientes, fornecendo as informações necessárias (nome, email, CPF, etc.).
    - Após o cadastro, o cliente será adicionado ao sistema.

2. **Cadastro de Vendedor:**
    - Utilize a API de cadastro de vendedores, informando os dados do vendedor (nome, email, CPF, salário).
    - Ao confirmar, o vendedor será registrado no sistema.

3. **Realizar Venda:**
    - Acesse a API de criação de vendas.
    - Informe o produto, seu preço e a quantidade.
    - A API calculará o valor total automaticamente e registrará a venda.

Lembre-se de utilizar as APIs adequadas para cada operação e salvar as informações após cada ação. É fácil e intuitivo!
## :pushpin: Tratamento de Erros

Nosso sistema possui mecanismos para garantir que as operações sejam realizadas corretamente. Abaixo estão alguns pontos importantes sobre o tratamento de erros:

- **IDs Inválidos:**
    - Não permitimos IDs (variáveis de caminho) que não sejam no formato de números inteiros. Tentar enviar um ID com letras ou caracteres especiais resultará em um erro informando que o ID deve ser um número.

- **Campos em Branco:**
    - Não é permitido enviar campos em branco, como uma string vazia (""). Caso tente enviar campos vazios, receberá uma mensagem de erro pedindo para preencher todos os campos obrigatórios.

- **Valores Inválidos:**
    - Certificamos que os valores inseridos são válidos. Preços e quantidades não podem ser menores ou iguais a zero. Se você tentar enviar valores negativos ou zero, será notificado sobre a necessidade de inserir valores válidos.

- **Corpo Vazio:**
    - É obrigatório enviar um corpo com os campos necessários. Enviar um corpo sem informações resultará em um erro indicando que é necessário fornecer os dados corretamente.

Estamos comprometidos em garantir que o uso do sistema seja fácil, seguro e intuitivo. Essas verificações ajudam a manter a integridade e qualidade das operações realizadas. 🚀


## Tecnologias Utilizadas:

- **Linguagem:** Java ☕
- **Banco de Dados:** PostgreSQL (Relacional) 🐘
- **Framework:** Spring Boot 🚀
- **Bibliotecas:** JPA, Validation, Lombok 📚
- **IDE:** IntelliJ IDEA 💡
- **Teste de Requisições API:** Insomnia 🛌

## :round_pushpin: Endpoints

Aqui estão os principais endpoints (pontos de acesso) para a API:

- `/clientes`: Endpoint para gerenciar clientes.
- `/vendedores`: Endpoint para gerenciar vendedores.
- `/vendas`: Endpoint para gerenciar vendas.

Este sistema ajuda você a organizar suas vendas, manter dados dos clientes e gerenciar sua equipe de vendas de forma simples e eficiente, utilizando tecnologias modernas e práticas. Experimente e aproveite a praticidade! 🚀

[Video das Query](https://drive.google.com/file/d/1k85qSf9bTbyWpb2w94sKMBXmcxEAaHIc/view)

