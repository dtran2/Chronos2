package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;

public class mainView extends Composite{
	private String nxtEvent;
	public mainView(){
		final LayoutPanel mainPanel = new LayoutPanel();
		
		//Sign out button: signs the user out upon click
		Button btnSignOut = new Button("Sign out");
		mainPanel.add(btnSignOut);
		mainPanel.setWidgetLeftWidth(btnSignOut, 0.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(btnSignOut, 50.0, Unit.PX, 30.0, Unit.PX);
		
		//Create Event button: Upon click, the user will be able to enter information needed in order to make a new event
		Button btnCreateEvent = new Button("Create Event");
		mainPanel.add(btnCreateEvent);
		mainPanel.setWidgetLeftWidth(btnCreateEvent, 0.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(btnCreateEvent, 87.0, Unit.PX, 30.0, Unit.PX);
		
		//Calendar button: Displays an actual calendar for the month
		Button btnCalendar = new Button("Calendar");
		mainPanel.add(btnCalendar);
		mainPanel.setWidgetLeftWidth(btnCalendar, 0.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(btnCalendar, 123.0, Unit.PX, 30.0, Unit.PX);
		
		//Displays the user's upcoming event information
		
		Label lblNxtevnt = new Label("Next event");
		mainPanel.add(lblNxtevnt);
		mainPanel.setWidgetLeftWidth(lblNxtevnt, 113.0, Unit.PX, 372.0, Unit.PX);
		mainPanel.setWidgetTopHeight(lblNxtevnt, 50.0, Unit.PX, 57.0, Unit.PX);
		
	}
}
