package com.sm.serviceimpl;

import com.sm.mapper.UserMapper;
import com.sm.po.User;
import com.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Mistra.WR on 2017/11/10/010.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapperDao;

    public int insertSelective(User user) {
        return userMapperDao.insertSelective(user);
    }

}
