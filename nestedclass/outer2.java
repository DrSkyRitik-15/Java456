public class outer2 {
    static int data=30;

    void outerclass(){
        int data=10;
        System.out.println(";;;;::::: = "+data);
    }
    static class Inner{
        // int a=50;
        void innermsg(){
            System.out.println(";;;;Ritik don aadmin  y e  innner wala hai hai::::: = "+data);
        }
    }


    public static void main(String[] args) {
        // outer2.Inner AA=new outer2.Inner();  // good method
        //or
     Inner AA=new Inner();

        outer2 Ac=new outer2();
        Ac.outerclass();
        AA.innermsg();
        // System.out.println(outer1.data);
    }
}
