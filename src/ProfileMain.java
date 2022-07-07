/**
 * tests the Profile class
 * ProfileMain.java
 * @version 1.0.0
 * @author Amy Estep
 */

public class ProfileMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] interests1 = {"mountain biking","guitar","skiing"};
        String[] interests2 = {"dancing","bowling","netflix"};
        String[] interests3 = {"videogames","shooting","running"};
        String[] groups1 = {"Band","school friends","ski school"};
        String[] groups2 = {"ballet class","bowling group","tv show theories"};
        String[] groups3 = {"gaming society","firearms group","running club"};
        Profile profile1 = new Profile("Bloggs","Adam", 3,5,2003, "joeBloggs@hotmail.com", interests1, groups1);
        Profile profile2 = new Profile("Baker","Ben", 12,1,1995, "janeDoe@outlook.com", interests2, groups2);
        Profile profile3 = new Profile("Bakar","Ben", 8,3,1982, "jackDaniels@gmail.com", interests3, groups3);
        Profile profile4 = new Profile("Chock","James", 8,3,1982, "jackDaniels@gmail.com", interests3, groups3);
        System.out.println(profile1.toString());
        System.out.println(profile2.toString());
        System.out.println(profile3.toString());     

    }
    
}
