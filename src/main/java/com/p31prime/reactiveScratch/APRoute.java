package com.p31prime.reactiveScratch;

import reactor.core.publisher.Mono;

public interface APRoute<T,S> {
    public String getName();
    public Mono<S> execute(T request);

}
