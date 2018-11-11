package com.epam.controller;

import com.epam.model.FilePrinter;
import com.epam.model.TextTransformator;
import com.epam.view.MenuScanner;
import com.epam.view.View;

/**
 * This is the class controller of the MVC project
 *
 * @author Serhii Prokopenko
 */
public class Controller {
   TextTransformator model = new TextTransformator();
    View view = new View();

    /**
     * Executes the main method of controller at the MVC concept
     */
    public void run() {

        do {
            view.printMenu();
            model.setTextElementList();
            executeMenuItem(MenuScanner.checkMenuItem(view, MenuScanner.scanMenuItem(view)));

        } while (true);
    }

    /**
     * Execute operations depend on number of menu item
     *
     * @param menuItem Number of menu item
     */
    private void executeMenuItem(int menuItem) {
        switch (menuItem) {
            case (1):
                view.printTextFromTxtFile(view.INIT_TEXT, FilePrinter.initFileName);
                break;
            case (2):
                view.printResultText(view.RESULT_TEXT, model.getTextElementList());
                break;
            case (3):
                view.printMessage(view.RESULT_FILE);
                FilePrinter.createResultTextFile(model.getTextElementList(), FilePrinter.resultFileName);

                break;
            case (0):
                view.printMessage("Bye!");
                System.exit(0);
                break;
        }
    }
}
