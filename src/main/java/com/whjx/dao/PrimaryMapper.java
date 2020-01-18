package com.whjx.dao;

import com.whjx.pojo.SecondCategories;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrimaryMapper {
    List<SecondCategories> selectPrimaryShow(@Param("pi") int scPc);
}
