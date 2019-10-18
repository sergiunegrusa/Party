import java.util.Scanner;

public class FileReaderMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String filename = in.nextLine();

        BST tree = FileReader.readProfileSet(filename);
    }
}
