package worksWithFile;

public class Cirillitza {
    public static void main(final String[] args) {
        String str = "Polina Полинаare ищlookingет for стаjobжировку";
        String [] words = str.split("[а-яА-я]+");

        for (final String word : words) {
            System.out.print(word);
        }
    }
}
