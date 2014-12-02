package com.lq.personal.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lq.personal.base.BaseDao;
import com.lq.personal.entity.Article;
import com.lq.personal.entity.Comment;
import com.lq.personal.entity.User;

public class ArticleDao extends BaseDao{
    
	
	//插入新的笑话
	public void insertArticle(Article article){
		String sql = "insert into article "
				+ "(arid,arcontent,arcreatetime,arupdatetime,ardeltime,deleteflag,arpic) "
				+ "values(:arid,:arcontent,:arcreatetime,:arupdatetime,:ardeltime,:deleteflag,:arpic)";
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String time = sf.format(date);
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("arid",article.getArid());
		params.put("arcontent", article.getArcontent());
		params.put("arcreatetime",time);
		params.put("arupdatetime", article.getUpdatetime());
		params.put("ardeltime", article.getArdeltime());
		params.put("deleteflag", article.getDeleteflag());
		params.put("arpic", article.getArpic());
		update(sql, params);
	}
	//查找该用户的作品
	public List<Article> findUserJoke(int id){
		String sql = "select a.arcontent,a.arcreatetime,a.arpic,a.aid,a.ardeltime,a.good,u.userpic,u.username "
				+ "from lq_user u,article a where a.arid=u.id and arid=:id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		List<Article> li = query(sql, params, Article.class);
		return li;
	}
	//把评论存入表
	public void submitComenet(String comment,int cuid,int carid,String comuser){
		String sql = "insert into comment (carid,cuid,comment,ccreatetime,comuser) values(:carid,:cuid,:comment,:ccreatetime,:comuser)";
		Map<String,Object> params = new HashMap<String, Object>();
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String createtime  = format.format(date);
		params.put("carid", carid);
		params.put("cuid", cuid);
		params.put("comment", comment);
		params.put("ccreatetime",createtime);
		params.put("comuser", comuser);
		update(sql, params);
	}
	//遍历一个笑话的所有评论
	public List<Comment> listUserComment(int carid){
		String sql = "select * from comment where carid=:carid";
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("carid", carid);
		List<Comment> li = query(sql, params, Comment.class);
		return li;
	}
	//根据id查找用户名
	public List<User> findUserById(int id){
		String sql = "select username from lq_user where id=:id";
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("id", id);
		List<User> username = query(sql, params, User.class);
		return username;
	}
	
}
