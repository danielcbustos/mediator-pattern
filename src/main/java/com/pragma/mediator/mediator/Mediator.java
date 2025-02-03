package com.pragma.mediator.mediator;

import com.pragma.mediator.handler.Handler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class Mediator {

    private final List<Handler> handlers;

    public void sendMessage(Object message) {
        log.info("Enviando mensaje: {}", message);
        handlers.forEach(handler -> handler.handleMessage(message));
    }
}
