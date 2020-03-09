package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        for(SomeType st : array){
            if (getNumberOfOccurrences(st) % 2 == 1) {
                return st;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {

        for(SomeType st : array){
            if (getNumberOfOccurrences(st) % 2 == 0) {
                return st;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer numberOfOccurrences = 0;
        for (SomeType someType : array) {
            if (valueToEvaluate.equals(someType)) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> list = new ArrayList<>();

        for (SomeType someType : array) {
            if (predicate.apply(someType)) {
                list.add(someType);
            }
        }

        if (array[0] instanceof String) {
            String[] stringArray = list.toArray(new String[list.size()]);
            return (SomeType[]) stringArray;
        } else {
            Integer[] ints = list.toArray(new Integer[list.size()]);
            return (SomeType[]) ints;
        }
    }

}
