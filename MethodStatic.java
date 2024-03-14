public class MethodStatic {

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // Calling static method directly
        staticMethod();

        // Creating an instance of the class
        MethodStatic obj = new MethodStatic();

        // Calling instance method using the object
        obj.instanceMethod();
    }
}