package com.mapper;

import java.util.List;

import com.pojo.User;

public interface UserMapper {
	Integer insertUser(User user);
	List<User> userlist();
}
