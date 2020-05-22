package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class OrganizationalStructure {

    /**
     * ID
     */
    public Long id;
    /**
     * Estrutura organizacional pai
     */
    public Long parent;
    /**
     * Tipo da estrutura organizacional
     */
    public OrganizationalStructureType organizationalStructureType;
    /**
     * Descrição
     */
    public String description;
    /**
     * Realiza Validação de Papel
     */
    public Boolean integrated;
    /**
     * Pessoas da estrutura organizacional
     */
    public java.util.List<OrganizationalStructurePerson> organizationalStructurePeople;

    private List<JsonPatch> jsonPatches;

    public OrganizationalStructure() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public OrganizationalStructure(Long id, Long parent, OrganizationalStructureType organizationalStructureType, String description, Boolean integrated, java.util.List<OrganizationalStructurePerson> organizationalStructurePeople, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.parent = parent;
        this.organizationalStructureType = organizationalStructureType;
        this.description = description;
        this.integrated = integrated;
        this.organizationalStructurePeople = organizationalStructurePeople;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public OrganizationalStructure(Long parent, OrganizationalStructureType organizationalStructureType, String description, Boolean integrated) {
        this.parent = parent;
        this.organizationalStructureType = organizationalStructureType;
        this.description = description;
        this.integrated = integrated;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}