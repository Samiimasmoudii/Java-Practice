import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Sorry, an error has occurred.");
        }

    }
}

// This code attempts to create a new file at the specified path. If the
// directory doesn't exist, it catches the IOException and prints an error
// message. This way, the program handles the exception gracefully instead of
// crashing.