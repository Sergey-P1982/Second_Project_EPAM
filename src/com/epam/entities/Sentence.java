package com.epam.entities;

public class Sentence {
    public static final String SENTENCE_SPLIT_REGEX = "\n";
    private String sentenceString;

    public Sentence(String sentenceString) {
       this.sentenceString = sentenceString.concat(SENTENCE_SPLIT_REGEX);
        this.sentenceString = deleteManySpaces();
    }

    public String getSentenceString() {
        return sentenceString;
    }

    public String deleteManySpaces() {
        return this.sentenceString.replaceAll(TextElement.TABS_REGEX, Character.toString(Symbol.SPACE));
    }

    @Override
    public String toString() {
        return sentenceString;
    }
}
