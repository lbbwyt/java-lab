package com.example.pagehelper.entity.req;

import lombok.Data;

@Data
public class UserQueryReq {
    private Integer pageNo;
    private Integer pageSize;
}
