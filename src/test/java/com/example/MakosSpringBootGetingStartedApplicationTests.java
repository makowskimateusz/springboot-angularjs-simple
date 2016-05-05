package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Boot.class)
@WebAppConfiguration
public class MakosSpringBootGetingStartedApplicationTests {

    private MockMvc mock;


//    @Before
//    public void seetingUpMockMvcBuilder(){
//
//        mock = MockMvcBuilders.standaloneSetup(new MeetingController()).build();
//
//
//    }


//	@Test
//	public void contextLoads() throws Exception{
//
//        Meeting meetingExpected = new Meeting("opis", "dzsiaj");
//
//
//        mock.perform(MockMvcRequestBuilders.get("/add").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//                //.andExpect(content().string(equalTo(meetingExpected.getDescription())));
//
//	}

    @Test
    public void testJson() {


    }

}
