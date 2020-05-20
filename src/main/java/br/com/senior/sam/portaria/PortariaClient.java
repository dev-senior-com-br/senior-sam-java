package br.com.senior.sam.portaria;

import br.com.senior.sam.portaria.pojos.CreatePersonProvisoryCredential;
import br.com.senior.sam.portaria.pojos.CreateVisitorProvisoryCredential;
import br.com.senior.sam.portaria.pojos.ProvisoryCredentialRecord;
import br.com.senior.sam.utils.BaseClient;
import br.com.senior.sam.utils.EndpointPath;
import br.com.senior.sam.utils.Environment;
import br.com.senior.sam.utils.ServiceException;

/**
 * Cliente do serviço de  <a href="https://dev.senior.com.br/apis/sam_portaria">Portaria</a>
 */
public class PortariaClient extends BaseClient {

    private final String token;

    /**
     * Construtor
     */
    public PortariaClient(String token) {
        super("sam", "lobby");
        this.token = token;
    }

    /**
     * Construtor
     *
     * @param env - Variáveis de ambiente
     */
    public PortariaClient(String token, Environment env) {
        super("sam", "lobby", env);
        this.token = token;
    }

    /**
     * Cria credencial temporária para uma pessoa previamente cadastrada, visitantes podem ser cadastradas utilizando a ação createVisitorProvisoryCredentialCard
     *
     * @param payload - Payload de entrada com os dados para criação da credencial da pessoa
     * @return - Payload de saída com os dados da credencial da pessoa
     * @throws ServiceException - Erro tratado de serviço
     */
    public ProvisoryCredentialRecord createPersonProvisoryCredentialCard(CreatePersonProvisoryCredential payload) throws ServiceException {
        return execute(getActionsUrl(EndpointPath.Portaria.CREATE_PERSON_PROVISORY_CREDENTIAL_CARD), payload, this.token, ProvisoryCredentialRecord.class);
    }

    /**
     * Cria credencial temporária para uma pessoa previamente cadastrada, visitantes podem ser cadastradas utilizando a ação createVisitorProvisoryCredentialCard
     *
     * @param payload - Payload de entrada com os dados para criação da credencial da pessoa
     * @return - Payload de saída com os dados da credencial da pessoa
     * @throws ServiceException - Erro tratado de serviço
     */
    public ProvisoryCredentialRecord createVisitorProvisoryCredentialCard(CreateVisitorProvisoryCredential payload) throws ServiceException {
        return execute(getActionsUrl(EndpointPath.Portaria.CREATE_VISITOR_PROVISORY_CREDENTIAL_CARD), payload, this.token, ProvisoryCredentialRecord.class);
    }

}
