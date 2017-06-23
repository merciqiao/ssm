package com.elin4it.ssm.pojo;

import java.math.BigDecimal;

public class DataVo {


    private BigDecimal[] nums;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal[] getNums() {
        return nums;
    }

    public void setNums(BigDecimal[] nums) {
        this.nums = nums;
    }

}