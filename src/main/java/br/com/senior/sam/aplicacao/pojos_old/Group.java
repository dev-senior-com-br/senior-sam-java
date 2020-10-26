package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;

public class Group extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * ID do Pai
     */
    public Long parent;
    /**
     * Nome do Grupo
     */
    public String name;
    /**
     * Local Físico
     */
    public PhysicalLocation physicalLocation;
    /**
     * Vaga de Estacionamento
     */
    public Long parkingSpace;
    /**
     * Vaga de Estacionamento em Uso
     */
    public Long parkingSpaceInUse;
    /**
     * Pessoas do Grupo
     */
    public java.util.List<GroupPerson> people;
    /**
     * Caminho hierárquico completo
     */
    public String fullHierarchicalPath;

    private List<JsonPatch> jsonPatches;

    public Group() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Group(Long id, Long parent, String name, PhysicalLocation physicalLocation, Long parkingSpace, Long parkingSpaceInUse, java.util.List<GroupPerson> people, String fullHierarchicalPath, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.physicalLocation = physicalLocation;
        this.parkingSpace = parkingSpace;
        this.parkingSpaceInUse = parkingSpaceInUse;
        this.people = people;
        this.fullHierarchicalPath = fullHierarchicalPath;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Group(Long parent, String name, Long parkingSpace, Long parkingSpaceInUse) {
        this.parent = parent;
        this.name = name;
        this.parkingSpace = parkingSpace;
        this.parkingSpaceInUse = parkingSpaceInUse;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}