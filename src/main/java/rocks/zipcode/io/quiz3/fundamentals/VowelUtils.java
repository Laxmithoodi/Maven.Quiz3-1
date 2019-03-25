package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    private static final Character[] vowels = {'A', 'E','I', 'O', 'U',
            'a', 'e', 'i', 'o','u'};
    public static Boolean hasVowels(String word) {
        for (int i = 0; i < vowels.length; i++) {
            if(word.contains( vowels[i].toString())){
                return true;
            }

        }

        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1)
                return word.indexOf(ch);
            
        }

        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        for (int i = 0; i < vowels.length; i++) {
           if(word.startsWith(vowels[i].toString())){
               return true;
           }

        }

        return false;
    }

    public static Boolean isVowel(Character character) {

        return "AEIOUaeiou".indexOf(character) != -1;
    }
}
