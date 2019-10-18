import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * this class is used to read data from a file, create Profile
 * objects and a BST with references to those profiles
 */
public class FileReader {

    /**
     * this method reads the files and populate the tree
     * @param filename is areference to the file we are working with
     * @return a populated BST
     */
    public static BST readProfileSet(String filename){
        File input = new File(filename);
        Scanner in = null;

        try{
            in = new Scanner(input);
        }catch (FileNotFoundException e){
            System.out.println("File can't be opened!");
            System.exit(0);
        }
        return insertProfiles(in);
    }

    /**
     * this method creates a BST and insert the profiles in it
     * @param in is a reference to the Scanner of the file
     * @return a populated BST
     */
    private static BST insertProfiles(Scanner in){
        BST tree = new BST();

        while(in.hasNextLine()){
            String curLine = in.nextLine();
            Scanner line = new Scanner(curLine);
            tree.insertProfile(constructProfiles(line));
        }
        return tree;
    }

    /**
     * this method is used to construct the profiles
     * @param line is a reference to the scanner
     * @return the profile
     */
    private static Profile constructProfiles(Scanner line){
        line.useDelimiter(",");

        String lastName = line.next();
        String fistName = line.next();
        int dayOfBirth = line.nextInt();
        int monthOfBth = line.nextInt();
        int yearOfBirth = line.nextInt();
        String town = line.next();
        String country = line.next();
        String nationality = line.next();
        String email = line.next();

        line.skip(",");

        String interests = line.nextLine();

        Scanner inter = new Scanner(interests);
        inter.useDelimiter(";");

        Profile p = new Profile(lastName, fistName, dayOfBirth, monthOfBth, yearOfBirth, town, country,
                nationality, email,  constructInterests(interests));
        System.out.println(p.toString());

        return p;
    }

    /**
     * this method is used to count the number of interests
     * each profile have, in order to create the array of interests
     * @param interests a string of interests with ";" between them
     * @return the number of interests the current profile have
     */
    private static int numberOfInterests(String interests){
        Scanner in = new Scanner(interests);
        in.useDelimiter(";");

        int num = 0;
        while(in.hasNext()){
            in.next();
            num++;
        }
        return num;
    }

    /**
     * this method creates the array of profile's interests
     * @param interests a string of interests with ";" between them
     * @return an array containing the interests
     */
    private static String[] constructInterests(String interests){
        String[] interest = new String[numberOfInterests(interests)];
        Scanner in = new Scanner(interests);
        in.useDelimiter(";");

        int i = 0;
        while (in.hasNext()){
            interest[i] = in.next();
            i++;
        }
        return interest;
    }

}
