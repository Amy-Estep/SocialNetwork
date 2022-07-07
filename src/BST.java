/**
 * BST.java
 * @version 1.0
 * @author Amy Estep - no copyright
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BST {

    public static BSTNode root;
    public ArrayList<BSTNode> nodes = new ArrayList<BSTNode>();

    /**
     * creates a BSTnode
     */
    public BST() {
        BST.root = null;
    }

    /**
     * adds a profile to the tree
     * @param p the profile to be added to the tree
     * side effects - if theres no root the root is set,
     *                if there is a root then the recursive method is run
     *                the profile is added to the array list of nodes
     */
    public void addProfile(Profile p) {
        BSTNode currentNode = new BSTNode(p);
        if (root == null) {
            root = currentNode;
            nodes.add(root);
        } else {
            recursiveMethod(root, currentNode);
            nodes.add(currentNode);
        }
    }

    /**
     * recursively searches the tree to add a new profile to the tree
     * @param currentNode the current node to be compared to the nodeToAdd
     * @param nodeToAdd the node to be added to the tree
     * @return currentNode the current node in the search
     */
    private BSTNode recursiveMethod(BSTNode currentNode, BSTNode nodeToAdd) {
        if (currentNode == null) {
            currentNode = nodeToAdd;
        }
        if (currentNode.getProfile().getFirstName().compareTo(nodeToAdd.data.getFirstName()) > 0) {
            currentNode.l = recursiveMethod(currentNode.l, nodeToAdd);
        } else if (currentNode.getProfile().getFirstName().compareTo(nodeToAdd.data.getFirstName()) < 0) {
            currentNode.r = recursiveMethod(currentNode.r, nodeToAdd);
        } else if (currentNode.getProfile().getFirstName().compareTo(nodeToAdd.data.getFirstName()) == 0) {
            if (currentNode.getProfile().getLastName().compareTo(nodeToAdd.data.getLastName()) > 0) {
                currentNode.l = recursiveMethod(currentNode.l, nodeToAdd);
            } else if (currentNode.getProfile().getLastName().compareTo(nodeToAdd.data.getLastName()) < 0) {
                currentNode.r = recursiveMethod(currentNode.r, nodeToAdd);
            }
        }
        return currentNode;
    }

    /**
     * prints the first names of the profiles in alphabetical order
     * unless the first name is the same then it prints the last name of that profile
     */
    public void printAlphabeticalASC() {
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        for (int i = 0; i < nodes.size(); i++) {
            firstNames.add(nodes.get(i).getProfile().getFirstName());
            lastNames.add(nodes.get(i).getProfile().getLastName());
        }

        Set<String> uniqueSet = new HashSet<String>();
        List<String> dupesList = new ArrayList<String>();

        Collections.sort(firstNames);
        Collections.sort(lastNames);
        for (int i = 0; i < firstNames.size(); i++) {
            if (uniqueSet.contains(firstNames.get(i))) {
                dupesList.add(firstNames.get(i));
            } else {
                uniqueSet.add(firstNames.get(i));
            }
        }
        for (int i = 0; i < firstNames.size(); i++) {
            if (dupesList.contains(firstNames.get(i))) {
                System.out.println(lastNames.get(i));
            } else if (!dupesList.contains(firstNames.get(i))){
                System.out.println(firstNames.get(i));
            }
        }
    }

}
