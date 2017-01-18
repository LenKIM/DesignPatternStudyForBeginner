package dinermerger;

import java.util.ArrayList;

/**
 * Created by len on 2017. 1. 18..
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
        waitress.printMenu();

    }
    public static void printMenu(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.println(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t\t" + menuItem.getDescription());
        }

        MenuItem[] lunchItems = dinnerMenu.getMenuItems();

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());

        }
    }

}
