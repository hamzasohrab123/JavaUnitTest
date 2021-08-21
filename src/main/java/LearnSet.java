import java.util.*;

public class LearnSet {

    public static void main(String[] args) {
        HashSet<String> myBooks = new HashSet<>();
        myBooks.add("oliver twist");
        myBooks.add("romeo and juliet");
        myBooks.add("macbeth");
        myBooks.add("twelfth night");
        myBooks.add("hamlet");
        System.out.println(myBooks);

        //not gonna print the duplicate value
            //myBooks.add("hamlet");
            //System.out.println(myBooks);

        //this gonna remove something from list
            //myBooks.remove("oliver twist");
            //System.out.println(myBooks);

            if (myBooks.contains("macbeth")) {
                System.out.println("It's there");
            } else {
                System.out.println("It's not there");
            }

        //Iterator is gonna move through the list
        //has.Next() gonna check that the list has next value or not
        Iterator itr = myBooks.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }

        //Lambda Expression
        myBooks.forEach(books -> System.out.println("Book: " + books));

        //This will not be Empty
        System.out.println(myBooks.isEmpty());

        //HashMap Practice
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Malik", 555);
        myMap.put("Musa", 444);
        myMap.put("Maaz", 333);
        myMap.put("Mahad", 222);
        myMap.put("Moiz", 111);

        //It can not allow same string but can allow same key to go through
        //myMap.put("Moiz", 111);

        System.out.println(myMap.size());
        System.out.println(myMap);

    }
}


