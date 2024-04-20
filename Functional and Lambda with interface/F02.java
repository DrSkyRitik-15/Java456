0
interface Addable{
    int add(int a,int b);
}

class F02{
    public static void main(String[] args) {
        //multiple
        Addable A=(a,b)->(a+b);
        System.out.println(A.add(10,20)) ;//prints 30

        //multiple para meter with data types
        Addable B= (int x,int b)->x+b;
        System.out.println("Sum of = "+B.add(10,80));
    }
}