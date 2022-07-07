/**
 * BSTNode.java
 * @version 1.0
 * @author Amy Estep - no copyright
 */

public class BSTNode<T> {
    BSTNode<T> l;
    BSTNode<T> r;
    Profile data;

    public void setLeft(BSTNode<T> l) {
        this.l = l;
    }

    public void setRight(BSTNode<T> r) {
        this.r = r;
    }

    /**
     * @return l the left node
     */
    public BSTNode<T> getLeft() {
        return l;
    }

    /**
     * @return r the right node
     */
    public BSTNode<T> getRight() {
        return r;
    }
    
    /**
     * @param data associating the node to the BSTnode
     */
    public BSTNode(Profile data){
        this.data = data;
        r = null;
        l = null;
    }
    
    /**
     * @return data the profile associated with this node
     */
    public Profile getProfile() {
        return data;
    } 
}
