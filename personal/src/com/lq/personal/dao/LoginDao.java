package com.lq.personal.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lq.personal.base.BaseDao;
import com.lq.personal.entity.User;

public class LoginDao extends BaseDao{
	//根据username获取User
    public List<User> getUser(String username){
    	String sql = "select * from lq_user where username=:username";
    	Map<String,Object> params = new HashMap<String, Object>();
    	params.put("username", username);
    	List<User> li = query(sql, params, User.class);
    	return li;
    }
    
}
