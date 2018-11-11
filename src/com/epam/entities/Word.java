package com.epam.entities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word implements TextElement {
    public static final String REGEX_WORD = "^[a-zA-Zа-яА-Я]+$";
    private String word;

    public Word(String word) {
        this.word = word;
        if (checkWord(word)) this.word = transformWord();
    }

    public String getWord() {
        return word;
    }

    private boolean checkWord (String word) {
        Pattern p = Pattern.compile(REGEX_WORD);
        Matcher m = p.matcher(word);
        return m.find();
    }

    private String transformWord() {

        String firstCharInWord = Character.toString(word.charAt(0));
        String lastCharInWord = Character.toString(word.charAt(word.length() - 1));

        if (firstCharInWord.equalsIgnoreCase(lastCharInWord)&&word.length()>1) {
            word = word.replaceAll(firstCharInWord + "|" + firstCharInWord.toLowerCase(), "");
        } else if (word.length()>1){
            word = word.replaceAll(firstCharInWord.toLowerCase() + "|" + firstCharInWord +
                    "|" + lastCharInWord + "|" + lastCharInWord.toLowerCase(), "");
            word = word.concat(lastCharInWord);
            word = firstCharInWord.concat(word);

        }
        return word;
    }

    @Override
    public String toString() {
        return this.word.toString();
    }
}
