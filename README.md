
### Desafio Estrelas Aprendiz - Último Desafio 🌟

Bem-vindo ao repositório do Último Desafio do projeto Estrelas Aprendiz! Este projeto representa o culminar do aprendizado e prática obtidos ao longo do projeto, apresentando uma aplicação robusta desenvolvida em Java, utilizando Spring Boot para a construção de uma API e integração com Banco de dados.

### Quer ver as queries em ação? 🎥

No final deste README, você encontrará um link para vídeos que demonstram a execução das queries no banco de dados. 🚀

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
- ## Como Contribuir

1. **Faça um fork do repositório** 🍴
   - Clique no botão "Fork" no canto superior direito desta página para criar uma cópia do repositório no seu perfil.

2. **Crie uma branch com uma nova feature** 🌿
   - Execute o comando `git checkout -b feature/nova-feature` para criar uma nova branch para a sua feature.

3. **Faça commit das suas alterações** 💡
   - Após fazer as alterações necessárias, execute o comando `git commit -m 'Adicionando nova feature'` para fazer um commit das suas alterações.

4. **Faça push para a branch** 🔀
   - Execute o comando `git push origin feature/nova-feature` para enviar suas alterações para o repositório remoto.

5. **Crie um novo Pull Request** 🛠️
   - Vá até a página do seu repositório no GitHub e clique no botão "New Pull Request" para criar um novo pull request com suas alterações.



## 🎉🎊 Obrigado por explorar meu repositório! 🚀💖

## 🌟🚀💖 Até a próxima! Happy coding! 🎉🌈


[Video das Query](https://drive.google.com/file/d/1k85qSf9bTbyWpb2w94sKMBXmcxEAaHIc/view)

