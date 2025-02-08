# Sistema de Gerenciamento de Pedidos

Este é um sistema simples de gerenciamento de pedidos desenvolvido em Java, que permite a criação e gestão de pedidos de produtos por clientes. O sistema é executado via terminal e é composto por várias classes que representam as entidades do domínio do problema.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Cliente**: Armazena os dados do cliente que está realizando a compra.
- **Order**: Representa um pedido, que pode conter vários itens de pedido (`OrderItem`).
- **OrderItem**: Representa um item de pedido, que faz o cálculo do valor total do produto multiplicado pela quantidade solicitada.
- **Product**: Armazena os dados dos produtos disponíveis para compra.
- **OrderStatus (Enum)**: Define os possíveis status de um pedido:
  - `PENDING_PAYMENT`: Pagamento pendente.
  - `PROCESSING`: Pedido em processamento.
  - `SHIPPED`: Pedido enviado.
  - `DELIVERED`: Pedido entregue.
- **Main**: Classe principal que contém o método `main` para execução do programa.

## Funcionalidades

- Cadastro de clientes.
- Cadastro de produtos.
- Criação de pedidos com múltiplos itens.
- Cálculo automático do valor total de cada pedido.
- Atualização do status do pedido utilizando o `Enum OrderStatus`.

## Como Executar o Projeto

1. **Pré-requisitos**:
   - Java Development Kit (JDK) instalado.
   - Ambiente de desenvolvimento ou terminal configurado para compilar e executar programas Java.

2. **Compilação e Execução**:
   - Navegue até o diretório do projeto.
   - Compile o código-fonte Java:
     ```bash
     javac *.java
     ```
   - Execute o programa:
     ```bash
     java Main
     ```

## Exemplo de Uso

1. **Cadastrar Cliente**:
   - Insira o nome, endereço e outras informações necessárias do cliente.

2. **Cadastrar Produto**:
   - Insira o nome, preço e outras informações necessárias do produto.

3. **Criar Pedido**:
   - Selecione o cliente e adicione os produtos desejados com as quantidades correspondentes.
   - O sistema calculará automaticamente o valor total do pedido.
   - O status inicial do pedido será `PENDING_PAYMENT`.

4. **Atualizar Status do Pedido**:
   - Altere o status do pedido conforme necessário:
     - `PROCESSING`: Quando o pagamento for confirmado.
     - `SHIPPED`: Quando o pedido for enviado.
     - `DELIVERED`: Quando o pedido for entregue.

## Contribuição

Contribuições são bem-vindas! Se você deseja contribuir para este projeto, siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionando nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato:

- **Nome**: [Adrian Rosselis Viana e Silva]
- **Email**: [adrianrosselis2017@gmail.com]
