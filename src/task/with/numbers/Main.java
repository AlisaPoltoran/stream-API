package task.with.numbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveNumbers = findPositiveNumbers(intList);
        List<Integer> evenNumbers = findEvenNumbers(positiveNumbers);
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers);

    }

    public static List<Integer> findPositiveNumbers(List<Integer> list) {
        List<Integer> listPositiveNumbers = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer s = iterator.next();
            if (s > 0) {
                listPositiveNumbers.add(s);
            }
        }
        return listPositiveNumbers;
    }

    public static List<Integer> findEvenNumbers(List<Integer> list) {
        List<Integer> listEvenNumbers = new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer s = iterator.next();
            if (s % 2 == 0) {
                listEvenNumbers.add(s);
            }
        }
        return listEvenNumbers;
    }
}
