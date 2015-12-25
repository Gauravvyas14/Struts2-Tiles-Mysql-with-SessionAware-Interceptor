package com.gaurav.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.gaurav.model.User;
import com.gaurav.service.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>, SessionAware {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	Map<String, Object> session = ActionContext.getContext().getSession();
	

	public String execute()
	{
		
		
		LoginService service=new LoginService();
		if(service.validateLogin(user)) {
			System.out.println("execute is called");
			session.put("USER", user);
			return user.getType();
		}
		else {
			this.addFieldError("loginid", getText("app.invalid"));
			return LOGIN;
		}
	}
	
	public String logout() throws Exception {
		System.out.println("LoginAction's logout is called");
		session.remove("USER");
		return SUCCESS;
		
	}
	
	public void validate() {
		if ( (user.getLoginid() == null ) || (user.getLoginid().length() == 0) ) {
			this.addFieldError("loginid", getText("app.loginid.blank"));
		}
		if ( (user.getPassword() == null ) || (user.getPassword().length() == 0) ) {
			this.addFieldError("password", getText("app.password.blank"));
		}
		
	}

	public User getModel() {
		
		return user;
	}

	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
		
}
