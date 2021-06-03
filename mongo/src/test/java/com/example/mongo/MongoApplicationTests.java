package com.example.mongo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@SpringBootTest(classes = MongoApplication.class)
//webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("hello test");
    }

}
