package com.bc.mine.controller;

import com.bc.mine.model.transactions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.TimerTask;

/**
 * Created by jorge on 11/10/2016.
 */

@Controller
public class TransactionController {

    private String blockId = "";
    private Block block = new Block();

    @Autowired
    private SimpMessagingTemplate template;

    @MessageMapping("/transaction")
    @SendTo("/topic/transactions")
    private Transaction transaction(TransactionMessage message) throws Exception{
        if (this.blockId.isEmpty()){
            SecureRandom secureRandom = new SecureRandom();
            this.blockId = new BigInteger(130,secureRandom).toString(32);
            block.setId(this.blockId);
        }
        Transaction transaction = new Transaction();
        transaction.setBlockId(this.blockId);
        transaction.setConcept(message.getConcept());
        transaction.setValue(message.getValue());
        block.getTransactions().add(transaction);
        return transaction;
    }

    @MessageMapping("/interval")
    @SendTo("/topic/transactions")
    private Interval interval(IntervalMessage message) throws Exception{
        return new Interval(message.getConcept() + ": " + message.getInterval());
    }
}
