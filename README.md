# Senior SAM API SDK para Java

Esta biblioteca permite desenvolvedores criar integrações das APIs do SAM da Senior.

## Instalação

### Usando Maven
1. Executar `mvn clean install`, após a execução do comando Senior API SDK para Java estará instalado no repositório local do maven.

2. Adicionar a dependência Senior Sam no pom.xml do seu projeto

  ```xml
    ...
    <dependencies>
        <dependency>
            <groupId>br.com.senior</groupId>
            <artifactId>senior-sam-java</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
    ...
  ```

### Ambiente

Atualmente o ambiente padrão para o desenvolvimento é o da Homologx.
Para fazer a troca do ambiente basta chamar o construtor da api passando um dos Environments configurados:

```java
public enum Environment {

    PROD("https://api.senior.com.br"),
    HOMOLOG("https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0");

    private final String url;

    Environment(String url) {
        this.url = url;
    }
}
```

## Exemplo Rápido

Implementamos no pacote **/src/test/java/br/com/senior/sam** um conjunto de testes de integração para cada serviço. Alguns serviços dependem de variáveis que precisam ser informadas pelos usuários, como login e senha para efetuar o login.

O ambiente pode ser definido no construtor de cada client, por padrão é utilizado o ambiente de homologação.

Os  testes servem como exemplos de implementação, basta copiar o código do exemplo que se deseja para sua aplicação.

Utilizando como exemplo o login, caso a aplicação queira efetuar o login integrado com a Senior, basta adicionar a dependência no maven e utilizar o cliente de autenticação, por exemplo:

```java
    ...
    final String username = "meu_usuario@dominio.com.br";
    final String password = "minha_senha";
    AuthenticationClient client = new AuthenticationClient();
    LoginOutput output = client.login(new LoginInput(username, password));
    ...
```

Para mudar o ambiente para produção é necessário informar o environment ao chamar o construtor do Client:

```java
  AuthenticationClient client = new AuthenticationClient(Environment.PROD);
```

Definir as seguintes variáveis de ambiente:

```
SENIOR_USERNAME=<usuario>
PASS=<senha_do_usuario>
TENANT_NAME=<nome_do_tenant>
TENANT_DOMAIN=<dominio_do_tenant>
```

## [Guia de contribuição](https://dev.senior.com.br/guia-de-contribuicao/)

## Suporte

Criar um issue https://github.com/dev-senior-com-br/senior-sam-java/issues

## License

Copyright © 2020.
