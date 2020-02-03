package com.whjx.dao;

import com.whjx.pojo.UserInfo;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ShowUsersMapper {
    List<UserInfo> showUsers();
}
