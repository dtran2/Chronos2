package edu.ycp.cs320.chronos.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;


public class ChronosUI implements EntryPoint{
	private TextBox email = new TextBox();
	private PasswordTextBox pwd = new PasswordTextBox();
	@Override
	public void onModuleLoad() {
		
		email.setText("E-mail");
		email.setName("email");
		email.setAlignment(TextAlignment.CENTER);

		// TODO Auto-generated method stub
		
	}

}
