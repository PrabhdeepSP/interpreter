package frontend;

import java.util.List;

public class Lexer {
    // returns a list of valid tokens
    public List<Token> scanForTokens(String sourceCode) {
        return List.of(new Token("name", TokenType.IDENTIFIER, 3));
    }
}
