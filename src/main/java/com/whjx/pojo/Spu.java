package com.whjx.pojo;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@SolrDocument(collection = "collection1")
public class Spu {
    @Id
    @Field
    private Integer id;
    @Field("spu_title")
    private String spu_title;
    @Field("spu_state")
    private Integer spu_state;
    @Field("spu_addtime")
    private Date spu_addtime;
    @Field("spu_sc")
    private Integer spu_sc;
    @Field("spu_describe")
    private String spu_describe;
    @Field("spu_specification")
    private String spu_specification;
    @Field("spu_recommend")
    private Integer spu_recommend;
    @Field("spu_img_url")
    private String spu_img_url;
    @Field("spu_price")
    private BigDecimal spu_price;
    private List<Img> imgs;
}
