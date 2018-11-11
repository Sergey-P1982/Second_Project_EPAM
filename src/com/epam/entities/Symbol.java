package com.epam.entities;

public class Symbol implements TextElement {
    public static final char SPACE = ' ';
    protected char symbol;

    public Symbol (char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString(){
        return Character.toString(symbol);
    }
}
