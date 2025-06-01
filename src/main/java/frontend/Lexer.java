package frontend;

import java.util.Iterator;

public class Lexer implements Iterator<Token>, Iterable<Token> {
    private final String sourceCode;
    private int index;

    public Lexer(String sourceCode) {
        this.sourceCode = sourceCode;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Token next() {
        return null;
    }

    @Override
    public Iterator<Token> iterator() {
        return this;
    }
}
