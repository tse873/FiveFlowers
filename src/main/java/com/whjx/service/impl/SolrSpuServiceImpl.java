package com.whjx.service.impl;

import com.whjx.dao.SolrSpuMapper;
import com.whjx.pojo.Spu;
import com.whjx.service.SolrSpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("sss")
public class SolrSpuServiceImpl implements SolrSpuService {
    @Autowired
    private SolrSpuMapper ssm;
    /*@Autowired
    private SolrTemplate solrTemplate;

    @Override
    public List<Spu> commitAll() {
        List<Spu> spuList = ssm.find();
        solrTemplate.saveBeans("collection1",spuList);
        solrTemplate.commit("collection1");
        return spuList;
    }*/
}
