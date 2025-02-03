package com.pragma.mediator.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TextHandler implements Handler {

    @Override
    public void handleMessage(Object message) {
        if (message instanceof String) {
            log.info("Manejando mensaje de texto: {}", message);
        }
    }
}