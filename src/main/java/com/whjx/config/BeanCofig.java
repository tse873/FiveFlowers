package com.whjx.config;

import org.apache.solr.client.solrj.SolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;

@Configuration
public class BeanCofig {

    @Autowired
    private SolrClient solrClient;

    @Bean("solrTemplate")
    public SolrTemplate goodsTemplate(){
        return new SolrTemplate(solrClient);
    }
}
