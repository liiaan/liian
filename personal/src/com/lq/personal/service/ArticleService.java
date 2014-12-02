package com.lq.personal.service;

import java.util.List;

import com.lq.personal.dao.ArticleDao;
import com.lq.personal.entity.Article;
import com.lq.personal.entity.Comment;
import com.lq.personal.entity.User;

public class ArticleService {
    private ArticleDao articleDao;

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	
	
	public void insertArticle(Article article){
		articleDao.insertArticle(article);
	}
	public List<Article> findReJoke(int id){
		List<Article> li = articleDao.findUserJoke(id);
		return li;
	}
	public void submitComment(String comment,int cuid,int carid,String comuser){
		articleDao.submitComenet(comment, cuid, carid,comuser);
	}
	public List<Comment> listUserComment(int carid){
		List<Comment> li = articleDao.listUserComment(carid);
		return li;
	}
	public List<User> findUserById(int id){
		List<User> li = articleDao.findUserById(id);
		return li;
	}
}
