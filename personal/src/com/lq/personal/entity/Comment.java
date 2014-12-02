package com.lq.personal.entity;

public class Comment {
    private int cid;
    private int carid;
    private int cuid;
    private String comment;
    private String ccreatetime;
    private String cdeletetime;
    private int cgood;
    private String comuser;
    
    
    
	public String getComuser() {
		return comuser;
	}
	public void setComuser(String comuser) {
		this.comuser = comuser;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public int getCuid() {
		return cuid;
	}
	public void setCuid(int cuid) {
		this.cuid = cuid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCcreatetime() {
		return ccreatetime;
	}
	public void setCcreatetime(String ccreatetime) {
		this.ccreatetime = ccreatetime;
	}
	public String getCdeletetime() {
		return cdeletetime;
	}
	public void setCdeletetime(String cdeletetime) {
		this.cdeletetime = cdeletetime;
	}
	public int getCgood() {
		return cgood;
	}
	public void setCgood(int cgood) {
		this.cgood = cgood;
	}
    
}
