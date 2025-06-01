package frontend;

import java.util.Iterator;

public class Lexer implements Iterator<Token>, Iterable<Token> {
    private final String sourceCode;
    private int index;

    public Lexer(String sourceCode) {
        this.sourceCode = sourceCode;
        this.index = 0;
    }

    // postcondition: Returns true if there is next token in stream and moves the
    // index to start of next token.
    // Otherwise, returns false and moves the index to end of stream.
    @Override
    public boolean hasNext() {
        while (Character.isWhitespace(sourceCode.charAt(index)))
            index++;
        return index < sourceCode.length();
    }

    // precondtion: index should point to start of a token
    // postcondtion: consumes the first token. if its valid return it otherwise
    // throws exception.
    @Override
    public Token next() {
        return null;
    }

    @Override
    public Iterator<Token> iterator() {
        return this;
    }
}
