package treelox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import frontend.*;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Error: Invalid Usage");
            System.out.println("Correct Usage: ./treelox [script_name]");
            return;
        } else if (args.length == 1) {
            fileMode(args[0]);
        } else {
            promptMode();
        }
    }

    public static void run(String sourceCode) {
        Lexer lexer = new Lexer();
        List<Token> tokens = lexer.scanForTokens(sourceCode);

        for (Token t : tokens) {
            System.out.println(t);
        }
    }

    // Reads a single line from std in and just prints the words separated by space
    // for now
    // Goes on for eternity untill ctrl+d is pressed.
    public static void promptMode() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("> ");
            String sourceCodeLine = bfr.readLine();
            if (sourceCodeLine == null)
                break;
            run(sourceCodeLine);
        }
    }

    // Reads the input from the file line by line and prints the words separated by
    // space
    public static void fileMode(String file) throws IOException {
        String sourceCode = Files.readString(Paths.get(file));
        run(sourceCode);
    }
}
