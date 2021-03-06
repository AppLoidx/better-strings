package com.antkorwin.betterstrings.tokenizer;

/**
 * Created on 2019-09-11
 * <p>
 * TODO: replace on the JavaDoc
 *
 * @author Korovin Anatoliy
 */
public class Token {

    private String value;
    private TokenType type;
    private int offset;

    public Token(String value, TokenType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public TokenType getType() {
        return type;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Token{" +
               "value='" + value + '\'' +
               ", type=" + type +
               '}';
    }
}
