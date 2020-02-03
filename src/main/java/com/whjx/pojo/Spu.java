package com.whjx.pojo;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;
import java.util.Date;
import java.util.List;

@Data
@SolrDocument(collection = "collection1")
public class Spu {
    @Id
    @Field
    private Integer id;
    @Field("spu_title")
    private String spuTitle;
    @Field("spu_state")
    private Integer spuState;
    @Field("spu_addtime")
    private Date spuAddtime;
    @Field("spu_sc")
    private Integer spuSc;
    @Field("spu_describe")
    private String spuDescribe;
    @Field("spu_specification")
    private String spuSpecification;
    @Field("spu_recommend")
    private Integer spuRecommend;
    @Field("spu_img_url")
    private String spuImgUrl;
    @Field("spu_price")
    private Double spuPrice;
    @Field("spu_inventory")
    private Integer spuInventory;
    private List<Img> imgs;
    private Sku sku;
    private Parameter parameter;
}