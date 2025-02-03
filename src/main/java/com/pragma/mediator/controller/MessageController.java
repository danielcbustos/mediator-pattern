package com.pragma.mediator.controller;

import com.pragma.mediator.dto.Message;
import com.pragma.mediator.mediator.Mediator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/mediator")
public class MessageController {

    private final Mediator mediator;

    @PostMapping("/send/message")
    public String sendMessage(@RequestBody Message message) {
        Object msg = message.getContent();
        mediator.sendMessage(msg);
        return "Mensaje enviado: " + msg;
    }
}