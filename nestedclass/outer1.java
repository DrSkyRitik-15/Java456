 class outer1 {
    static int data=30;
    static class Inner{
        void msg(){
            System.out.println(";;;;Ritik don aadmin hai::::: = "+data);
        }
    }


    public static void main(String[] args) {
        outer1.Inner AA=new outer1.Inner();
        // or
        // outer1.Inner AA=new Inner();
        AA.msg();
        
        System.out.println(outer1.data);
        System.out.println(data);
    }
}
