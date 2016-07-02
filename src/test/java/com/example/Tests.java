package com.example;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Boot.class)
@WebAppConfiguration
public class Tests {

    private MockMvc mock;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setingUpMockMvcBuilder(){

//        test jednostkowy, bo odwolujemy się bezposrednio do controllera
//        aby moglbyć to test jednostkowy trzebaby bylo zrobic konekts do testow
//        i wrzucic obiekt meetingControllera jako obiekt autowirowany
//        wtedy autowriowałby się takze ten obiekt ktory jest meetinggeneratorem
//        mock = MockMvcBuilders.standaloneSetup(new MeetingController()).build();
//        test ingegracyjny, bo podnosimy kontekst aplikacji bez sprawdzania poszczegolnych metod
          mock = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    }

    @Test
    public void testAutowiredElement()  throws Exception {

        mock.perform(get("/meetings")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

}
