class Question {
    static int data=12212709;
    static String Name="Ritik singh Kushwaha";
    class Inner{
        void NonStaticmsg(){
            System.out.println("Registration number = "+data);
            System.out.println("Name of the Student = "+Name);
        }
    }
   static class StaticInner{
        void Staticmsg(){
            String Name ="Janun";
            int data=1237545;
            System.out.println("Registration number = "+data);
            System.out.println("Name of the Student = "+Name);
        }
    }


    public static void main(String[] args) {
        Question AA=new Question();
        Question.Inner NNS=AA.new Inner();
        NNS.NonStaticmsg();


        
        Question.StaticInner SSI=new StaticInner();
        SSI.Staticmsg();
        
        // System.out.println(outer1.data);
    }
}
