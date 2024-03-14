public class MyClass {
    // Static variables...
    private static int staticVar1;
    private static String staticVar2;

    // Instance variables...
    private int instanceVar1;
    private String instanceVar2;

    // Static methods
    public static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {
        // Accessing static variables and methods
        staticVar1 = 10;
        staticVar2 = "Hello";
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
        staticMethod1();
        staticMethod2();

        // Creating an instance of MyClass
        MyClass obj = new MyClass();

        // Accessing instance variables and methods
        obj.instanceVar1 = 20;
        obj.instanceVar2 = "World";
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}