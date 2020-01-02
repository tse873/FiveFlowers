package com.whjx.dao;

import com.whjx.pojo.Spu;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("ssm")
public interface SolrSpuMapper {
    List<Spu> find();
}
