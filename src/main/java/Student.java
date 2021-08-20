/*
public class Student {

    int roll_no;
    String name;

    public static void main(String[] args) {
        Student student_dets1 = new Student();
        Student student_dets2 = new Student();

        student_dets1.roll_no = 1;
        student_dets1.name = "Jack";
        student_dets2.roll_no = 2;
        student_dets2.name = "John";

        System.out.println("Roll_No: " + student_dets1.roll_no);
        System.out.println("Name: " + student_dets1.name);

        System.out.println("Roll_No: " + student_dets2.roll_no);
        System.out.println("Name: " + student_dets2.name);

    }
}
*/
public class Student{

    int roll_no;
    String phone_no;
    String address;

    public static void main(String[] args) {
        Student sam = new Student();
        sam.roll_no = 1;
        sam.phone_no = "0123564789";
        sam.address = "ABC";
        System.out.println("Sam Roll_No, Phone_No & Address: "+ sam.roll_no +" "+ sam.phone_no +" "+ sam.address+" ");

        Student john = new Student();
        john.roll_no = 2;
        john.phone_no = "0123564528";
        john.address = "XYZ";
        System.out.println("John Roll_No, Phone_No & Address: "+ john.roll_no +" "+ john.phone_no +" "+ john.address+" ");

    }
}