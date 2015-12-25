package com.gaurav.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class StudentAction {
	
	public String execute() {
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		
		String s=(String)session.getAttribute("USER");
		
		if(s!=null&&s.equals("")){
			return "success";
		}
		return "error";
	}

}
