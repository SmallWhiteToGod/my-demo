package com.example.mongo.service.impl;

import com.example.mongo.data.MongoData;
import com.example.mongo.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 苏博
 * @Date: 2021/6/3 18:52
 * @Description:
 */
@Service
public class MongoServiceImpl implements MongoService {

    @Resource
    private MongoTemplate mongoTemplate;

    /**
     * 新增
     * @param data
     */
    @Override
    public void save(MongoData data) {
        mongoTemplate.save(data);
    }
}
