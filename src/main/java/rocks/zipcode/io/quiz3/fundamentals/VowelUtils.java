package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    public static Boolean hasVowels(String word) {
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.charAt(i))){
                return i;
            }

        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        character = character.toLowerCase(character);
        Character[] vowels = { 'a', 'e', 'i', 'o', 'u'};
        for(Character v : vowels){
            if(character == v) {
             return true;
            }
        }
        return false;
    }

}



