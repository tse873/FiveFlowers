package com.whjx.service.impl;

import com.whjx.dao.StandardMapper;
import com.whjx.pojo.Spu;
import com.whjx.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("standards")
public class StandardServiceImpl implements StandardService {
    @Autowired
    private StandardMapper standardm;
    @Override
    public List<Spu> standardById(int id) {
        return standardm.standardById(id);
    }
}
