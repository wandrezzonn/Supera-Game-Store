# Supera-Game-Store
Supera Game Store - Avaliação Java
# Autor: Anderson Santos
### 🛠 Tecnologias
- [Java 11](https://docs.oracle.com/en/java/javase/11/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database](https://www.h2database.com/html/main.html)

### Funcionalidades
- Listar todos os produtos
    - Adicionar ou remover produtos do carrinho de compras.
     - Verificar checkout: valor total da compra, quantidade de itens, valor do frete, produtos no carrinho
## Projeto usa Maven:
* ./mvnw clean package :: compilado e empacota o código

## Por padrão o projeto rodará na porta 8080
Usando o comando java -jar SuperaGameStore-0.0.1-SNAPSHOT.jar
### Endpoints para requisições  
##### Metodo HTTP suportado GET
#### Lista todos os prududos em representação JSON limitado a 15 items.
Alteração para mais ou para menos poderá ser realizada na classe PageableConfiguration.java
* /products
#### Lista todos os produtos ordenado por preço.
* /products?sort=price
#### Lista todos os produtos por preço na ordem decrecente.
* /products?sort=price,desc
#### Lista todos os produtos por nome na ordem alfabética.
* /products?sort=name
#### Lista todos os produtos por nome na ordem decrecente alfabética.
* /products?sort=name,desc
#### Lista todos os produtos por score/popularidade.
* /products?sort=score
#### Lista todos os produtos por score/popularidade na ordem decrecente.
* /products?sort=score,desc
#### Adiciona um produto no carrinho pelo id (tipo inteiro).
Exemplo: /products/add/1
* /products/add/id
#### Remove um produto do carrinho pelo id (tipo inteiro) e devolve os itens restante no carrinho.
Exemplo: /products/shoppingcart/1
* /products/shoppingcart/id
#### Mostra todos os produtos do carrinho, valor total da compra, valor total do frete, quantidade de produtos no carrinho.
* /products/shoppingcart/checkout

#### Paginação ('page = 0' é a página inicial, 'size = 5' para limitar a quantidade de produtos a serem exibidos)
* /products?page=0&size=5
#### Paginação (Acrescentando 'sort=price' será paginado e classificado por preço na ordem crescente)
* /products?page=0&size=5&sort=price
#### Paginação (Acrescentando 'sort=price,desc' será paginado e classificado por preço na ordem decrecente)
* /products?page=0&size=5&sort=price,desc

Uso do Framework Spring Boot no projeto para ganho de tempo e produtividade no desenvolvimento da API.
