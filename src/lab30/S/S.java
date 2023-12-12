package lab30.S;

public class S {
    public static void main(String args[]){
        Tree a = new Tree();
        a.insertNode(5);
        a.insertNode(4);
        a.insertNode(2);
        a.insertNode(1);
        a.insertNode(3);
        a.insertNode(10);
        a.insertNode(9);
        a.insertNode(7);
        a.insertNode(8);
        a.insertNode(11);
        a.insertNode(12);
        a.printTree();
        a.deleteNode(4);
        a.printTree();
        a = null;
        System.gc();
    }
}
