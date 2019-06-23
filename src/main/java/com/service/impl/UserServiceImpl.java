package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public boolean user_Add(User user) {
		int flag=userMapper.insertUser(user);
		if(flag==1) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public List<User> userlist() {
		List<User> list=userMapper.userlist();
		return list;
	}

}
