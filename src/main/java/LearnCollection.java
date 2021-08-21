//import java.util.*;
//
//public class LearnCollection {
//
//    public static void main(String[] args) {
//
//        ArrayList<String> studentList = new ArrayList<>();
//            studentList.add("Moiz");
//            studentList.add("Munir");
//            studentList.add("Malik");
//            studentList.add("Munaim");
//            studentList.add("Moazzum");
//            studentList.add("Musa");
//            studentList.add("Maaz");
//            studentList.add("Mahad");
//            System.out.println("Size: " + studentList.size());

//            for-each loop
//            for (String name : studentList){
//                System.out.println(name);
//            }

            //for loop
//            ArrayList<String> elementswith4Characters = new ArrayList<>();
//            for (int i=0; i<studentList.size(); i++){
//
//               int LengthOfElements = studentList.get(i).length();
//
//                if (LengthOfElements == 5) {
//                    elementswith4Characters.add(studentList.get(i));
//                    //System.out.println(elementswith4Characters);
//                }
//            }
//                System.out.println(elementswith4Characters);
//                System.out.println(elementswith4Characters.size());
//
//  }

//import java.util.*;
//
//public class LearnCollection {
//
//    public static void main(String[] args) {
//
//        ArrayList<String> studentList = new ArrayList<>();
//        studentList.add(0, "Moiz");
//        studentList.add(1, "Malik");
//        studentList.add(2, "Munaim");
//        studentList.add(3, "Moazzum");
//        studentList.add(4, "Musa");
//        studentList.add(5, "Maaz");
//        studentList.add(6, "Mahad");
//        studentList.add(7, "Munir");
//        System.out.println("Size: " + studentList.size());
//
//        for (int i=0; i<studentList.size(); i++){
//
//            int len = studentList.get(i).length();
//            if (len != 5) {
//                studentList.remove(studentList.get(i));
//            }
//        }
//
//        for (String n : studentList) {
//            System.out.println(studentList);
//        }
//
//    }
//}


//        int i = 0;
//        while (i < studentList.size()) {
//
//            int len = studentList.get(i).length();
//            if (len != 5) {
//                studentList.remove(studentList.get(i));
//
//            } else {
//                System.out.println("HI");
//            }
//            i++;
//
//        }
//    }
//}


import java.util.*;

public class LearnCollection {

    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add(0, "Moiz");
        studentList.add(1, "Malik");
        studentList.add(2, "Musa");
        studentList.add(3, "Mahad");
        studentList.add(4, "Maaz");
        studentList.add(5, "Munir");
        System.out.println("Size: " + studentList.size());


        for (int i = 0; i < studentList.size(); i++) {
            int len = studentList.get(i).length();
            if (len != 5) {
                studentList.remove(studentList.get(i));
                //System.out.println(nameWith6Characters);
            }

        }
            System.out.println(studentList);
    }
}
