package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem newItem = new MenuItem(15, "Some food", MenuItemsCategoryEnum.APPETIZER.name(), true)
    // MENU items
    Menu currentMenu = new Menu(new java.util.Date(), new ArrayList<>());
            currentMenu.getItems().add(newItem);
        System.out.println(currentMenu.getItems());
        // iterate over the currentMenu arrayList(s)
        // for MenuItem: currentMenu.getItems()
        // print
    }

}
