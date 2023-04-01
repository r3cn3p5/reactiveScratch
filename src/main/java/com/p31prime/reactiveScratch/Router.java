package com.p31prime.reactiveScratch;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

public class Router {

    @Bean
    public RouterFunction<ServerResponse> routes(Handler handler) {
        return route(GET("/hello"),(handler::get)
        );
    }
}

