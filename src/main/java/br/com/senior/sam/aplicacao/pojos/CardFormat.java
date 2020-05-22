package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class CardFormat extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do Formato
     */
    public String name;
    /**
     * Código de Acesso
     */
    public Long facilityCode;
    /**
     * Deslocamento de Bits
     */
    public Long bitsShift;
    /**
     * Quantidade de Bits do Cartão
     */
    public Long cardLength;
    /**
     * Quantidade de Bits de Paridade Ímpar
     */
    public Long oddBitsLength;
    /**
     * Quantidade de Bits de Paridade Par
     */
    public Long evenBitsLength;
    /**
     * Quantidade de Bits do Código de Acesso
     */
    public Long facilityCodeLength;
    /**
     * Bit de Ínicio do Código de Acesso
     */
    public Long facilityCodeStart;
    /**
     * Quantidade de Bits do Número do Cartão
     */
    public Long cardNumberLength;
    /**
     * Bit de Ínicio do Número do Cartão
     */
    public Long cardNumberStart;
    /**
     * Padrão Para Todas as Leitoras
     */
    public Boolean defaultAllReaders;

    private List<JsonPatch> jsonPatches;

    public CardFormat() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public CardFormat(Long id, String name, Long facilityCode, Long bitsShift, Long cardLength, Long oddBitsLength, Long evenBitsLength, Long facilityCodeLength, Long facilityCodeStart, Long cardNumberLength, Long cardNumberStart, Boolean defaultAllReaders, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.facilityCode = facilityCode;
        this.bitsShift = bitsShift;
        this.cardLength = cardLength;
        this.oddBitsLength = oddBitsLength;
        this.evenBitsLength = evenBitsLength;
        this.facilityCodeLength = facilityCodeLength;
        this.facilityCodeStart = facilityCodeStart;
        this.cardNumberLength = cardNumberLength;
        this.cardNumberStart = cardNumberStart;
        this.defaultAllReaders = defaultAllReaders;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public CardFormat(String name, Long facilityCode, Long bitsShift, Long cardLength, Long oddBitsLength, Long evenBitsLength, Long facilityCodeLength, Long facilityCodeStart, Long cardNumberLength, Long cardNumberStart, Boolean defaultAllReaders) {
        this.name = name;
        this.facilityCode = facilityCode;
        this.bitsShift = bitsShift;
        this.cardLength = cardLength;
        this.oddBitsLength = oddBitsLength;
        this.evenBitsLength = evenBitsLength;
        this.facilityCodeLength = facilityCodeLength;
        this.facilityCodeStart = facilityCodeStart;
        this.cardNumberLength = cardNumberLength;
        this.cardNumberStart = cardNumberStart;
        this.defaultAllReaders = defaultAllReaders;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}