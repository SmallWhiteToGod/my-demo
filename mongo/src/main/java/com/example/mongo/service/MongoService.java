package com.example.mongo.service;

import com.example.mongo.data.MongoData;

/**
 * @Author: 苏博
 * @Date: 2021/6/3 19:04
 * @Description:
 */
public interface MongoService {


    /**
     * 新增
     * @param data
     */
    void save(MongoData data);

    /**
     * 查询
     */
}
