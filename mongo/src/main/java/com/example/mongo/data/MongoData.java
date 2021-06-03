package com.example.mongo.data;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: 苏博
 * @Date: 2021/6/3 18:59
 * @Description:
 */
@Data
public class MongoData {

    /** 用户Id */
    private Long userId;

    /** 页面Id */
    private Integer pageId;

    /** 名称 */
    private String name;

    /** 内容 */
    private String detail;

    /** 创建时间 */
    private LocalDateTime createTime;
}
