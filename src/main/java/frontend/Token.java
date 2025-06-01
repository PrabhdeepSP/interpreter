package frontend;

public class Token {
    public final String lexeme;
    public final TokenType type;
    public final int lineNo;

    public Token(String lexeme, TokenType type, int lineNo) {
        this.lexeme = lexeme;
        this.type = type;
        this.lineNo = lineNo;
    }

    public String toString() {
        return type + " " + lexeme + ":" + lineNo;
    }
}
