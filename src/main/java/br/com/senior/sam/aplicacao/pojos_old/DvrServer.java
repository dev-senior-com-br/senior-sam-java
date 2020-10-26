package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;

public class DvrServer extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do Servidor
     */
    public String name;
    /**
     * Tipo do Servidor DVR
     */
    public DvrServerType dvrServerType;
    /**
     * Usuário de Acesso
     */
    public String user;
    /**
     * Senha de Acesso
     */
    public String password;
    /**
     * Identificador de Rede
     */
    public String host;
    /**
     * Porta de Comunicação
     */
    public Long port;
    /**
     * Domínio de Rede
     */
    public String networkDomain;
    /**
     * Identificador do Servidor
     */
    public String serverId;
    /**
     * Prefixo da URL
     */
    public String urlPrefix;

    private List<JsonPatch> jsonPatches;

    public DvrServer() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public DvrServer(Long id, String name, DvrServerType dvrServerType, String user, String password, String host, Long port, String networkDomain, String serverId, String urlPrefix, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.dvrServerType = dvrServerType;
        this.user = user;
        this.password = password;
        this.host = host;
        this.port = port;
        this.networkDomain = networkDomain;
        this.serverId = serverId;
        this.urlPrefix = urlPrefix;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public DvrServer(String name, DvrServerType dvrServerType, String user, String password) {
        this.name = name;
        this.dvrServerType = dvrServerType;
        this.user = user;
        this.password = password;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}