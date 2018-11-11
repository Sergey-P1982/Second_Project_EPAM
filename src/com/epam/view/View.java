package com.epam.view;

import com.epam.entities.TextElement;
import com.epam.model.FilePrinter;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.List;

/**
 * This is the main view class of the project
 *
 * @author Serhii Prokopenko
 */

public class View implements MenuView {

    /**
     * Displays some information message.
     *
     * @param message The information string
     */
    public void printMessage(String message) {
        System.out.print(message);
    }

    /**
     * Displays text from TXT source file.
     *
     * @param message     The information string
     * @param fileName TXT file name
     */
    public void printTextFromTxtFile(String message, String fileName) {
        System.out.println(message);
        System.out.println(FilePrinter.createStringBufferFromTxtFile(FilePrinter.initFileName));

    }

    /**
     * Prints information from a list of text items.
     *
     * @param message     The information string
     * @param rezultList Final list of text elements
     */

    public void printResultText(String message, List<TextElement> rezultList) {
        System.out.println(message);
        for (TextElement textElement : rezultList) {
            System.out.print(textElement);
        }

    }

}
