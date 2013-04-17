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
		final LayoutPanel createEventPanel = new LayoutPanel();
		createEvent.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
					
					// Code for layout panel when user clicks CreateEvent
					mainPanel.add(createEventPanel);
					mainPanel.setWidgetLeftWidth(createEventPanel, 123.0, Unit.PX, 503.0, Unit.PX);
					mainPanel.setWidgetTopHeight(createEventPanel, 111.0, Unit.PX, 358.0, Unit.PX);
					
					TextBox eventName = new TextBox();
					createEventPanel.add(eventName);
					createEventPanel.setWidgetLeftWidth(eventName, 38.0, Unit.PX, 174.0, Unit.PX);
					createEventPanel.setWidgetTopHeight(eventName, 50.0, Unit.PX, 31.0, Unit.PX);
					
					DatePicker datePicker = new DatePicker();
					createEventPanel.add(datePicker);
					createEventPanel.setWidgetLeftWidth(datePicker, 267.0, Unit.PX, 191.0, Unit.PX);
					createEventPanel.setWidgetTopHeight(datePicker, 49.0, Unit.PX, 191.0, Unit.PX);
					
					TextBox eventStartTime = new TextBox();
					createEventPanel.add(eventStartTime);
					createEventPanel.setWidgetLeftWidth(eventStartTime, 38.0, Unit.PX, 111.0, Unit.PX);
					createEventPanel.setWidgetTopHeight(eventStartTime, 100.0, Unit.PX, 31.0, Unit.PX);
					
					TextBox eventEndTime = new TextBox();
					createEventPanel.add(eventEndTime);
					createEventPanel.setWidgetLeftWidth(eventEndTime, 38.0, Unit.PX, 111.0, Unit.PX);
					createEventPanel.setWidgetTopHeight(eventEndTime, 154.0, Unit.PX, 31.0, Unit.PX);
					
					TextArea eventDetails = new TextArea();
					createEventPanel.add(eventDetails);
					createEventPanel.setWidgetLeftWidth(eventDetails, 38.0, Unit.PX, 191.0, Unit.PX);
					createEventPanel.setWidgetTopHeight(eventDetails, 214.0, Unit.PX, 130.0, Unit.PX);
					
					Button btnAddEvent = new Button("New button");
					btnAddEvent.setText("Add Event to Calendar");
					createEventPanel.add(btnAddEvent);
					createEventPanel.setWidgetLeftWidth(btnAddEvent, 267.0, Unit.PX, 191.0, Unit.PX);
					createEventPanel.setWidgetTopHeight(btnAddEvent, 286.0, Unit.PX, 40.0, Unit.PX);
					btnAddEvent.addClickHandler(new ClickHandler() {
						public void onClick(ClickEvent event) {
							createEventPanel.clear();
						}
					});
					
					// Clears the layout Panel if user decides not to create event
					Button btnClose = new Button("Close");
					createEventPanel.add(btnClose);
					createEventPanel.setWidgetLeftWidth(btnClose, 167.0, Unit.PX, 91.0, Unit.PX);
					createEventPanel.setWidgetTopHeight(btnClose, 286.0, Unit.PX, 40.0, Unit.PX);
						btnClose.addClickHandler(new ClickHandler() {
							public void onClick(ClickEvent event) {
								createEventPanel.clear();
							}
						});
			}
			});
		
		initWidget(mainPanel);
		
		}
}

