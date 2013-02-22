package edu.ycp.cs320.chronos.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;


public class ChronosUI implements EntryPoint{
	private VerticalPanel VerticalPanel = new VerticalPanel();
	private HorizontalPanel HorizontalPanel = new HorizontalPanel();
	private TextBox pwd = new TextBox();
	private TextBox userID = new TextBox();
	private Button Login = new Button("Login");
	private Button SignUpNow = new Button("SIGN UP NOW!");
	
	@Override
	public void onModuleLoad() {
		
		
		VerticalPanel.add(SignUpNow);
		VerticalPanel.setCellHorizontalAlignment(SignUpNow, HasHorizontalAlignment.ALIGN_RIGHT);
		userID.setTextAlignment(TextBoxBase.ALIGN_CENTER);
		userID.setText("Enter User ID");
		userID.setName("Enter User ID");
		VerticalPanel.add(userID);
		VerticalPanel.setCellHorizontalAlignment(userID, HasHorizontalAlignment.ALIGN_CENTER);
		pwd.setText("Password");
		pwd.setTextAlignment(TextBoxBase.ALIGN_CENTER);
		VerticalPanel.add(pwd);
		VerticalPanel.setCellHorizontalAlignment(pwd, HasHorizontalAlignment.ALIGN_CENTER);
		VerticalPanel.add(Login);
		VerticalPanel.setCellHorizontalAlignment(Login, HasHorizontalAlignment.ALIGN_CENTER);
		VerticalPanel.setCellHeight(Login, "20");
		VerticalPanel.setCellWidth(Login, "20");
		Login.setSize("121px", "35px");
		SignUpNow.setSize("117px", "32px");
	
		
		
		// TODO Auto-generated method stub
		
	}

}
