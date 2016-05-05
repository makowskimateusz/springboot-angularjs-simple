package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mat on 05.05.16.
 */
public class MeetingGenerator {



    private List<Meeting> meetingList = new ArrayList<>();


    public List<Meeting> getMeetingList() {
        return meetingList;
    }

    public MeetingGenerator() {

        meetingList.add(new Meeting("jakies tam zadanie", "jakas tam data"));
        meetingList.add(new Meeting("jakies tam zadanie2", "jakas tam data2"));
        meetingList.add(new Meeting("jakies tam zadanie3", "jakas tam data3"));
        meetingList.add(new Meeting("jakies tam zadanie4", "jakas tam data4"));

    }
}
