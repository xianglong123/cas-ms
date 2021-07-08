package com.cas.service;

import com.cas.bean.Goods;
import com.cas.dao.GoodsMapper;
import com.cas.util.RedisUtil;
import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/7 2:36 下午
 * @desc 预热:首先在秒杀前先进行预热，将商品的库存加载到redis上
 */
@Component
public class WarmService {

    private static final Logger log = LoggerFactory.getLogger(WarmService.class);

    private static final String KC = "GOODS_KC_";

    @Autowired
    private RedisUtil redisUtil;

    @Resource
    private GoodsMapper goodsMapper;

    @PostConstruct
    public void warm() {
        String id = "100";
        log.info("数据预热开始，id = 【{}】", id);
        Goods goods = goodsMapper.queryById(id);
        redisUtil.set(KC + id, goods.getSurplus());
    }

}
