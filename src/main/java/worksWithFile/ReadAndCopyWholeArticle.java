package worksWithFile;

import java.io.*;

public class ReadAndCopyWholeArticle {
    public static void main(final String[] args) {
        File article = new File("C:\\Users\\Polina\\test", "Test.txt");
        File destination = new File("C:\\Users\\Polina\\test", "Article.txt");
        if (!destination.exists()) {
            try {
                destination.createNewFile();
            } catch (IOException e) {
                System.out.println("Mistake of creating" + e.getMessage());
            }
        }

        try (InputStream is = new FileInputStream(article)) {
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            OutputStream os = new FileOutputStream(destination);
            os.write(bytes,0, len);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            System.out.println("Mistake of reading");
        }

    }


}

