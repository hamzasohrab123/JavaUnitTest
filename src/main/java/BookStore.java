import java.util.*;

public class BookStore {

    public void getBooks() {

        String[] book = new String[5];
        book[0] = "Macbeth";
        book[1] = "Romeo and Juliet";
        book[2] = "Oliver Twist";
        book[3] = "Hamlet";
        book[4] = "Twelve Night";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index: ");
        int ind = sc.nextInt();

            try {
                System.out.println("1st Try Block is All Good");
                try {
                    System.out.println(book[ind]);
                }
                catch (ArrayIndexOutOfBoundsException arrayerror) {
                    System.out.println("Sorry, There is an Error in 2nd Try Block");
                    System.out.println(arrayerror);
                }
            }
            catch (ArrayIndexOutOfBoundsException arrayerror) {
                System.out.println("Sorry, There is an Error in 1st Try Block");
            }
            //FINALLY Executes even if the program shows exception or not
            finally {
                System.out.println("Try-Catch Blocks Ended");
            }
        }

    public static void main(String[] args) {

        BookStore books = new BookStore();
        books.getBooks();

    }
}

/*

//Write a program that allows a user to keep accessing the array until a valid index is given

public class BookStore {

    public void getBooks() {

        String[] book = new String[5];
        book[0] = "Macbeth";
        book[1] = "Romeo and Juliet";
        book[2] = "Oliver Twist";
        book[3] = "Hamlet";
        book[4] = "Twelve Night";

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Enter the Index: ");
            int ind = sc.nextInt();

            try {
                System.out.println("1st Try Block is All Good");
                try {
                    System.out.println(book[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException arrayerror) {
                }
                catch (ArrayIndexOutOfBoundsException arrayerror) {
                    System.out.println("Sorry, There is an Error in 2nd Try Block");
                    System.out.println(arrayerror);
                }
            }
            catch (ArrayIndexOutOfBoundsException arrayerror) {
                System.out.println("Sorry, There is an Error in 1st Try Block");
            }
            System.out.println("Try-Catch Blocks Ended");
            finally{
                System.out.println("Try-Catch Blocks Ended");
            }
        }
        System.out.println("Thanks for using this Program");
    }

    public static void main(String[] args) {

        BookStore books = new BookStore();
        books.getBooks();

    }
}
*/
