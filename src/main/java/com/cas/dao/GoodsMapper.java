package com.cas.dao;

import com.cas.bean.Goods;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/7 4:10 下午
 * @desc
 */
public interface GoodsMapper {

    Goods queryById(String id);

}
