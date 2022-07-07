/**
 * FileReader.java
 * tests the FileReader class works
 * @version 1.0
 * @author Amy Estep - no copyright
 */

import java.io.FileNotFoundException;

public class FileReaderMain {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileReader.readProfileSet("test.txt");
    }
    
}
