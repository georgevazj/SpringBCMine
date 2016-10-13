package com.bc.mine.controller;

import com.bc.mine.model.Greeting;
import com.bc.mine.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by jorge on 10/10/2016.
 */

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception{
        Thread.sleep(1000); //Se simula un pequeño retraso
        return new Greeting("Hello, " + message.getName() + "!");
    }




}
