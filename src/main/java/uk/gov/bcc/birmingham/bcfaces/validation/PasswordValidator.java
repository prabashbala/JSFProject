package uk.gov.bcc.birmingham.bcfaces.validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("passwordValidator")
public class PasswordValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent comp, Object values)
			throws ValidatorException {
		// TODO Auto-generated method stub

		String password = (String) values;

		if (!password.equalsIgnoreCase("8080")) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"password does not match", null);
			context.addMessage(comp.getClientId(context), msg);
			throw new ValidatorException(msg);
		}

	}

}
