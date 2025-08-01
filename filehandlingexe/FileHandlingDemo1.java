import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the file name:");
        String fileName = sc.next();
        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
            System.out.println();
        } catch (FileNotFoundException ex) {
            System.out.printf("File Not Found %s:", fileName);

        } catch (IOException ex) {
            System.out.printf("Exception Occurred:", ex.getMessage());
        } catch (Exception ex) {
            System.out.printf("Exception Occurred:", ex.getMessage());

        }

    }
}