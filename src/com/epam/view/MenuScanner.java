package com.epam.view;

import java.util.Scanner;

/**
 * This class has some methods to work with a simple text scanner.
 * regular expressions..
 *
 * @author Serhii Prokopenko
 */

public class MenuScanner implements MenuView {

    private static Scanner scan = new Scanner(System.in);

    /**
     * Scans and returns an integer
     *
     * @param view The reference of instance View
     * @return Integer
     */

    public static int scanMenuItem(View view) {
        view.printMessage(CHOOSE_MENU_ITEM);
        while (!scan.hasNextInt()) {
            view.printMessage(WRONG_NUMBER);
            view.printMessage(CHOOSE_MENU_ITEM);
            scan.next();
        }
        return scan.nextInt();
    }

    /**
     * Checks range and returns an integer
     *
     * @param view     The reference of instance View
     * @param menuItem Menu item number
     * @return Menu item number
     */

    public static int checkMenuItem(View view, Integer menuItem) {
        while (menuItem > 3 || menuItem < 0) {
            view.printMessage(WRONG_NUMBER);

            menuItem = scanMenuItem(view);
        }
        return menuItem;
    }

}


