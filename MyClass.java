public class MyClass {
    // Instance variables
    private int instanceVar1;
    private String instanceVar2;

    // Constructor
    public MyClass(int instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    // Static method with instance passed as argument
    public static void printInstanceVariables(MyClass obj) {
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

    // Static method with instance created inside the method
    public static void printInstanceVariables() {
        MyClass obj = new MyClass(42, "Hello");
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

    // Main method
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10, "World");

        // Calling static method with instance passed as argument
        printInstanceVariables(obj1);

        // Calling static method creating an instance inside the method
        printInstanceVariables();
    }
}