package com.p31prime.reactiveScratch;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RouteService {

    List<APRoute> registeredRoutes;

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReady(ApplicationReadyEvent event) {
        Map<String,APRoute> map = event.getApplicationContext().getBeansOfType(APRoute.class);
        registeredRoutes = map.values().stream().toList();

        registeredRoutes.stream().forEach( s -> System.out.println("We have the route: " + s.getName()));
    }

    public List<APRoute> getRoutes() {
        return registeredRoutes;
    }

}


