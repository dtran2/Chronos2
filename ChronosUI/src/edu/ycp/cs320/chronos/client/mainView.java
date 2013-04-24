package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.datepicker.client.DatePicker;
// import edu.ycp.cs320.chronos.shared.Account;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class mainView extends Composite{
	public mainView(){
		final LayoutPanel mainPanel = new LayoutPanel();
		final LayoutPanel createEventPanel = new LayoutPanel();
		mainPanel.setSize("774px", "554px");
		initWidget(mainPanel);
		
		//Calendar button: Displays an actual calendar for the month
		Button btnCalendar = new Button("Calendar");
		mainPanel.add(btnCalendar);
		mainPanel.setWidgetLeftWidth(btnCalendar, 0.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(btnCalendar, 123.0, Unit.PX, 30.0, Unit.PX);
		
		//Displays the user's upcoming event information
		Label nextEvent = new Label("Next Event");
		mainPanel.add(nextEvent);
		mainPanel.setWidgetLeftWidth(nextEvent, 342.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(nextEvent, 50.0, Unit.PX, 30.0, Unit.PX);
		
		// Sign out Button with EventHandler
		final Button signOut = new Button("Sign out");
		mainPanel.add(signOut);
		mainPanel.setWidgetLeftWidth(signOut, 0.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(signOut, 50.0, Unit.PX, 30.0, Unit.PX);
			signOut.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					ChronosUI.setCurrentView(new LoginView());
				}
			});
		
		
		//Create Event button: Upon click, the user will be able to enter information needed in order to make a new event
		Button createEvent = new Button("Create Event");
		mainPanel.add(createEvent);
		mainPanel.setWidgetLeftWidth(createEvent, 0.0, Unit.PX, 81.0, Unit.PX);
		mainPanel.setWidgetTopHeight(createEvent, 87.0, Unit.PX, 30.0, Unit.PX);
		createEvent.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Code for layout panel when user clicks CreateEvent
				mainPanel.add(createEventPanel);
				mainPanel.setWidgetLeftWidth(createEventPanel, 97.0, Unit.PX, 550.0, Unit.PX);
				mainPanel.setWidgetTopHeight(createEventPanel, 111.0, Unit.PX, 349.0, Unit.PX);
				
				final TextBox eventName = new TextBox();
				createEventPanel.add(eventName);
				createEventPanel.setWidgetLeftWidth(eventName, 71.0, Unit.PX, 174.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(eventName, 46.0, Unit.PX, 31.0, Unit.PX);
				
				Label eventNamelabel = new Label();
				eventNamelabel.setText("Name of Event");
				createEventPanel.add(eventNamelabel);
				createEventPanel.setWidgetLeftWidth(eventNamelabel, 96.0, Unit.PX, 101.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(eventNamelabel, 20.0, Unit.PX, 20.0, Unit.PX);
				
				final DatePicker datePicker = new DatePicker();
				createEventPanel.add(datePicker);
				createEventPanel.setWidgetLeftWidth(datePicker, 267.0, Unit.PX, 191.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(datePicker, 68.0, Unit.PX, 191.0, Unit.PX);
				
				Label datePickerlabel = new Label();
				datePickerlabel.setText("Select a date");
				createEventPanel.add(datePickerlabel);
				createEventPanel.setWidgetLeftWidth(datePickerlabel, 316.0, Unit.PX, 91.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(datePickerlabel, 42.0, Unit.PX, 20.0, Unit.PX);
				
				final IntegerBox eventStartTime = new IntegerBox();
				createEventPanel.add(eventStartTime);
				createEventPanel.setWidgetLeftWidth(eventStartTime, 71.0, Unit.PX, 111.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(eventStartTime, 100.0, Unit.PX, 31.0, Unit.PX);
				
				Label eventStartlabel = new Label();
				eventStartlabel.setText("Start Time:");
				createEventPanel.add(eventStartlabel);
				createEventPanel.setWidgetLeftWidth(eventStartlabel, 5.0, Unit.PX, 60.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(eventStartlabel, 100.0, Unit.PX, 45.0, Unit.PX);
				
				final IntegerBox eventEndTime = new IntegerBox();
				createEventPanel.add(eventEndTime);
				createEventPanel.setWidgetLeftWidth(eventEndTime, 71.0, Unit.PX, 111.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(eventEndTime, 150.0, Unit.PX, 31.0, Unit.PX);
				
				Label eventEndlabel = new Label();
				eventEndlabel.setText("End Time:");
				createEventPanel.add(eventEndlabel);
				createEventPanel.setWidgetLeftWidth(eventEndlabel, 5.0, Unit.PX, 35.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(eventEndlabel, 146.0, Unit.PX, 45.0, Unit.PX);
				
				final TextArea eventDetails = new TextArea();
				createEventPanel.add(eventDetails);
				createEventPanel.setWidgetLeftWidth(eventDetails, 38.0, Unit.PX, 191.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(eventDetails, 214.0, Unit.PX, 130.0, Unit.PX);
				
				Label detailslabel = new Label();
				detailslabel.setText("Event Description:");
				createEventPanel.add(detailslabel);
				createEventPanel.setWidgetLeftWidth(detailslabel, 81.0, Unit.PX, 111.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(detailslabel, 188.0, Unit.PX, 20.0, Unit.PX);
				
				// Add Event to Calendar button and ClickHandler
				Button btnAddEvent = new Button("New button");
				btnAddEvent.setText("Add Event to Calendar");
				createEventPanel.add(btnAddEvent);
				createEventPanel.setWidgetLeftWidth(btnAddEvent, 267.0, Unit.PX, 191.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(btnAddEvent, 286.0, Unit.PX, 40.0, Unit.PX);
					btnAddEvent.addClickHandler(new ClickHandler() {
						@SuppressWarnings("deprecation")
						public void onClick(ClickEvent event) {
							RPC.eventManagementService.createEvent(eventName.getText(), datePicker.getHighlightedDate().getDate(), datePicker.getHighlightedDate().getDay(),
									datePicker.getHighlightedDate().getYear(), eventStartTime.getValue(), eventEndTime.getValue(), eventDetails.getText(), new AsyncCallback<Void>() {
										@Override
										public void onFailure(Throwable caught) {
											GWT.log("RPC call to create event failed: ", caught);
											createEventPanel.clear();
										}
							
									@Override
									public void onSuccess(Void result) {
										GWT.log("Event added to user Calendar");
										createEventPanel.clear();
										
									}
								});
						}	
					});
				
				// Clears the layout Panel if user decides not to create event
				Button btnClose = new Button("Close");
				createEventPanel.add(btnClose);
				createEventPanel.setWidgetLeftWidth(btnClose, 459.0, Unit.PX, 91.0, Unit.PX);
				createEventPanel.setWidgetTopHeight(btnClose, 0.0, Unit.PX, 40.0, Unit.PX);
					btnClose.addClickHandler(new ClickHandler() {
						public void onClick(ClickEvent event) {
						createEventPanel.clear();
						}
					});
			
					
			}
					});
			}
}

		

