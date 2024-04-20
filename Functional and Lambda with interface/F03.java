
 interface Addable {
   int add(int a,int b);
    
}
public class F03 {
    public static void main(String[] args) {
        Addable ad =(a,b)->(a+b);
        System.out.println(ad.add(50,20));//40



        Addable ad2=(int a,int b)->{
            return a+b;
        };
        System.out.println(ad2.add(20,60));
    }
}
