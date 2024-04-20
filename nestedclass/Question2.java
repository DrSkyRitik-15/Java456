class Question2 {
    static int data=12212709;
    static String Name="Ritik singh Kushwaha";
    class Inner{
        void NonStaticmsg(){
            System.out.println("Registration number = "+data);
            System.out.println("Name of the Student = "+Name);
        }
    }
    public static void main(String[] args) {
        Question2 AA=new Question2();
        Question2.Inner NNS=AA.new Inner();
        NNS.NonStaticmsg();


        
      
        // System.out.println(outer1.data);
    }
}