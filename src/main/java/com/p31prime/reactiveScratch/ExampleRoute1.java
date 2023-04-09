package com.p31prime.reactiveScratch;

import com.p31prime.reactiveScratch.model.RequestType1;
import com.p31prime.reactiveScratch.model.ResponseType1;
import reactor.core.publisher.Mono;

@APRouteComponent
public class ExampleRoute1 implements APRoute<RequestType1, ResponseType1> {


    @Override
    public String getName() {
        return "TrashPanda";
    }

    @Override
    public Mono<ResponseType1> execute(RequestType1 request) {
        return null;
    }

}

