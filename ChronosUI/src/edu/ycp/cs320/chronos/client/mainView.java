package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.datepicker.client.DatePicker;

import edu.ycp.cs320.chronos.shared.Account;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class mainView extends Composite{
	private String nxtEvent;
	public mainView(){
		final LayoutPanel mainPanel = new LayoutPanel();
		
		//Sign out button: signs the user out upon click
		Button signOut = new Button("Sign out");
		signOut.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ChronosUI.setCurrentView(new LoginView());
			}
		});
		mainPanel.add(signOut);
		mainPanel.setWidgetLeftWidth(signOut, 0.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(signOut, 50.0, Unit.PX, 30.0, Unit.PX);
		
		//Create Event button: Upon click, the user will be able to enter information needed in order to make a new event
		Button createEvent = new Button("Create Event");
		mainPanel.add(createEvent);
		mainPanel.setWidgetLeftWidth(createEvent, 0.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(createEvent, 87.0, Unit.PX, 30.0, Unit.PX);
		
		//Calendar button: Displays an actual calendar for the month
		Button btnCalendar = new Button("Calendar");
		mainPanel.add(btnCalendar);
		mainPanel.setWidgetLeftWidth(btnCalendar, 0.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(btnCalendar, 123.0, Unit.PX, 30.0, Unit.PX);
		
		//Displays the user's upcoming event information
		
		Label nextEvent = new Label("Next Event");
		mainPanel.add(nextEvent);
		mainPanel.setWidgetLeftWidth(nextEvent, 113.0, Unit.PX, 372.0, Unit.PX);
		mainPanel.setWidgetTopHeight(nextEvent, 50.0, Unit.PX, 57.0, Unit.PX);
		
		
		
		//Layout panel for creating a new event
		//This layout panel is intended to pop up on top of the mainView
		//Must add this part to the onClickhandler under Create Event
		LayoutPanel createEventPanel = new LayoutPanel();
		mainPanel.add(createEventPanel);
		mainPanel.setWidgetLeftWidth(createEventPanel, 87.0, Unit.PX, 481.0, Unit.PX);
		mainPanel.setWidgetTopHeight(createEventPanel, 73.0, Unit.PX, 328.0, Unit.PX);
		
		createEvent.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
					
					// Code for layout panel when user clicks CreateEvent
					LayoutPanel layoutPanel = new LayoutPanel();
					mainPanel.add(layoutPanel);
					mainPanel.setWidgetLeftWidth(layoutPanel, 123.0, Unit.PX, 503.0, Unit.PX);
					mainPanel.setWidgetTopHeight(layoutPanel, 111.0, Unit.PX, 358.0, Unit.PX);
					
					TextBox eventName = new TextBox();
					layoutPanel.add(eventName);
					layoutPanel.setWidgetLeftWidth(eventName, 38.0, Unit.PX, 174.0, Unit.PX);
					layoutPanel.setWidgetTopHeight(eventName, 50.0, Unit.PX, 31.0, Unit.PX);
					
					DatePicker datePicker = new DatePicker();
					layoutPanel.add(datePicker);
					layoutPanel.setWidgetLeftWidth(datePicker, 267.0, Unit.PX, 191.0, Unit.PX);
					layoutPanel.setWidgetTopHeight(datePicker, 49.0, Unit.PX, 191.0, Unit.PX);
					
					TextBox eventStartTime = new TextBox();
					layoutPanel.add(eventStartTime);
					layoutPanel.setWidgetLeftWidth(eventStartTime, 38.0, Unit.PX, 111.0, Unit.PX);
					layoutPanel.setWidgetTopHeight(eventStartTime, 100.0, Unit.PX, 31.0, Unit.PX);
					
					TextBox eventEndTime = new TextBox();
					layoutPanel.add(eventEndTime);
					layoutPanel.setWidgetLeftWidth(eventEndTime, 38.0, Unit.PX, 111.0, Unit.PX);
					layoutPanel.setWidgetTopHeight(eventEndTime, 154.0, Unit.PX, 31.0, Unit.PX);
					
					TextArea eventDetails = new TextArea();
					layoutPanel.add(eventDetails);
					layoutPanel.setWidgetLeftWidth(eventDetails, 38.0, Unit.PX, 191.0, Unit.PX);
					layoutPanel.setWidgetTopHeight(eventDetails, 214.0, Unit.PX, 130.0, Unit.PX);
					
					Button btnAddEvent = new Button("New button");
					btnAddEvent.setText("Add Event to Calendar");
					layoutPanel.add(btnAddEvent);
					layoutPanel.setWidgetLeftWidth(btnAddEvent, 267.0, Unit.PX, 191.0, Unit.PX);
					layoutPanel.setWidgetTopHeight(btnAddEvent, 286.0, Unit.PX, 40.0, Unit.PX);
			}
			});
		
		initWidget(mainPanel);
		
		}
}

