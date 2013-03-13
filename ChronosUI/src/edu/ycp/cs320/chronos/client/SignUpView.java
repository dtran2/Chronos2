package edu.ycp.cs320.chronos.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ButtonBase;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.TextBoxBase;

import edu.ycp.cs320.chronos.database.Database;
import edu.ycp.cs320.chronos.database.IDatabase;
import edu.ycp.cs320.chronos.database.IPublisher;

public class SignUpView extends Composite {
	private Button signupButton;
	private TextBox userNamesignup;
	private PasswordTextBox passwordsignup;
	private TextBox emailsignup;
	private String emailtext;
	private String userNametext;
	private String passwordtext;
	
	public SignUpView(){
		
		// Create signUp panel
	final LayoutPanel signUpPanel = new LayoutPanel();
	initWidget(signUpPanel);
	signUpPanel.setSize("590px", "415px");
	
	// Location of userName text box
		userNamesignup = new TextBox();
		signUpPanel.add(userNamesignup);
		signUpPanel.setWidgetLeftWidth(userNamesignup, 185.0, Unit.PX, 160.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(userNamesignup, 225.0, Unit.PX, 33.0, Unit.PX);
		userNametext = userNamesignup.getText();
			
	// Location of password text box
		passwordsignup = new PasswordTextBox();
		signUpPanel.add(passwordsignup);
		signUpPanel.setWidgetLeftWidth(passwordsignup, 195.0, Unit.PX, 130.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(passwordsignup, 264.0, Unit.PX, 33.0, Unit.PX);
		passwordtext = passwordsignup.getText();
		
	// Location of email text box
		emailsignup = new TextBox();
		signUpPanel.add(emailsignup);
		signUpPanel.setWidgetLeftWidth(emailsignup, 175.0, Unit.PX, 182.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(emailsignup, 186.0, Unit.PX, 33.0, Unit.PX);
		emailtext = emailsignup.getText();
			
	// Location of Sign-Up button
		signupButton = new Button();
		signUpPanel.add(signupButton);
		signUpPanel.setWidgetLeftWidth(signupButton, 223.0, Unit.PX, 79.0, Unit.PX);
		signUpPanel.setWidgetTopHeight(signupButton, 316.0, Unit.PX, 33.0, Unit.PX);
			// Sign up button 
				signupButton.addClickHandler(new ClickHandler() {
					public void onClick(ClickEvent event) {
						handleSignUpClick();
					}
				});	
		
			
				
		
				
}

	public void eventOccured(Object key, IPublisher publisher, Object hint){
		update();
	}	
	
	public void update(){
			
	}
	
	/**
	 * 
	 * @author cdavis17
	 * Method uses RPC to create Account when
	 * user clicks on the Sign Up Button
	 * 
	 */
	public void handleSignUpClick(){
		RPC.database.getDatabase().createAccount(userNametext, passwordtext, emailtext);
		
		@Override
		public void onSuccess(Boolean result) {
			GWT.log("Successfully placed order!");
			
		}

		@Override
		public void onFailure(Throwable caught) {
			GWT.log("RPC call failed", caught);s
			// FIXME: should display error message in UI
		}
	}
		
}
