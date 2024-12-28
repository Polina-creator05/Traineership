package worksWithFile;

import java.io.File;
import java.io.IOException;

public class CreatAndDelete {

    public static final String PATH = "C:\\Users\\Polina\\test";

    public static void main(final String[] args) {
        File dir = new File(PATH);

        if (dir.exists()) {
            System.out.println("Directory exists");
        } else {
            System.out.println("Directory does not exist");
        }

        //create new folder
        File newFile = new File(dir, "newFolder");
        if (!newFile.exists()) {
            newFile.mkdir();
        }

        //delete folder
        File polina = new File(dir, "Polina");
        if (polina.exists()) {
            polina.delete();

        }

        //create new file
        File newFile1 = new File(dir, "newFile");
        if (!newFile1.exists()) {
            try {
                newFile1.createNewFile();
            } catch (IOException e) {
                System.out.println("Mistake of creating" + e.getMessage());
            }
        }

        //delete file
        File newFile2 = new File(dir, "newFile1");
        if (newFile2.exists()) {
                newFile2.delete();
        }

    }

}
