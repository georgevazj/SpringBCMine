package com.bc.mine.model.transactions;

/**
 * Created by jorge on 13/10/2016.
 */
public class IntervalMessage {

    private int interval;
    private String concept;

    public IntervalMessage() {
    }

    public IntervalMessage(int interval, String concept) {
        this.interval = interval;
        this.concept = concept;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }
}
