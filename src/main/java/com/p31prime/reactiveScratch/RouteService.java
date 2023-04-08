package com.p31prime.reactiveScratch;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RouteService {



    @EventListener(ApplicationReadyEvent.class)
    public void applicationReady(ApplicationReadyEvent event) {
        Map<String,Object> map = event.getApplicationContext().getBeansWithAnnotation(APRoute.class);

        for (String keys : map.keySet())
        {
            System.out.println(keys);
        }
    }


}


