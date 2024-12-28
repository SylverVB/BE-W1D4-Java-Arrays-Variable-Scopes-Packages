public class ScopeDemo {
    
    // Class Scope: This variable is accessible by all methods in the class
    static String classScopeVar = "Class Scope Variable";
    
    // Instance variable (Object Scope): This variable is specific to an object of the class
    String objectScopeVar = "Object Scope Variable";
    
    // Method Scope: This variable is accessible only within the 'displayMethodScope' method
    public void displayMethodScope() {
        String methodScopeVar = "Method Scope Variable";  // Local to the method
        
        System.out.println("Inside displayMethodScope() - " + methodScopeVar); // prints method scope variable
        
        // Block Scope: This variable is specific to the if block below
        if (true) {
            String blockScopeVar = "Block Scope Variable"; // Local to the block
            System.out.println("Inside Block - " + blockScopeVar); // prints block scope variable
        }
        
        // Uncommenting the following line will result in an error, because 'blockScopeVar' is not accessible outside the block
        // System.out.println("Trying to access blockScopeVar outside block - " + blockScopeVar); 
    }

    public static void main(String[] args) {
        // Object Scope: Creating an object of ScopeDemo class to access the object scope variable
        ScopeDemo demoObject = new ScopeDemo();
        
        // Printing Class Scope Variable (accessible directly through the class name)
        System.out.println("Class Scope - " + classScopeVar); // prints class scope variable
        
        // Printing Object Scope Variable (accessible via the object instance)
        System.out.println("Object Scope - " + demoObject.objectScopeVar); // prints object scope variable
        
        // Calling method to display Method Scope and Block Scope
        demoObject.displayMethodScope();
        
        // Uncommenting the following line would result in an error, as 'methodScopeVar' is not accessible outside the method
        // System.out.println("Trying to access methodScopeVar outside method - " + methodScopeVar); 
    }
}