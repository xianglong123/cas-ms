package com.cas.bean;

import java.util.Date;

/**
 * @author xiang_long
 * @version 1.0
 * @date 2021/7/7 2:42 下午
 * @desc
 */
public class Goods {

    private String id;

    private String gsName;

    private Integer gsCount;

    private Integer surplus;

    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGsName() {
        return gsName;
    }

    public void setGsName(String gsName) {
        this.gsName = gsName;
    }

    public Integer getGsCount() {
        return gsCount;
    }

    public void setGsCount(Integer gsCount) {
        this.gsCount = gsCount;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
