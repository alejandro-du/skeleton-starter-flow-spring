package com.vaadin.starter;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * A Spring-managed UI component.
 */
@Route("")
@HtmlImport("frontend://styles/styles.html")
public class MainView extends VerticalLayout {

    public MainView(GreetingService service) {
        Button button = new Button("Click me",
                event -> add(new Label(service.getMessage())));

        add(button);
    }

}
