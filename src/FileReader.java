/**
 * FileReader.java
 * @version 1.0
 * @author Amy Estep - no copyright
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileReader {

    /**
     * empty constructor
     */
    public FileReader() {
    }
    
    /**
     * takes the line of the file and creates a profile object using the contents of current line of the file
     * @param in the scanner of the current line of the file
     * @return newProfile the created Profile object
     */
    public static Profile readProfile(Scanner in) {
        String data = in.nextLine();
        String[] splitData = data.split(",");
        Profile newProfile = new Profile(splitData[0], splitData[1], Integer.parseInt(splitData[2]),
                Integer.parseInt(splitData[3]), Integer.parseInt(splitData[4]), splitData[5], splitData[6].split(";"),
                splitData[7].split(";"));
        return newProfile;
    }
    
    /**
     * Reads the data file used by the program and returns the constructed tre
     * of profile objects
     * @param in the scanner of the file
     * @return the tree represented by the profiles in data file
     */
    private static BST readLineByLine(Scanner in) {
        BST tree = new BST();
        while (in.hasNext()) {
            String data = in.nextLine();
            Scanner line = new Scanner(data);
            tree.addProfile(readProfile(line));
        }
        in.close();
        return tree;
    }

    /**
     * opens the file with the profiles in it
     * @param filename the name of the file
     * @return the tree of profiles from the file
     * @throws java.io.FileNotFoundException if the file is not found
     */
    public static BST readProfileSet(String filename) throws FileNotFoundException {
        File inputFile = new File(filename);
        Scanner in = new Scanner(System.in);
        try {
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find " + filename);
            System.exit(0);
        }
        return FileReader.readLineByLine(in);
    }
    
}
