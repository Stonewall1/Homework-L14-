package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfIntegers {

    private static final List<Integer> list = new ArrayList<>();

    private static void operations() {
        listFill();
        System.out.println("Initial List : " + list);

        List<Integer> newList1 = list.stream().
                distinct().
                toList();
        System.out.println("Distincted List : " + newList1);

        List<Integer> newList2 = list.stream()
                .filter(x -> (x >= 7 && x <= 17 && x % 2 == 0))
                .toList();
        System.out.println("Filtered List : " + newList2);

        List<Integer> newList3 = list.stream()
                .map(x -> x * 2)
                .toList();
        System.out.println("Multiplied X2 List : " + newList3);

        List<Integer> newList4 = list.stream()
                .limit(4)
                .sorted(Comparator.comparingDouble(x -> x))
                .toList();
        System.out.println("First 4 sorted elements List : " + newList4);

        long ListElementsCount = list.stream()
                                     .count();
        System.out.println("Elements in Stream : " + ListElementsCount);

        double arithmeticMean = (list.stream()
                .mapToDouble(Integer::doubleValue)
                .sum())
                / ListElementsCount;
        System.out.printf("Arithmetic mean of Stream numbers : %.3f", arithmeticMean);

    }

    private static void listFill() {
        Collections.addAll(list, 7, 11, 0, 7, 16, 78, 98, 33, 32, 1, 6, 6, 5, 8, 99);
    }

    public List<Integer> getList() {
        return list;
    }

    public static void getOperations() {
        operations();
    }

}
