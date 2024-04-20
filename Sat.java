
// Abstract class with a constructor
abstract class Content {
    int a = 0;

    // User-defined constructor with one argument
    public Content() {
        // super();
        System.out.println("545148186515615624");
    }

    // Abstract method (to be implemented by subclasses)
    abstract void multiply(int val);
}

// Derived class that extends Content
class GFG extends Content {
    // Constructor for GFG (calls the parent class constructor)
    GFG() {
        // super(2); // Pass the value 2 to the parent class constructor
        // super();
        // OR   auto call
    }

    // Implement the abstract method from the parent class
    public void multiply(int val) {
        System.out.println(a * val); // Multiply 'a' with the given value
    }

    // Overload the multiply method with an implementation that does not take an
    // input argument
    public void multiply() {
        multiply(1); // Call the multiply method with a default value of 1
    }
}

public class Sat {
    public static void main(String[] args) {
        // Create an object of the abstract class by referencing its derived class
        Content content = new GFG();
        // OR
        // GFG content = new GFG();
        content.multiply(10); // Call the multiply method with a given value
    }
}