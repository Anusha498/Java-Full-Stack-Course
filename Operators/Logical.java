public class Logical {
    public static void main(String[] args){
        int l = 5;
        int m = 10;
        int n = 3;
        int o = 7;
        boolean resultAND = l>m && n>0; //T && F->F
        System.out.println(resultAND);
        boolean resultOR = l>m || n>o; //T || F->T
        System.out.println(resultOR);
        boolean resultNOT = l>m; // T
        System.out.println(!resultNOT); // T->F
    }

}
