package worksWithFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPatternMatcher {
    public static void main(final String[] args) {
        String str = "fghfhf012fhfjhd345012345fjhgjhf67012349876789095012345dfjhsfkdf6789";


        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);

        int maxLength = 0;
        String numbersSeq = "";



       while (m.find()) {
            if (maxLength < m.end() - m.start()) {
                maxLength = m.end() - m.start();
                numbersSeq = m.group();
            }
        }

        System.out.println(maxLength + " " + numbersSeq);

       m.reset();

        while (m.find()){
            System.out.println(m.start() + "-" + m.end());
            System.out.println(m.group());
        }
    }
}
