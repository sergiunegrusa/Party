/**
 * BST class represents a binary search tree
 */

public class BST {

    private BSTNode root;

    /**
     * an empty constructor
     */
    public BST(){

    }

    /**
     * at first, this method sets the root,
     * than, using a recursive algorithm
     * it places in the right spot of the tree
     * the profile
     * @param p is a reference of the profile
     *          we want to place in the BST
     */
    public void insertProfile(Profile p){

        BSTNode profile = new BSTNode(p);

        if(this.root == null){
            this.root = profile;
        }
        else{
            recursiveInsertion(this.root, profile);
        }

    }

    /**
     * this method place the profile we want to
     * put in BST, in the correct spot(in alphabetical order).
     * We use the function compareTo to find out
     * where should the profile go. If the name of the profile
     * comes before or is equal to the root, it goes to the left,
     * otherwise, it goes to the right.
     * @param parent is a reference to the profile's
     *               parent in BST. At first call, the
     *               parent is this.root.
     * @param profile is a reference to the profile
     *                that we want to put in BST
     */
    private void recursiveInsertion(BSTNode parent, BSTNode profile){

        String parentName = parent.getProfile().getName();
        String profileName = profile.getProfile().getName();

        if(profileName.compareTo(parentName) <= 0){
            if(parent.getL() == null){
                parent.setL(profile);
            }
            else {
                recursiveInsertion(parent.getL(), profile);
            }
        }
        else if(profileName.compareTo(parentName) > 0){
            if(parent.getR() == null){
                parent.setR(profile);
            }
            else {
                recursiveInsertion(parent.getR(), profile);
            }

        }
    }

    /**
     *this method prints the content of BST in
     * an alphabetical order using an in order traversal
     */
    public void printAlphabetical(){
        inOrderTraversal(this.root);
    }

    /**
     * this is a recursive method that performs
     * an in order traversal of the BST
     * @param root is areference to the starting node
     */
    private void inOrderTraversal(BSTNode root){
        if(root.getL() != null){
            inOrderTraversal(root.getL());
        }
        System.out.println(root.getProfile().getName());

        if(root.getR() != null){
            inOrderTraversal(root.getR());
        }
    }
}
