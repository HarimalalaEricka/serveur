package com.example.serveur.controller;

import com.example.serveur.model.Message;
import com.example.serveur.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/send")
public class MessageController {

    @PostMapping
    public void receiveEncryptedMessage(@RequestBody String encryptedMessage) {
        System.out.println("Message chiffré reçu : " + encryptedMessage);
    }
}

