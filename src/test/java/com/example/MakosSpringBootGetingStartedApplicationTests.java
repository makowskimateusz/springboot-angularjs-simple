package com.example;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Boot.class)
@WebAppConfiguration
public class MakosSpringBootGetingStartedApplicationTests {

    private MockMvc mock;


    @Before
    public void setingUpMockMvcBuilder(){

        mock = MockMvcBuilders.standaloneSetup(new MeetingController()).build();


    }


//	@Test
//	public void contextLoads() throws Exception{
//
//        mock.perform(MockMvcRequestBuilders.get("/add").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//                //.andExpect(content().string(equalTo(meetingExpected.getDescription())));
//
//	}

    @Test
    public void testJson() throws Exception {

        mock.perform(MockMvcRequestBuilders.get("/meeting")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.description", Matchers.is("jakieś tam spotkanie")));

    }

}
