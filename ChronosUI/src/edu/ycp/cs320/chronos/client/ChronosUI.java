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
	@SuppressWarnings("deprecation")
	@Override
	
	public void onModuleLoad() {
		LayoutPanel layoutPanel = new LayoutPanel();
		
		
		// Location of Login Button
		loginButton = new Button("Login!");
		layoutPanel.add(loginButton);
		layoutPanel.setWidgetLeftWidth(loginButton, 223.0, Unit.PX, 79.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(loginButton, 316.0, Unit.PX, 33.0, Unit.PX);
			
			
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
		layoutPanel.add(userName);
		layoutPanel.setWidgetLeftWidth(userName, 177.0, Unit.PX, 170.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(userName, 238.0, Unit.PX, 33.0, Unit.PX);
			//userName.addKeyboardListener(new KeyboardListener() { 
				// public void KeyboardListenter(String s) {
			// }
			// });
		
		
		// Location of password textbox
		password = new PasswordTextBox();
		password.setTextAlignment(TextBoxBase.ALIGN_CENTER);
		password.setText("Password");
		layoutPanel.add(password);
		layoutPanel.setWidgetLeftWidth(password, 202.0, Unit.PX, 125.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(password, 277.0, Unit.PX, 33.0, Unit.PX);
			
		// Handle password input
			//userName.addKeyboardListener(new KeyboardListener() { 
			// public void KeyboardListenter(String s) {
			// }
			// });
		
		// Location of sign-up Button
		signupButton = new Button("Sign Up NOW!");
		layoutPanel.add(signupButton);
		layoutPanel.setWidgetLeftWidth(signupButton, 378.0, Unit.PX, 137.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(signupButton, 10.0, Unit.PX, 28.0, Unit.PX);
		
			// Handle is user clicks SignUp Button
			signupButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// navigate to main panel
			}
		});
		
		// TODO Auto-generated method stub
		
	}

	
}
