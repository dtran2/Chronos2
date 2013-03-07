package edu.ycp.cs320.chronos.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.TextBoxBase;

public class ChronosView extends composite {
	private Button signupButton;
	private TextBox userNamesignup;
	private PasswordTextBox passwordsignup;
	private TextBox emailsignup;
	
	// Create signUp panel
	final LayoutPanel signUpPanel = new LayoutPanel();
	initWidget(signUpPanel);
	signUpPanel.setSize("590px", "415px");
	
	// Location of userName text box
		userNamesignup = new TextBox();
		signUpPanel.add(userNamesignup);
		signUpPanel.setWidgetLeftWidth(userNamesignup, 177.0, Unit.PX, 170.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(userNamesignup, 238.0, Unit.PX, 33.0, Unit.PX);
		userNametext = userNamesignup.getText();
			
	// Location of password text box
		passwordsignup = new PasswordTextBox();
		signUpPanel.add(passwordsignup);
		passwordtext = passwordsignup.getText();
		
	// Location of email text box
		emailsignup = new TextBox();
		signUpPanel.add(emailsignup);
		signUpPanel.setWidgetLeftWidth(emailsignup, 202.0, Unit.PX, 125.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(emailsignup, 277.0, Unit.PX, 33.0, Unit.PX);
		emailtext = emailsignup.getText();
			
	// Location of Sign-Up button
		signupButtonsignup = new Button();
		signUpPanel.add(signupButton);
		signUpPanel.setWidgetLeftWidth(signupButton, 223.0, Unit.PX, 79.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(signupButton, 316.0, Unit.PX, 33.0, Unit.PX);
			// Sign up button 
				signupButtonsignup.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event) {
						// TODO: call an RPC method
						
						// createAccount(userNametext,passwordtext,emailtext);
						IDatabase database = Database.getDatabase();
						database.createAccount(userNametext, passwordtext, emailtext);
					}
				});	
				
}
