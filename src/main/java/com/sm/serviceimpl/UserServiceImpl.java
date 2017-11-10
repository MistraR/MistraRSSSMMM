package com.sm.serviceimpl;

import com.sm.dao.UserMapper;
import com.sm.po.User;
import com.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Mistra.WR on 2017/11/10/010.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapperDao;

    public int insertSelective(User user) {
        return userMapperDao.insert(user);
    }

}
