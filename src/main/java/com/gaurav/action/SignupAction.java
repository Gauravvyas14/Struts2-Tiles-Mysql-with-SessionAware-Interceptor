package com.gaurav.action;

import com.gaurav.model.User;
import com.gaurav.service.SignupService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SignupAction extends ActionSupport implements ModelDriven<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user=new User();
	
	public String signUp()
	{
		SignupService service=new SignupService();
		
		if(service.validateSignup(user)==true)
		{
			return SUCCESS;
		}
		
		return ERROR;
		
	}
	
	public void validate() {
		if ( (user.getLoginid() == null ) || (user.getLoginid().length() == 0) ) {
			this.addFieldError("loginid", getText("app.loginid.blank"));
		}
		if ( (user.getCnfrm_email() == null ) || (user.getCnfrm_email().length() == 0) ) {
			this.addFieldError("cnfrm_email", getText("app.cnfrm_email.blank"));
		}
		if ( (user.getPassword() == null ) || (user.getPassword().length() == 0) ) {
			this.addFieldError("password", getText("app.password.blank"));
		}
		if ( (user.getName() == null ) || (user.getName().length() == 0) ) {
			this.addFieldError("name", getText("app.name.blank"));
		}
		if(!((user.getLoginid()).equals((user.getCnfrm_email())))){
			this.addFieldError("loginid", getText("app.loginid.mismatch"));
		}
		
		
	}

	public User getModel() {
		
		return user;
	}

}
