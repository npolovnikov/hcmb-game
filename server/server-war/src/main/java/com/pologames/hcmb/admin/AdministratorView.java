package com.pologames.hcmb.admin;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.navigator.View;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class AdministratorView extends VerticalLayout implements View {
    public static final String NAME = "administrator";

    private MenuBar menu;

    public AdministratorView() {
        Design.read(this);

        menu.addItem("Players");
        menu.addItem("Player Cards");
        menu.addItem("Gamers");

        setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
    }
}
