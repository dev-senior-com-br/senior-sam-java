package br.com.senior.sam.aplicacao;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.entities.EntitiesUtils;
import br.com.senior.core.entities.EntityPage;
import br.com.senior.sam.aplicacao.pojos.Credential;

public class AplicacaoClient extends BaseClient {

    private final String token;

    /**
     * Construtor
     */
    public AplicacaoClient(String token) {
        super("sam", "application");
        this.token = token;
    }

    /**
     * Construtor
     *
     * @param env - Variáveis de ambiente
     */
    public AplicacaoClient(String token, Environment env) {
        super("sam", "application", env);
        this.token = token;
    }

    public EntityPage<Credential> getPersonCredentials(String personId) {
        return new EntitiesUtils<>(this.env, this.domain, this.service, this.token, Credential.class).executeGet(String.format("person/%s/credentials", personId), null);
    }

}
