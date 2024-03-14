public class StaticVar {
    // Static variable
    private static int staticVar = 10;

    public void instanceMethod() {
        System.out.println("Static variable from instance method: " + staticVar);
    }

    // Main method
    public static void main(String[] args) {
        StaticVar obj = new StaticVar();
        obj.instanceMethod(); // Calling instance method
    }
}