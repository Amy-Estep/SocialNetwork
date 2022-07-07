/**
 * BSTNodeMain.java
 * tests that theBSTNode class works
 * @version 1.0
 * @author Amy Estep - no copyright
 */

public class BSTNodeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] interests1 = {"mountain biking","guitar","skiing"};
        String[] groups1 = {"Band","school friends","ski school"};
        Profile profile1 = new Profile("Bloggs","Adam", 3,5,2003, "joeBloggs@hotmail.com", interests1, groups1);
        BSTNode node1 = new BSTNode(profile1);
        System.out.println(node1.getProfile().toString());
        
    }
    
}
