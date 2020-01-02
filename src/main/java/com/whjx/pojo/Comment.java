package com.whjx.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Comment {
    private Integer commentId;
    private Date commentTime;
    private String commentContext;
    private Integer commentUser;
    private Integer commentShop;
    private Integer commentStatus;
    private String replyContext;
}
