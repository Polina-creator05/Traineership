package worksWithFile;

public class RegularExpressions {
    public static void main(final String[] args) {
        String str = "Te4st 2string 9for 7split";
        String [] words = str.split("[0-5]");

        for (final String word : words) {
            System.out.println(word);
        }


    }


}
