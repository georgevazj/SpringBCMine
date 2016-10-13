package com.bc.mine.controller;

import com.bc.mine.model.transactions.Interval;
import com.bc.mine.model.transactions.IntervalMessage;
import com.bc.mine.model.transactions.Transaction;
import com.bc.mine.model.transactions.TransactionMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by jorge on 11/10/2016.
 */

@Controller
public class TransactionController {

    @MessageMapping("/transaction")
    @SendTo("/topic/transactions")
    private Transaction transaction(TransactionMessage message) throws Exception{
        return new Transaction(message.getConcept(),message.getValue());
    }

    @MessageMapping("/interval")
    @SendTo("/topic/transactions")
    private Interval interval(IntervalMessage message) throws Exception{
        return new Interval(message.getConcept() + ": " + message.getInterval());
    }

}
