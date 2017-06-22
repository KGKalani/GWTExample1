package main.java.com.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;

/**
 * Created by gayathri on 6/14/17.
 */
public class LabelDemo implements EntryPoint {
    public void onModuleLoad() {
        //Create two Lables
        Label lable1 = new Label("This is the first GWT LabelDemo");
        Label lable2 = new Label("This is the second GWT LabelDemo");

        //Use UIObject methods to set label properties
        lable1.setTitle("Title for the first Lable");
        lable1.addStyleName("gwt-Green-Border");
        lable2.setTitle("Title for the second Lable");
        lable2.addStyleName("gwt-Blue-Border");

        //add label to the root panel
        VerticalPanel panel =  new VerticalPanel();
        panel.add(lable1);
        panel.add(lable2);

        RootPanel.get("gwtLabel").add(panel);
    }

}
