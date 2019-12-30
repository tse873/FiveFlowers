package com.whjx.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Kill implements Serializable {
    private Integer killId;

    private Integer killCount;

    private Date killStart;

    private Date killEnd;

    private Spu spu;

    private BigDecimal killPrice;

    private String killIsactive;

    private Integer canKill;

    private String spuImgUrl;

    private Integer killSpuid;
    private static final long serialVersionUID = 1L;

}