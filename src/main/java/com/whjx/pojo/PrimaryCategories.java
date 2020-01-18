package com.whjx.pojo;

import lombok.Data;

@Data
public class PrimaryCategories {
    private Integer pcId;
    private String pcName;
    private String pcImg;
    private String pcIcon;
    private SecondCategories sc;
}
