package com.epam.view;

import com.epam.model.FilePrinter;

/**
 * The interface describes the menu fields and has one default method to display the menu.
 *
 * @author Serhii Prokopenko
 */

public interface MenuView {
    String EDITOR_MENU = "TEXT EDITOR MENU: \n" + "1. Read and show initial text from the TXT file.\n" +
            "2. Change the initial text according to the requirements of the task.\n" +
            "3. Save the result text to the new TXT file.\n" +
            "0. Exit";

    String CHOOSE_MENU_ITEM = "Choose a menu item (0-3): ";
    String WRONG_NUMBER = "Wrong input. Please try again. ";


     String INIT_TEXT = "Source text from the file ".toUpperCase() + "'" + FilePrinter.initFileName + "':";
     String RESULT_FILE = "The file ".toUpperCase() + "'" + FilePrinter.resultFileName + "' ";
     String RESULT_TEXT = "The result text after transformation every word in the text,\n".toUpperCase() +
            " removing all subsequent occurrences (previous) of first (last".toUpperCase() +
            ") letter of this word: ".toUpperCase() +'\n';
    /**
     * Default interface method
     * Displays menu.
     */
    default void printMenu() {
        System.out.println(EDITOR_MENU + '\n');

    }

}
