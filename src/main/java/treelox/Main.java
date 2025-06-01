package treelox;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error: Invalid Usage");
            System.out.println("Correct Usage: ./treelox [script_name]");
            return;
        }
    }
}
