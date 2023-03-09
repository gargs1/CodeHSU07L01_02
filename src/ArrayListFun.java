//import ArrayLists

import java.util.ArrayList;
public class ArrayListFun {
    public static void main(String[] args) {
        //create an ArrayList of Integers
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        //format is ArrayList<E> listName = new ArrayList<E>();

        //create an ArrayList of Doubles
        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);
        doubles.add(4.4);
        doubles.add(5.5);



        //create an ArrayList of Strings

        ArrayList<String> words = new ArrayList<String>();


        //print your list of Doubles
        System.out.println(doubles);


        //add a new value to the end list of Integers then print it
        integers.add(4);
        System.out.println(integers);

        //add a new value at a specific index in the Integer then print it
        integers.add(2, 57);
        System.out.println(integers);


        //get the item an index 4 in the Integer array list
        integers.get(4);

        //add a new value of 33 to the Integer array list and get its size
        integers.add(33);
        integers.size();

        //set the item at index 3 to be 42.0 in the Integers array, store that element, then
        // print the new list and the replaced value
        int oldVal = integers.set(3, 42);
        System.out.println(integers);


        //remove the item at index 2 in the Doubles array
        integers.remove(2);



    }
}