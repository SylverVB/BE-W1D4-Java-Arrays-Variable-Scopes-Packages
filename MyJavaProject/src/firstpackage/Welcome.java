// Create a new Java Project in your favorite IDE and follow along with the examples.
// Create a firstpackage. Add a class named Welcome
// Create a new package named secondpackage
// Add a class named SecondClass in secondpackage with a public instance method that prints the following output: "Method in secondpackage successfully called!""
// In the Welcome class, import SecondClass by adding the following line of code: import secondpackage.SecondClass;
// In Welcome's main method, create an object of SecondClass and use it to call the method you created.


// File: firstpackage/Welcome.java
// Package declaration
package firstpackage;

// Import secondpackage to use SecondClass
import secondpackage.SecondClass;

class Welcome {
    public static void main(String[] args) {
        // Create an object of SecondClass
        SecondClass secondClassObj = new SecondClass();
        
        // Call the method from SecondClass using the created object
        secondClassObj.displayMessage();
    }
}