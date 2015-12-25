package com.gaurav.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class LogoutAction {

	public String execute(){
		
		System.out.println("LogoutAction's logout is called");
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("USER");
		return "success";
	}

}
