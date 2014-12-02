package com.lq.personal.entity;

public class Article extends User{
    private int aid;
    private int arid;
    private String arcontent;
    private String arcreatetime;
    private String arupdatetime;
    private String ardeltime;
    private int deleteflag;
    private int good;
    private String arpic;
    
	public String getArcreatetime() {
		return arcreatetime;
	}
	public void setArcreatetime(String arcreatetime) {
		this.arcreatetime = arcreatetime;
	}
	public String getArupdatetime() {
		return arupdatetime;
	}
	public void setArupdatetime(String arupdatetime) {
		this.arupdatetime = arupdatetime;
	}
	public String getArdeltime() {
		return ardeltime;
	}
	public void setArdeltime(String ardeltime) {
		this.ardeltime = ardeltime;
	}
	public String getArpic() {
		return arpic;
	}
	public void setArpic(String arpic) {
		this.arpic = arpic;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getArid() {
		return arid;
	}
	public void setArid(int arid) {
		this.arid = arid;
	}
	public String getArcontent() {
		return arcontent;
	}
	public void setArcontent(String arcontent) {
		this.arcontent = arcontent;
	}

	public int getDeleteflag() {
		return deleteflag;
	}
	public void setDeleteflag(int deleteflag) {
		this.deleteflag = deleteflag;
	}
	@Override
	public String toString() {
		return "Article [aid=" + aid + ", arid=" + arid + ", arcontent="
				+ arcontent + ", arcreatetime=" + arcreatetime
				+ ", arupdatetime=" + arupdatetime + ", ardeltime=" + ardeltime
				+ ", deleteflag=" + deleteflag + ", good=" + good + ", arpic="
				+ arpic + "]";
	}
    
}
