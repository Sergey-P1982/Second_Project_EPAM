package com.epam.entities;

public class NewLineSign extends Symbol implements TextElement {
    public static final char NEW_LINE_SYMBOL = '\n';
    private String newLineSing;

    public NewLineSign (char newLineSing) {
        super(newLineSing);
    }

    public String getNewLineSing() {
        return newLineSing;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
