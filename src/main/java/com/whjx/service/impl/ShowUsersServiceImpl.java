package com.whjx.service.impl;

import com.whjx.dao.ShowUsersMapper;
import com.whjx.pojo.UserInfo;
import com.whjx.service.ShowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("ShowUsersServiceImpl")
public class ShowUsersServiceImpl implements ShowUserService {
    @Autowired
    private ShowUsersMapper showUsersMapper;

    @Override
    public List<UserInfo> showUser() {
        return showUsersMapper.showUsers();
    }
}
