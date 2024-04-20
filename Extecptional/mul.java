public class mul {
    public static void main(String[] args) {
        try{
            int a=20,b=2,c;
            c=a/b;
            System.out.println("The value is = "+c);
        }
        catch(Exception e)
        {
            System.out.println("Cannot divide by Zero");
        }

        try{
            int a[]={10,20,5,15,35};
            System.out.println("This array element is = "+a[2]);
        }
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("Size se bahar hai ");
        }
    }
}
