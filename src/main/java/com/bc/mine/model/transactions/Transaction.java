package com.bc.mine.model.transactions;

/**
 * Created by jorge on 11/10/2016.
 */
public class Transaction {

    private String content;

    public Transaction() {
    }

    public Transaction(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
