package Assignment7;
import java.util.*;

 public class UniqueWordExtractor {
    enum Order {
        ALPHABETIC_ASCENDING,
        ALPHABETIC_DESCENDING,
        LENGTH_THEN_ALPHABETIC_ASCENDING,
        INPUT_ORDER
    }

    public Set<String> extractUniqueWords(String paragraph, Order order) {
        String[] words = paragraph.split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>();
        Set<String> resultSet;

        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        switch (order) {
            case ALPHABETIC_ASCENDING:
                resultSet = new TreeSet<>(uniqueWords);
                break;
            case ALPHABETIC_DESCENDING:
                resultSet = new TreeSet<>(Collections.reverseOrder());
                resultSet.addAll(uniqueWords);
                break;
            case LENGTH_THEN_ALPHABETIC_ASCENDING:
                resultSet = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
                resultSet.addAll(uniqueWords);
                break;
            case INPUT_ORDER:
            default:
                resultSet = uniqueWords;
        }

        return resultSet;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        UniqueWordExtractor extractor = new UniqueWordExtractor();
        System.out.println("Enter a sentence: ");
        String paragraph = sc.nextLine();
        sc.close();

        System.out.println("Alphabetic Ascending Order: " + extractor.extractUniqueWords(paragraph, Order.ALPHABETIC_ASCENDING));
        System.out.println("Alphabetic Descending Order: " + extractor.extractUniqueWords(paragraph, Order.ALPHABETIC_DESCENDING));
        System.out.println("Length then Alphabetic Ascending Order: " + extractor.extractUniqueWords(paragraph, Order.LENGTH_THEN_ALPHABETIC_ASCENDING));
        System.out.println("Input Order: " + extractor.extractUniqueWords(paragraph, Order.INPUT_ORDER));
    }
}

