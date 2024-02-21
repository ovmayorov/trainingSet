package org.example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static List<Integer> removeDuplicates(List<Integer> myList){
        Set<Integer> noDuplicates = new HashSet<>(myList);
        return new ArrayList<>(noDuplicates);

//        Set<Integer> noDuplicates = new HashSet<>();
//        List<Integer> res;
//        for(int i: myList){
//            noDuplicates.add(i);
//        }
//        return new ArrayList<>(noDuplicates);
    }

    //  /////////////////////////////////////////////////////////////////

    public static boolean hasUniqueChars(String str){
        char[] charsFromString = str.toCharArray();
        Set<Character> charSet = new HashSet<>();
        for(int i = 0; i < charsFromString.length; i++){
            charSet.add(charsFromString[i]);
        }
        if(charSet.size() == charsFromString.length) return true;
        return false;
    }
    // ===========================================================
    /*
    public static boolean hasUniqueChars(String string) {
        Set<Character> charSet = new HashSet<>();

        for (char ch : string.toCharArray()) {
            if (charSet.contains(ch)) {
                return false;
            }
            charSet.add(ch);
        }

        return true;
    }
     */

    public static void main(String[] args) {

        System.out.printf("Training to use Set\n");
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        System.out.println("Original List: " + myList);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println("List with no duplicates: " + newList);

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8, 9]

            (Order may be different as sets are unordered)
        */
        System.out.println();
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false

        */
        
    }
}