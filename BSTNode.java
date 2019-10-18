/**
 * this class is used to create a node within
 * the tree. It has a reference to a profile,
 * and 2 other refences to other nodes, one to the
 * left and one to the right
 */
public class BSTNode {

    private Profile profile;
    private BSTNode left;
    private BSTNode right;

    /**
     * this constructor creates the node
     * and sets the data
     * @param data a reference to the profile
     *             that is set
     */
    public BSTNode(Profile data){
        setData(data);
    }

    /**
     * this method is used to set data
     * @param data a reference to the profile
     *            that is set
     */
    private void setData(Profile data) {
        this.profile = data;
    }

    /**
     * @return node's profile
     */
    public Profile getProfile() {
        return this.profile;
    }

    /**
     * this method sets the left child
     * for the current node
     * @param left is a reference to
     *             another profile
     */
    public void setL(BSTNode left) {
        this.left = left;
    }

    /**
     * @return the left child
     */
    public BSTNode getL() {
        return left;
    }

    /**
     * this method sets the right child
     * @param right
     */
    public void setR(BSTNode right) {
        this.right = right;
    }

    /**
     * @return the right child
     */
    public BSTNode getR() {
        return right;
    }
}
