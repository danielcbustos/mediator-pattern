package com.pragma.mediator.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NumberHandler implements  Handler {

    @Override
    public void handleMessage(Object message) {
        if (message instanceof Integer) {
            log.info("Manejando mensaje de número: {}", message);
        }
    }
}
