package com.cas.controller;

import com.cas.service.CommonService;
import com.cas.service.WarmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/7 4:32 下午
 * @desc 秒杀场景
 */
@RestController
public class MsController {

    @Resource
    private CommonService commonService;

    @Resource
    private WarmService warmService;

    @PostMapping("/ms")
    public String ms() throws InterruptedException {
        Thread.sleep(1000);
        commonService.querySurplus("GOODS_KC_100");
        return "ok";
    }

    @GetMapping("/warm")
    public String warm(String id) {
        warmService.warm(id);
        return "ok";
    }


}
