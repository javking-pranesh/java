import java.util.*;

class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Bst{
    Node root=null;
    Node insert(Node root, int data){
        Node newNode= new Node(data);
        if(root == null){
            return newNode;
        }
        if(data<root.data){
            root.left= insert(root.left, data);
        }
        else if(data>root.data){
            root.right = insert(root.right, data);

        }
        return root;

    }

    void inorder(Node root){
        if( root!= null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
     void preorder(Node root){
        if( root!= null){
          
            System.out.print(root.data+" ");
           preorder(root.left);
            preorder(root.right);
        }
    }
     void postorder(Node root){
        if( root!= null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    Node findMax(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bst tree= new Bst();
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = in.nextInt();
        }

        for(int i=0;i<5;i++){
            tree.root = tree.insert(tree.root, arr[i]);
        }
        System.out.println("Inorder");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("Preorder");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("Postorder");
        tree.postorder(tree.root);
        System.out.println();
        System.out.println("Min Element: "+ tree.findMin(tree.root).data);
        System.out.println("Max Element: "+ tree.findMax(tree.root).data);

    }
}