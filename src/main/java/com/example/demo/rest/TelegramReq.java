package com.example.demo.rest;

import com.example.demo.client.TelegramDelivery;
import com.example.demo.contacts.Conversation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelegramReq {

    @Autowired
    TelegramDelivery telegramDelivery;

    @GetMapping("/hi/{inputMessage}")
    public String hello(@PathVariable("inputMessage") String inputMessage)
            throws Exception {
        telegramDelivery.sendMessage(
                new Conversation("185790419", "", "manual"),
                inputMessage);
        return "hi";
    }


}