package edu.ycp.cs320.chronos.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.dom.client.Style.Unit;


public class ChronosUI implements EntryPoint{
	private Button loginButton;
	private Button signupButton;
	private TextBox userName;
	private PasswordTextBox password;
	private TextBox userNamesignup;
	private Button signupButtonsignup;
	private PasswordTextBox passwordsignup;
	private TextBox emailsignup;
	@SuppressWarnings("deprecation")
	@Override
	
	public void onModuleLoad() {
		LayoutPanel loginPanel = new LayoutPanel();
		LayoutPanel signUpPanel = new LayoutPanel();
		
		
		// Location of Login Button
		loginButton = new Button("Login!");
		loginPanel.add(loginButton);
		loginPanel.setWidgetLeftWidth(loginButton, 223.0, Unit.PX, 79.0, Unit.PX);
		loginPanel.setWidgetTopHeight(loginButton, 316.0, Unit.PX, 33.0, Unit.PX);
			
			
			// Handle if user clicks button
			loginButton.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					// navigate to main panel
				}
			});
				
		
		// Location of username textbox
		userName = new TextBox();
		userName.setTextAlignment(TextBoxBase.ALIGN_CENTER);
		userName.setText("Enter User Name");
		loginPanel.add(userName);
		loginPanel.setWidgetLeftWidth(userName, 177.0, Unit.PX, 170.0, Unit.PX);
		loginPanel.setWidgetTopHeight(userName, 238.0, Unit.PX, 33.0, Unit.PX);
			//userName.addKeyboardListener(new KeyboardListener() { 
				// public void KeyboardListenter(String s) {
			// }
			// });
		
		
		// Location of password textbox
		password = new PasswordTextBox();
		loginPanel.add(password);
		loginPanel.setWidgetLeftWidth(password, 202.0, Unit.PX, 125.0, Unit.PX);
		loginPanel.setWidgetTopHeight(password, 277.0, Unit.PX, 33.0, Unit.PX);
			
		// Handle password input
			//userName.addKeyboardListener(new KeyboardListener() { 
			// public void KeyboardListenter(String s) {
			// }
			// });
		
		// Location of sign-up Button
		signupButton = new Button("Sign Up NOW!");
		loginPanel.add(signupButton);
		loginPanel.setWidgetLeftWidth(signupButton, 378.0, Unit.PX, 137.0, Unit.PX);
		loginPanel.setWidgetTopHeight(signupButton, 10.0, Unit.PX, 28.0, Unit.PX);
		
			// Handle is user clicks SignUp Button
			signupButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// navigate to main panel
			}
		});
		
		// Create signUp panel
		
		// Location of Sign-Up button
		signupButtonsignup = new Button();
		signUpPanel.add(signupButtonsignup);
		signUpPanel.setWidgetLeftWidth(signupButtonsignup, 223.0, Unit.PX, 79.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(signupButtonsignup, 316.0, Unit.PX, 33.0, Unit.PX);
		
		
		// Location of userName text box
		userNamesignup = new TextBox();
		signUpPanel.add(userNamesignup);
		signUpPanel.setWidgetLeftWidth(userNamesignup, 177.0, Unit.PX, 170.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(userNamesignup, 238.0, Unit.PX, 33.0, Unit.PX);
		
		// Location of password text box
		passwordsignup = new PasswordTextBox();
		signUpPanel.add(passwordsignup);
		
		// Location of email text box
		emailsignup = new TextBox();
		signUpPanel.add(emailsignup);
		signUpPanel.setWidgetLeftWidth(emailsignup, 202.0, Unit.PX, 125.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(emailsignup, 277.0, Unit.PX, 33.0, Unit.PX);
		
		// 
	}
}
