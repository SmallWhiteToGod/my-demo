package com.example.mongo;

import com.example.mongo.data.MongoData;
import com.example.mongo.service.MongoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest(classes = MongoApplication.class)
//webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoApplicationTests {

    @Autowired
    private MongoService mongoService;

    @Test
    public void contextLoads() {
        System.out.println("hello test");
    }


    @Test
    public void save() {
        MongoData date = new MongoData();
        date.setName("test1");
        date.setPageId(1);
        date.setDetail("test1test1test1");
        date.setUserId(1L);
        mongoService.save(date);
    }


}
