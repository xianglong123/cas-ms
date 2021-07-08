package com.cas.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
* @Description:    redis 操作工具类
* @Author:         Dev.he_lsh
* @CreateDate:     2021/2/23 15:00
*/
@Service
public class RedisUtil {

    @Resource
    protected RedisTemplate<String, Object> cacheStringRedisTemplate;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 设置 String 类型 key-value
     *
     * @param key
     * @param value
     */

    public void setEx(String key, String value, Long timeout) {
        cacheStringRedisTemplate.opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
    }

    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 获取 String 类型 key-value
     *
     * @param key
     * @return
     */
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public void del(String key) {
        cacheStringRedisTemplate.delete(key);
    }

    public Long incr(String key) {
        return cacheStringRedisTemplate.opsForValue().increment(key);
    }

    public Long decr(String key) {
        return redisTemplate.opsForValue().decrement(key);
    }


}