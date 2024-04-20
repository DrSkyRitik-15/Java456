public class catchmultiple {
    public static void main(String[] args) {
        try {
            int a=10,b=2,c;
            c=a/b;   // esme aaya to  koi aur nahi chalega
            System.out.println(c);
            int arr[]={10,20,60,50};
            System.out.println(arr[0]);
            
            // String str="ritik";
            String str=null;// all expection de raha hai
            System.out.println(str.toUpperCase());
    }
    catch(ArithmeticException e){
        System.out.println("Arithmetic error=========");
    }
    catch(ArrayIndexOutOfBoundsException b){
        System.out.println("Error in array index");
    }
    catch(NumberFormatException c)
    {
        System.out.println("Number expection");
    }
    catch(Exception d)
    {
        System.out.println("All Exception");
    }
}
}