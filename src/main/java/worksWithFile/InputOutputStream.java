package worksWithFile;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputOutputStream {
    public static void main(final String[] args) {
        File fileInput = new File("C:\\Users\\Polina\\test", "Test.txt");
        try (InputStream is = new FileInputStream(fileInput)) {
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes,0, len));
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            System.out.println("Mistake of reading");
        }

        File fileOut = new File("C:\\Users\\Polina\\test", "Test Pro.txt");
        try (OutputStream os = new FileOutputStream(fileOut)) {
            String text= "Hello";
            os.write(text.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            System.out.println("Mistake of reading");
        }
    }
}
