class noninner {
    static int data=30;
    class Inner{
        void msg(){
            System.out.println(";;;;Ritik don aadmin hai::::: = "+data);
        }
    }


    public static void main(String[] args) {
        noninner AA=new noninner();             // first we need to excuted ;
        noninner.Inner DD=AA.new Inner();  // Outerclass.Innerclass Name=OuterObj.new Inner();
        DD.msg();
        
        // System.out.println(outer1.data);
    }
}
