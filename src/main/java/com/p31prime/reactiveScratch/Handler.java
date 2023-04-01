package com.p31prime.reactiveScratch;

import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Component
public class Handler {

    public Mono<ServerResponse> get(ServerRequest req) {
        return ServerResponse.ok().body(Mono.just("Stuff"), String.class);
    }

}
