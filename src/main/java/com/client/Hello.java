package main.java.com.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Created by gayathri on 6/9/17.
 */
public class Hello implements EntryPoint {
    public void onModuleLoad() {
       /* Button b = new Button("Click me", new ClickHandler() {
            public void onClick(ClickEvent event) {
                Window.alert("Hello, AJAX");
            }
        });
*/

       //add button to change font to big when click
        Button Btn1 = new Button("Big Text");
        Btn1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                RootPanel.get("mytext").setStyleName("gwt-Big-Text");
            }
        });

        //add button to change font to small when click
        Button Btn2 = new Button("Small Text");
        Btn2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                RootPanel.get("mytext").setStyleName("gwt-Small-Text");
            }
        });

        HTML html = new HTML("<p>Welcome to GWT application</p>");

        RootPanel.get("gwtContainer").add(html);
        RootPanel.get("gwtGreenButton").add(Btn1);
        RootPanel.get("gwtRedButton").add(Btn2);
    }
}


