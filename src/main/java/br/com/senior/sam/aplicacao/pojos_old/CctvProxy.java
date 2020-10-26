package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;

public class CctvProxy extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do Proxy CFTV
     */
    public String name;
    /**
     * Host
     */
    public String host;
    /**
     * Porta de Comunicação
     */
    public Long port;

    private List<JsonPatch> jsonPatches;

    public CctvProxy() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public CctvProxy(Long id, String name, String host, Long port, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.host = host;
        this.port = port;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public CctvProxy(String name, String host, Long port) {
        this.name = name;
        this.host = host;
        this.port = port;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}