package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {


    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String result = "";
        result += str.substring(0, indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize)) +
                str.substring(indexToCapitalize + 1);
        return result;

    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> listOfSubStrings = new ArrayList<>();

        for(int i = 0; i < string.length(); i++){
            for(int j =  i + 1; j <= string.length(); j++){
                if(!listOfSubStrings.contains(string.substring(i, j))) {
                    listOfSubStrings.add(string.substring(i, j));
                }
            }
        }

        String[] substrings = listOfSubStrings.toArray(new String[listOfSubStrings.size()]);
        return substrings;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
