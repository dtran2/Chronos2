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

public class LoginView extends Composite {
	private Button loginButton;
	private TextBox userName;
	private PasswordTextBox password;

	public LoginView() {
		final LayoutPanel loginPanel = new LayoutPanel();
		initWidget(loginPanel);
		loginPanel.setSize("590px", "415px");
		
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
		
	}
}
