package com.example.pagehelper.entity.common;


import lombok.Data;

import java.util.Objects;

@Data
public class PageResult extends Result{
    private long total;
    private long pageNo;
    private long pageSize;

    public PageResult() {
        this.setCode(CommonConstant.SC_OK_200);
        this.setMessage(CommonConstant.SC_OK_200_MSG);
    }

    public PageResult(Result result) {
        this();
        if (Objects.nonNull(result)) {
            setCode(result.getCode());
            setMessage(result.getMessage());
        }
    }

}
