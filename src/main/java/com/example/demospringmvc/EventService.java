package com.example.demospringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    public List<Event> getEvents(){
        Event event1 = Event.builder()
                .name("스프링 웹 엠브이씨 스터디1 차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019,1,10,10,0))
                .endDateTime(LocalDateTime.of(2019,1,10,12,0))
                .build();

        Event event2 = Event.builder()
                .name("스프링 웹 엠브이씨 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019,1,15,10,0))
                .endDateTime(LocalDateTime.of(2019,1,22,12,0))
                .build();
        List<Event> list = new ArrayList<>();
        list.add(event1);
        list.add(event2);
        return list;
    }
}
