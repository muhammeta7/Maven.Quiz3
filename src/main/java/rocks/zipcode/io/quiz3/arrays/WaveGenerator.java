package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz3.fundamentals.StringUtils.capitalizeNthCharacter;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {

        str = str.toLowerCase();
        List<String> wavey = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                wavey.add(capitalizeNthCharacter(str, i));
            }
        }
        return wavey.toArray(new String[wavey.size()]);

    }

}
