// A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

// Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
//


// Sources:
// https://www.geeksforgeeks.org/remove-duplicates-from-a-given-string/
// https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/
import java.util.Arrays;

public class PangramChecker {

    public static String removeDuplicateCharacters(String str) {

        String strippedSentence = "";

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            c = Character.toLowerCase(c);

            if (!Character.isLetter(c)) {
                continue;
            }

            if (strippedSentence.indexOf(c) < 0) {
                strippedSentence += c;
            }

        }
        return strippedSentence;
    }

    public static String sortStringAlphabetically(String str) {
        char tempArray[] = str.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }


    public static boolean check(String sentence){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String sentenceDuplicatesRemoved = removeDuplicateCharacters(sentence);
        String sentenceSorted = sortStringAlphabetically(sentenceDuplicatesRemoved);

        return sentenceSorted.equalsIgnoreCase(alphabet);
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.1";
        System.out.println(sentence);
        String str = removeDuplicateCharacters(sentence);
        System.out.println(str);
        str = sortStringAlphabetically(str);
        System.out.println(str);
        System.out.println(check(str));

    }
}
