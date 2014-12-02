package com.lq.personal.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONArray;

import com.lq.personal.entity.Article;
import com.lq.personal.entity.Comment;
import com.lq.personal.entity.User;
import com.lq.personal.service.ArticleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ArticleAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArticleService articleService;
	
	private int id;
	
	private String arcontent;
	
	private String arpic;
	
	private List<Article> articles;
	
	private String result;
	
	private File file;
	    
	    //提交过来的file的名字
	private String fileFileName;
	    
	    //提交过来的file的MIME类型
	private String fileContentType;
	
	private int arid;
	
	private String comment;
	
	private List<Comment> commentList;
	
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	public int getArid() {
		return arid;
	}
	public void setArid(int arid) {
		this.arid = arid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	public String getArpic() {
		return arpic;
	}
	public void setArpic(String arpic) {
		this.arpic = arpic;
	}
	public String getArcontent() {
		return arcontent;
	}
	public void setArcontent(String arcontent) {
		this.arcontent = arcontent;
	}
	public ArticleService getArticleService() {
		return articleService;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//插入之后遍历所有笑话
	public String insertUserArticle() throws IOException{
		//上传图片
		String realPath = ServletActionContext.getServletContext().getRealPath("/images");  
        System.out.println(realPath);
        if(file!=null ){  
            File destFile = new File(new File(realPath), fileFileName);//根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。  
            if(!destFile.getParentFile().exists())//判断路径"/images"是否存在  
                destFile.getParentFile().mkdirs();//如果不存在，则创建此路径  
            //将文件保存到硬盘上，因为action运行结束后，临时文件就会自动被删除  
            FileUtils.copyFile(file, destFile);  
            ActionContext.getContext().put("message", "文件上传成功！");  
        }  
        //获取图片地址
        String arpic = "http://localhost:8080/liian/images/"+fileFileName;
        System.out.println(arpic);
		Article article = new Article();
		article.setArid(id);
		article.setArcontent(arcontent);
		article.setArpic(arpic);
		if(!"".equals(arcontent)||arcontent==null){
			articleService.insertArticle(article);
			return "success";
		}
		/*articles = articleService.findReJoke(id);
		JSONArray json = JSONArray.fromObject(articles);
		this.result = json.toString();
    	System.out.println(this.result);*/
		return "fail";
	}
	//查找某一个用户的笑话
	public String findUserArticle(){
		articles = articleService.findReJoke(id);
		return "success";
	}
	//保存评论并返回所有评论
	public String submitComment(){
		List<User> user = articleService.findUserById(id);
		String username = user.get(0).getUsername();
		articleService.submitComment(comment, id, arid,username);
		System.out.println("评论成功");
		commentList = articleService.listUserComment(arid);
		JSONArray array = JSONArray.fromObject(commentList);
		this.result = array.toString();
		System.out.println(result);
		return "success";
	}
}
