public class AllStaticInstance {
    // Static variable
    static int staticVar = 10;
    
    // Instance variable
    int instanceVar = 20;
    
    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static Variable: " + staticVar);
        
        // Creating an instance to access instance variable
        AllStaticInstance obj = new AllStaticInstance();
        System.out.println("Instance Variable: " + obj.instanceVar);
    }
}
