package com.p31prime.reactiveScratch;

import com.p31prime.reactiveScratch.model.RequestType2;
import com.p31prime.reactiveScratch.model.ResponseType2;
import reactor.core.publisher.Mono;

@APRouteComponent
public class ExampleRoute2 implements APRoute<RequestType2, ResponseType2> {


    @Override
    public String getName() {
        return "RedPanda";
    }

    @Override
    public Mono<ResponseType2> execute(RequestType2 request) {
        return null;
    }


}

