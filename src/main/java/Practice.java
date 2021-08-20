import java.util.*;

//simple instructions to automatically create a folder in the Java folder

import java.io.File;

public class Practice
{
    public static void main(String args[])
    {
        String dir = "Users/hamza/Java/JavaPractice/Folder";
        File file = new File(dir);
        boolean isFileCreate = file.mkdirs();
        if (isFileCreate == true)
        {
            System.out.println("New Folder is Created");
        }
        else
        {
            System.out.println("New Folder is not Created");
        }
    }
}














