public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root = null;
    }
    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    public Node search(Node root, int key){
        if(root == null || root.key == key)
            return root;
        if(root.key > key)
            return search(root.left, key);
        return search(root.right, key);
    }
    public void insert(int key) {
        root = insertRec(root,key);
    }
    public void search(int key) {
        root = search(root,key);
    }



    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println("phan tu");
        tree.search(40);
    }
}
