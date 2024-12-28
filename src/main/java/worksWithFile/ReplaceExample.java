package worksWithFile;

public class ReplaceExample {
    public static void main(final String[] args) {
        String str = "Test        multiple      spaces";
        String newStr= str.replaceAll(" +"," ");
        System.out.println(newStr);
    }


}
