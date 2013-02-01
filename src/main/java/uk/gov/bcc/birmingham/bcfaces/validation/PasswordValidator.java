package uk.gov.bcc.birmingham.bcfaces.validation;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@RequestScoped
@FacesValidator("passwordValidator")
public class PasswordValidator implements Validator {

	/**This is to vaidate the password against the predefined value which is 8080**/
	@Override
	public void validate(FacesContext context, UIComponent comp, Object values)
			throws ValidatorException {
		// TODO Auto-generated method stub

		String password = (String) values;

		if (!password.equalsIgnoreCase("8080")) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"login.password.notmatch", "does not match");
			context.addMessage(comp.getClientId(context), msg);
			throw new ValidatorException(msg);
		}

	}

}
