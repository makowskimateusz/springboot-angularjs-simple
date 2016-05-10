package com.example;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class MeetingController {

    @RequestMapping(value = "/meeting", method = RequestMethod.POST)
    public @ResponseBody Meeting addMeeting(@RequestBody Meeting meeting){

        System.out.println(meeting.getDate() + ", " + meeting.getDescription());
        return meeting;

    }

    @RequestMapping(value = "/meetings",  method = RequestMethod.GET)
    public @ResponseBody List<Meeting> list(){

            MeetingGenerator generator = new MeetingGenerator();

            return  generator.getMeetingList();

    }

    //@CrossOrigin(origins = "http://localhost:8081/")
    @RequestMapping(value = "/test")
    public void sendingRequest(){

        String url = "http://rest-service.guides.spring.io/greeting";

        RestTemplate restTemplate = new RestTemplate();

        System.out.println(restTemplate.getForObject(url, String.class));
    }
}

