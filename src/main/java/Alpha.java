import java.util.ArrayList;
import java.util.Iterator;

//public class Alpha {
//
//    public static void main(String[] args) {
//
//        ArrayList<String> array = new ArrayList<>();
//        array.add("Hamza");
//        array.add("Danish");
//        array.add("Jadid");
//        array.add("Khairul");
//
//        array.set(2, "Faizul");
//        System.out.println(array);
//
//
//    }
//}

public class Alpha {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("Hamza");
        array.add("Danish");
        array.add("Jadid");
        array.add("Khairul");
        array.add("Faizul");
        System.out.println(array);

        //listIterator means that where the Iterator Index should start from in a list
        Iterator itr = array.listIterator(1);
        while (itr.hasNext()){
            System.out.println(itr.next());

        }

    }
}
