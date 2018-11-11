package com.epam.entities;

import java.util.Arrays;
import java.util.List;

public class PunctuationSign extends Symbol implements TextElement {

    public static final List<String> PUNCTUATION_MARKS = Arrays.asList(".", ",", ":", ";", "?", "!", "-",
                                                                        "(", ")", "{", "}", "[", "]", "'", "\"");

    public PunctuationSign(char sign) {
        super(sign);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
