package uk.gov.bcc.birmingham.bcfaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class AuthenticationBean {

	/**
	 * 
	 */
	private String name;
	private String password;
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String processLogin(){
		System.out.println("Hi world");
		return "welcomePage";
	}
	
	public void validatePassword(FacesContext context, UIComponent comp, Object values)
			throws ValidatorException {

		String password = (String) values;

		if (!password.equalsIgnoreCase("8080")) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"login.password.notmatch", "does not match");
			context.addMessage(comp.getClientId(context), msg);
			throw new ValidatorException(msg);
		}

	}
	
	

}
