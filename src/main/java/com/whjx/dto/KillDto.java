package com.whjx.dto;

import lombok.Data;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class KillDto implements Serializable {

    @NotNull
    private String openId;
    private Integer killId;
}
