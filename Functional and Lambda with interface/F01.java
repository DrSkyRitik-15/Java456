interface Drawable{
    public void draw();  // abtract method 
}

public class F01 {
   public static void main(String[] args) {
    int width=10;

    Drawable d2=()->{System.out.println("Dwaing "+width);};
    d2.draw();
   }
    
}