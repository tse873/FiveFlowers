package com.whjx.controller;

import com.whjx.pojo.Spu;
import com.whjx.service.SolrSpuService;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SolrSpuController {
    @Value("${spring.data.solr.host}")
    private String url;
    @Autowired
    private SolrSpuService sss;

    @CrossOrigin
    @RequestMapping(value = "/commit",method = RequestMethod.GET)
    public List<Spu> commitSpu(Spu spu){
        return sss.commitAll(spu);
    }

    @CrossOrigin
    @GetMapping("/search/{p}")
    public QueryResponse findAll(@PathVariable("p") String queryString) throws Exception {
        HttpSolrServer server = new HttpSolrServer(url);
        queryString = new String(queryString.getBytes("utf-8"), "utf-8");
        SolrQuery query = new SolrQuery();
        query.set("q",  "spu_title:" + "*" + queryString + "*");
        query.set("q1", "spu_describe:" + "*" + queryString + "*");
        query.set("q2", "sku_title:" + "*"  + queryString + "*");
        query.set("q3", "sku_describe:" + "*" + queryString + "*");
        query.set("df", "item_keywords");
        QueryResponse response1 = server.query(query);
        System.out.println(response1);
        if (response1.getResults().getNumFound() != 0) {
            return response1;
        } else {
            return null;
        }
    }
}