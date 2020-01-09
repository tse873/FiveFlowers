package com.whjx.pojo;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.math.BigDecimal;

@Data
@SolrDocument(collection = "collection1")
public class Sku {
    @Id
    @Field
    private Integer id;
    @Field("sku_spuid")
    private Integer skuSpuid;
    @Field("sku_title")
    private String skuTitle;
    @Field("sku_price")
    private BigDecimal skuPrice;
    @Field("sku_describe")
    private String skuDescribe;
    @Field("sku_inventory")
    private Integer skuInventory;
    @Field("sku_img")
    private String skuImg;
}
