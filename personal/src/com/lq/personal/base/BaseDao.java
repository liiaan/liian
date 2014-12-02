package com.lq.personal.base;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


public class BaseDao {
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
     

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(
			NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	//for search
	public <T> List<T> query(String sql, Map<String, ?> paramMap, Class<T> mappedClass){
		return getNamedParameterJdbcTemplate().query(sql, paramMap,BeanPropertyRowMapper.newInstance(mappedClass));
	}
	//for  insert  update  delete
	 public int update(String sql, Map<String, ?> paramMap) throws DataAccessException {
	    return getNamedParameterJdbcTemplate().update(sql, paramMap);
	 }
	@SuppressWarnings("deprecation")
	public int queryForInt(String sql,Map<String,?> paramMap){
		return getNamedParameterJdbcTemplate().queryForInt(sql, paramMap);
	}

	

	
	
	

}
