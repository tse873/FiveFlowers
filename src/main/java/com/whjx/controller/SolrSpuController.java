package com.whjx.controller;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class SolrSpuController {
    @Value("${spring.data.solr.host}")
    private String url;

    @CrossOrigin
    @GetMapping("/search/{q}")
    public QueryResponse findAll(@PathVariable("q") String queryString) throws Exception {
        HttpSolrServer server = new HttpSolrServer(url);
        /*queryString = new String(queryString.getBytes("utf-8"), "utf-8");
        SolrInputDocument document = new SolrInputDocument();
        document.addField("id",1);
        document.addField("uname",queryString);
        document.addField("dt_type",queryString);
        document.addField("kc_content",queryString);
        server.add(document);
        server.commit();*/
        SolrQuery query = new SolrQuery();
        query.set("q", "spu_title:" + queryString + "*");
        query.set("q1", "spu_describe:" + queryString + "*");
        query.set("q2", "sku_title:" + queryString + "*");
        query.set("df", "item_keywords");
        QueryResponse response1 = server.query(query);
        if (response1.getResults().getNumFound() != 0) {
            return response1;
        } else {
            return null;
        }
    }
}