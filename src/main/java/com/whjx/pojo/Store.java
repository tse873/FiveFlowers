package com.whjx.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class Store {
    private String storeName;
    private String storeLogo;
    private Date storeCreattie;
    private String storeIntroduction;
    private String storeAddress;
    private String storePhone;
}