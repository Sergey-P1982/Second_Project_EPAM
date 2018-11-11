package com.epam.model;

import com.epam.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class separates the tokens from each sentence and creates a list of text elements.
 *
 * @author Serhii Prokopenko
 */

public class TextTransformator {
    List<TextElement> textElementList;

    public List<Sentence> getSentencesList() {
        String text = FilePrinter.createStringBufferFromTxtFile(FilePrinter.initFileName).toString();
        String[] sentences = text.split(Sentence.SENTENCE_SPLIT_REGEX);

        List<Sentence> sentencesList = new ArrayList<>();
        for (String sentence : sentences) {
            if (!sentence.equals("\n")) {
                sentencesList.add(new Sentence(sentence));

            }
        }
        return sentencesList;
    }

    public List<TextElement> getTextElementList() {
        return textElementList;
    }

    public void setTextElementList() {
        this.textElementList = createTextElementsList();
    }

    public List<TextElement> createTextElementsList() {
        List<Sentence> sentenceList = getSentencesList();
        List<TextElement> textElementsList = new ArrayList<>();
        String[] textElemArray;
        for (Sentence sentence : sentenceList) {
            textElemArray = sentence.toString().split(TextElement.TEXT_ELEMENTS_SPLIT_REGEX);

            for (String token : textElemArray) {
                textElementsList =
                        separateTokensByMatchers(textElementsList, token);
            }
        }

        return textElementsList;
    }

    private List<TextElement> separateTokensByMatchers(List<TextElement> textElementsList, String token) {
        boolean endWithNewLineSign = false;
        if (token.endsWith("\n")) {
            endWithNewLineSign = true;
            token = token.replaceAll("\n", "");
        }

        String regEx = "^([^a-zA-Zа-яА-Я_0-9]*)?([a-zA-Zа-яА-Я_0-9]+)(\\W*)?$";
        Matcher matcher = Pattern.compile(regEx).matcher(token);

        separateMatchersByTextElements(textElementsList, token, endWithNewLineSign, matcher);

        return textElementsList;
    }

    private void separateMatchersByTextElements(List<TextElement> textElementsList,
                                                String token, boolean endWithNewLineSign, Matcher matcher) {
        if (matcher.find()) {
            for (char elem : matcher.group(1).toCharArray()) {
                if (PunctuationSign.PUNCTUATION_MARKS.contains(elem)) {
                    textElementsList.add(new PunctuationSign(elem));
                } else {
                    textElementsList.add(new Symbol(elem));
                }
            }

            textElementsList.add(new Word(matcher.group(2)));

            char[] substring3 = matcher.group(3).toCharArray();
            for (char elem : substring3) {
                if (PunctuationSign.PUNCTUATION_MARKS.contains(elem)) {
                    textElementsList.add(new PunctuationSign(elem));
                } else {
                    textElementsList.add(new Symbol(elem));
                }
            }

            if (endWithNewLineSign) textElementsList.add(new NewLineSign(NewLineSign.NEW_LINE_SYMBOL));

        } else {
            for (char elem : token.toCharArray()) {
                if (PunctuationSign.PUNCTUATION_MARKS.contains(elem)) {
                    textElementsList.add(new PunctuationSign(elem));
                } else {
                    textElementsList.add(new Symbol(elem));
                }
            }
        }
        textElementsList.add(new Symbol(Symbol.SPACE));
    }
}


