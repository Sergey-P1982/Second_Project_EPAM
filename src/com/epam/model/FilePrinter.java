package com.epam.model;

import com.epam.entities.TextElement;

import java.io.*;
import java.util.List;

/**
 * This is the class that creates the StringBuffer from the source txt file and
 * writes the final txt file from the list of text elements.
 *
 * @author Serhii Prokopenko
 */

public class FilePrinter {
    public final static String initFileName = "Source_Txt_File.txt";
    public final static String resultFileName = "Result_Txt_File.txt";

    /**
     * This method reads the TXT file and creates the StringBuffer.
     *
     * @param fileName  The file name or full path to file
     * @return StringBuffer
     */

    public static StringBuffer createStringBufferFromTxtFile(String fileName) {
        StringBuffer stringBufferText = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBufferText.append(line + "\n");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return stringBufferText;
    }

    /**
     * This writes the final txt file from the list of text elements.
     *
     * @param resultList  The reference of the text elements list
     * @param fileName  The file name or full path to the result file
     */

    public static void createResultTextFile(List<TextElement> resultList, String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (TextElement textElement : resultList) {
                writer.write(textElement.toString());
            }
            System.out.println(" was created\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
