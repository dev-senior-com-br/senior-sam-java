package br.com.senior.sam.portaria.pojos;

public class LobbyRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome da portaria
     */
    public String name;

    public LobbyRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public LobbyRecord(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}