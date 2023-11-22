import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class laba2 {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        int iter = 0; 

        try {
            Scanner fin = new Scanner(Paths.get(dir, "example.txt"), "UTF-8");

            while (fin.hasNext()) {
                iter = iter + 1;
                String symbol = fin.next();
                System.out.println("Symbol "+ iter + ": " + symbol);
            }

        } catch (NoSuchFileException e) {
            System.out.println("Exception 1: " + e);
        } catch (IOException e) {
            System.out.println("Exception 2: " + e);
        } catch (Exception e) {
            System.out.println("Exception 3: " + e);
        }
    }
}
