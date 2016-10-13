package com.bc.mine.model.transactions;

/**
 * Created by jorge on 11/10/2016.
 */
public class Transaction {

    private String blockId;
    private String concept;
    private int value;

    public Transaction() {
    }

    public Transaction(String blockId, String concept, int value) {
        this.blockId = blockId;
        this.concept = concept;
        this.value = value;
    }


    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }
}
