package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class ReaderDeviceCardFormat {

    /**
     * ID
     */
    public Long id;
    /**
     * Leitora
     */
    public ReaderDevice readerDevice;
    /**
     * Formato de Cartão
     */
    public CardFormat cardFormat;

    private List<JsonPatch> jsonPatches;

    public ReaderDeviceCardFormat() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ReaderDeviceCardFormat(Long id, ReaderDevice readerDevice, CardFormat cardFormat, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.readerDevice = readerDevice;
        this.cardFormat = cardFormat;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ReaderDeviceCardFormat(CardFormat cardFormat) {
        this.cardFormat = cardFormat;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}