package frontend;

import java.util.Iterator;

public class Lexer implements Iterator<Token>, Iterable<Token> {
    private final String sourceCode;
    private int index;
    private int lineNum;

    public Lexer(String sourceCode) {
        this.sourceCode = sourceCode;
        this.index = 0;
        this.lineNum = 1;
    }
    // PostCondition:---->>>>
    // To validate the lexeme extracted out of sourceCode and
    // assign the token type to it OR TokenType.INVALID
    // to inform that the parameter deosnt fit the criteria.
    // If all the criterias fail to assign a TokenType then
    // the lexeme is assigned a TokenType = INVALID_TOKEN meaning
    // it is a invalid token.

    // Criteria is represented by various functions below here.

    public TokenType isValidKeyword(String lexeme) {
        switch (lexeme) {

            case "and":
                return TokenType.AND;

            case "class":
                return TokenType.CLASS;

            case "else":
                return TokenType.ELSE;

            case "false":
                return TokenType.FALSE;

            case "fn":
                return TokenType.FUNCTION;

            case "for":
                return TokenType.FOR;

            case "if":
                return TokenType.IF;

            case "nil":
                return TokenType.NIL;

            case "or":
                return TokenType.OR;

            case "print":
                return TokenType.PRINT;

            case "return":
                return TokenType.RETURN;

            case "super":
                return TokenType.SUPER;

            case "this":
                return TokenType.THIS;

            case "true":
                return TokenType.TRUE;

            case "var":
                return TokenType.VAR;

            case "while":
                return TokenType.WHILE;

            case "not":
                return TokenType.NOT;
        }

        return TokenType.INVALID;
    }

    public TokenType isValidIdentifier(String lexeme) {
        return TokenType.INVALID;
    }

    public TokenType isValidSingleCharTokenType(String lexeme) {
        switch (lexeme) {
            case "{":
                return TokenType.LEFT_BRACE;
            case "}":
                return TokenType.RIGHT_BRACE;
            case "(":
                return TokenType.LEFT_PAREN;
            case ")":
                return TokenType.RIGHT_PAREN;
            case ".":
                return TokenType.DOT;
            case ";":
                return TokenType.SEMICOLON;
            case "+":
                return TokenType.PLUS;
            case "-":
                return TokenType.MINUS;
            case "/":
                return TokenType.SLASH;
            case "*":
                return TokenType.STAR;
        }

        return TokenType.INVALID;
    }

    public TokenType isValidOneOrMoreCharToken(String lexeme) {
        switch (lexeme) {
            case "not_equals":
                return TokenType.NOT_EQUAL;
            case "equals":
                return TokenType.EQUAL;
            case "equals_equals":
                return TokenType.EQUAL_EQUAL;
            case "greater_than":
                return TokenType.GREATER;
            case "greater_equals":
                return TokenType.GREATER_EQUAL;
            case "lesser_than":
                return TokenType.LESS;
            case "lesser_equals":
                return TokenType.LESS_EQUAL;
        }
        return TokenType.INVALID;
    }

    public TokenType isValidNumberLiteral(String lexeme) {
        return TokenType.INVALID;
    }

    public TokenType isValidStringLiteral(String lexeme) {
        return TokenType.INVALID;
    }

    // postcondition: Returns true if there is next token in stream and moves the
    // index to start of next token.
    // Otherwise, returns false and moves the index to end of stream.
    @Override
    public boolean hasNext() {
        while (Character.isWhitespace(sourceCode.charAt(index))) {
            if (sourceCode.charAt(index) == '\n')
                ++lineNum;
            index++;
        }
        return index < sourceCode.length();
    }

    // precondtion: index should point to start of a token
    // postcondtion: consumes the first token. if its valid return it otherwise
    // assigns the tokentype invalid to it and stops the processing.
    @Override
    public Token next() {
        return null;
    }

    @Override
    public Iterator<Token> iterator() {
        return this;
    }
}
