package rocks.zipcode.io.quiz3.fundamentals;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.*;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {

        String lowerCaseStr = str.toLowerCase();

        if (!isAlphabeticString(lowerCaseStr)) {
            return null;
        }
        if (startsWithVowel(str)) {
            return str + "way";
        }
        if (!hasVowels(str)) {
            return str + "ay";
        }
        if (!containsSpace(str)) {
            int indexOfFirstVowel = getIndexOfFirstVowel(str);
            return str.substring(indexOfFirstVowel) + str.substring(0, indexOfFirstVowel) + "ay";
        }

        String piglatin = "";
        String[] strings = str.split(" ");

        for (String string : strings) {
            piglatin += translate(string) + " ";
        }

        piglatin = piglatin.substring(0, piglatin.length() - 1);
        return piglatin;
    }

    public boolean isAlphabeticString(String str) {
        char[] charArray = str.toCharArray();
        for (Character c : charArray) {
            if ((!Character.isAlphabetic(c)) && (!(c == ' '))) {
                return false;
            }
        }
        return true;
    }

    public boolean containsSpace(String str) {
        for (Character c : str.toCharArray()) {
            if (c == ' ') {
                return true;
            }
        }
        return false;

    }

}



