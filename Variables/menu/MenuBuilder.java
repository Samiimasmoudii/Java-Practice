package menu;

import java.util.ArrayList;

public class MenuBuilder {
    public static void main(String[] args) {//Create a variable called menutTitle of type String
    String menuTitle = "My Dream Menu";

    // create a type menu : arraylist
    ArrayList<MenuItem> menu = new ArrayList<>();
    MenuItem starter = new MenuItem ("Calamari");

    menu.add(starter);

    MenuItem mainCourse = new MenuItem ("Lasagne");
    menu.add(mainCourse );

    MenuItem dessert = new MenuItem("Banoffee Pie");

    menu.add(dessert);
    
    System.out.println(menuTitle);
    System.out.println(menu);
    }
}