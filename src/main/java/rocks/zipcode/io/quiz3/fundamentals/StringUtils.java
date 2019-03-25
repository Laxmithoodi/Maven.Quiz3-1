package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String start = str.substring(0, indexToCapitalize);
        Character uppercase = Character.toUpperCase(str.charAt(indexToCapitalize));
        String end = str.substring(indexToCapitalize+1);

        return start+uppercase+end;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        int n = input.length();

        return n*(n+1)/2-1;
    }
}
