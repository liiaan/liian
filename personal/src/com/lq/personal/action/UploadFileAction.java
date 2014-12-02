package com.lq.personal.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	 //注意，file并不是指前端jsp上传过来的文件本身，而是文件上传过来存放在临时文件夹下面的文件
    private File file;
    
    //提交过来的file的名字
    private String fileFileName;
    
    //提交过来的file的MIME类型
    private String fileContentType;

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
    
    
	public String execute() throws Exception {  
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
        return "success";  
    }  

}
