package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfMates {

    private static List<String> listOfMates = new ArrayList<>();

    private static void operations(){
        ListFill();
        System.out.println("All students list : " + listOfMates);

        List<String> newList1 = listOfMates.stream()
                .filter(x -> x.equals("Ilya"))
                .toList();
        int sameNameAmount = newList1.size();
        System.out.println("Ilya's in group : " + sameNameAmount);

        List<String> newList2 = listOfMates.stream()
                .filter(x -> x.startsWith("A") || x.startsWith("a"))
                .toList();
        System.out.println("Names that start with A/a : " + newList2);

        List<String> result = listOfMates.stream()
                .sorted()
                .limit(1)
                .toList();
        if(result.size() != 0){
            System.out.println("First element in sorted List : " + result);
        }
        else System.out.println("First element in sorted List : Empty@");
    }

    public static void getOperations(){
        operations();
    }

    private static void ListFill(){
        Collections.addAll(listOfMates , "Anastasia" , "Valentin" , "Vladislav" , "Vladislav" , "Sergey" ,
                                                   "Maria" , "Julia" , "Lesha" , "Roman" , "Ilya" , "Ilya");
    }

    public static List<String> getListOfMates() {
        return listOfMates;
    }

    public static void setListOfMates(List<String> listOfMates) {
        ListOfMates.listOfMates = listOfMates;
    }
}
