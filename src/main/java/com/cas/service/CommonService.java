package com.cas.service;

import com.cas.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/8 10:25 上午
 * @desc
 */
@Service
public class CommonService {

    private static final Logger log = LoggerFactory.getLogger(CommonService.class);

    @Resource
    private RedisUtil redisUtil;

    /**
     * 减库存
     */
    public boolean querySurplus(String key) {
        Integer o = Integer.valueOf(redisUtil.get(key));
        if (o <= 0) {
            log.info("库存已抢完");
            return false;
        }

        Long decr = redisUtil.decr(key);
        log.info("获取[{}]", decr);
        return decr >= 0;
    }


}
