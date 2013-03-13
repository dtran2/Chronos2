package edu.ycp.cs320.chronos.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.TextBoxBase;

import edu.ycp.cs320.chronos.database.Database;
import edu.ycp.cs320.chronos.database.IDatabase;


public class ChronosUI implements EntryPoint{

	public static ChronosUI instance;
	private IsWidget currentView;
	
	@SuppressWarnings("deprecation")
	@Override
	
	public void onModuleLoad() {
		instance = this;
		
		setCurrentView(new LoginView());
		
		
	}
	
	public void setCurrentView(IsWidget currentView) {
		if (currentView != null) {
			RootLayoutPanel.get().remove(currentView);
		}
		this.currentView = currentView;
		RootLayoutPanel.get().add(currentView);
		RootLayoutPanel.get().setWidgetTopBottom(currentView, 10.0, Unit.PX, 10.0, Unit.PX);
		RootLayoutPanel.get().setWidgetLeftRight(currentView, 10.0, Unit.PX, 10.0, Unit.PX);
	}
	
}


