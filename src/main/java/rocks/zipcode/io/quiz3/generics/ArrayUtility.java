package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
        for (SomeType element : array) {
            if (getNumberOfOccurrences(element) % 2 != 0) {
                return element;
            }
        }

        return null;
    }

    public SomeType findEvenOccurringValue() {

        for (SomeType elment : array) {
            if (getNumberOfOccurrences(elment) % 2 == 0) {
                return elment;
            }

        }
        return null;
    }


    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int countOcc = 0;

        for (SomeType element : array) {
            if (element.equals(valueToEvaluate)) {
                countOcc++;
            }

        }


        return countOcc;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> list = new ArrayList<>();
        for (SomeType type : array){
            if(predicate.apply(type)){
                list.add(type);

            }
        }
        SomeType[] resultArray = Arrays.copyOf(array, list.size());
        return list.toArray(resultArray);
    }
}
