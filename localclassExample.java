public class localclassExample {
    private static String message = "Hello World from outer class";

    public static void main(String[] args) {
        localclassExample outer = new localclassExample();
        outer.outerMethod();
    }

    public void outerMethod() {
        class LocalClass {
            void displayMessage() {
                System.out.println("dhoka hai bhai");
            }
        }
        LocalClass local = new LocalClass();
        local.displayMessage();
    }
}