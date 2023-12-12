package lab30.F;

public class F {
    public static Node[] getMin(Node[] a){
        Node min1 = a[0];
        Node min2 = a[1];
        if(min2.getValue()<min1.getValue()){
            min1 = a[1];
            min2 = a[0];
        }
        for(int i = 2; i<a.length; i++){
            if(a[i].getValue()<min1.getValue()){
                min2 = min1;
                min1 = a[i];
            }else if(a[i].getValue()<min2.getValue()){
                min2 = a[i];
            }
        }
        Node[] b = new Node[]{min1, min2};
        return b;
    }

    public static int Find(Node[] a, Node b){
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] n = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
        Node[] a = new Node[n.length];
        for(int i =0;i<n.length;i++){
            Node newn = new Node();
            newn.setValue(n[i]);
            a[i]=newn;
        }
        Node f = new Node();
        while(a.length>1){
            try {
                Node[] k = getMin(a);
                System.out.println(k[0].toString()+" "+k[1].toString());
                Node[] m = new Node[a.length - 1];
                Node nn = new Node();
                nn.setValue(k[0].getValue() + k[1].getValue());
                nn.setRightChild(k[1]);
                nn.setLeftChild(k[0]);
                m[0] = nn;
                int r = 1;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == k[0] | a[i] == k[1]) {
                        r -= 1;
                    } else {
                        m[i + r] = a[i];
                    }
                }
                a = m;
            }catch (Exception ex){
                System.out.println(a.length);
                for(Node i: a){
                    System.out.println(i);
                }
                return;
            }
        }
        Tree mm = new Tree();
        mm.rootNode = a[0];
        mm.printTree();
    }
}
