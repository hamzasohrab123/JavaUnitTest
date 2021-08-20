import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        name = sc.nextLine();

        String rev = "";
        int len = name.length();

        for (int i = len - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);

        }

        if (name.equals(rev)) {

            System.out.println("This word is a Palindrome");
        } else {

            System.out.println("This word is not a Palindrome");
        }


    }
}
