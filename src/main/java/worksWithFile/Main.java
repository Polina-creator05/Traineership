package worksWithFile;

import java.io.File;

public class Main {

    public static final String PATH = "C:\\Users\\Polina\\test";

    public static void main(final String[] args) {
        File dir = new File(PATH);

        if (dir.exists()) {
            System.out.println("Directory exists");
        } else {
            System.out.println("Directory does not exist");
        }

        File[] arrayFiles = dir.listFiles();
        if (arrayFiles == null) {
            System.out.println("Directiry is empty");
            return;
        }

        for (final File arrayFile : arrayFiles) {
            System.out.println(arrayFile.getName());
            if(arrayFile.isDirectory()){
                System.out.println("is directory");
            }

        }
    }

}
