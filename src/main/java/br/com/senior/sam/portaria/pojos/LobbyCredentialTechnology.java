package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class LobbyCredentialTechnology extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Identificador da portaria
     */
    public Lobby lobby;
    /**
     * Tecnologia de credencial
     */
    public CardTechnology cardTechnology;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public LobbyCredentialTechnology() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public LobbyCredentialTechnology(Long id, Lobby lobby, CardTechnology cardTechnology, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.lobby = lobby;
        this.cardTechnology = cardTechnology;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
