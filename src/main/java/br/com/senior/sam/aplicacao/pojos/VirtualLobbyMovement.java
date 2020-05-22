package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.Role;

import java.util.List;

public class VirtualLobbyMovement {

    /**
     * ID
     */
    public Long id;
    /**
     * Portaria Virtual
     */
    public VirtualLobby virtualLobby;
    /**
     * Visitante
     */
    public Person visitor;
    /**
     * Visitado
     */
    public Person visited;
    /**
     * Responsável
     */
    public Person responsible;
    /**
     * Direção da movimentação
     */
    public MovementDirection movementDirection;
    /**
     * Data de criação
     */
    public java.time.Instant createdAt;
    /**
     * Papél
     */
    public Role role;
    /**
     * Chamada de Acesso
     */
    public AccessCall accessCall;

    private List<JsonPatch> jsonPatches;

    public VirtualLobbyMovement() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VirtualLobbyMovement(Long id, VirtualLobby virtualLobby, Person visitor, Person visited, Person responsible, MovementDirection movementDirection, java.time.Instant createdAt, Role role, AccessCall accessCall, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.virtualLobby = virtualLobby;
        this.visitor = visitor;
        this.visited = visited;
        this.responsible = responsible;
        this.movementDirection = movementDirection;
        this.createdAt = createdAt;
        this.role = role;
        this.accessCall = accessCall;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public VirtualLobbyMovement(VirtualLobby virtualLobby, Person visitor, Person visited, Person responsible, MovementDirection movementDirection, java.time.Instant createdAt, Role role) {
        this.virtualLobby = virtualLobby;
        this.visitor = visitor;
        this.visited = visited;
        this.responsible = responsible;
        this.movementDirection = movementDirection;
        this.createdAt = createdAt;
        this.role = role;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}