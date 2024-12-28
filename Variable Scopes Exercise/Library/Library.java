public class Library {
    // Instance variables
    public String name = "Default Library Name";
    public int numOfBooksAvailableInLibrary = 100;

    // Static variables
    public static int numOfOpenLibraries = 0;
    public static int numOfBooksAvailableInDistrict = 0;

    // Instance methods
    public void loanBook() {
        // Decrement the instance variable's value
        numOfBooksAvailableInLibrary--;

        // Decrement the static variable's value
        Library.numOfBooksAvailableInDistrict--;

        // Print some output
        System.out.println("A book was rented out from " + name);
    }

    public void openToPublic() {
        // Increment the static variable's value
        Library.numOfOpenLibraries++;

        // Update the static variable's value
        Library.numOfBooksAvailableInDistrict += numOfBooksAvailableInLibrary;

        // Print some output
        System.out.println(name + " is now open to the public!");
    }

    // Static method
    public static void checkDistrictLibraryStatus() {
        System.out.println("There are " + numOfOpenLibraries + " libraries open right now, and there are " 
                           + Library.numOfBooksAvailableInDistrict + " books available throughout the district.");
    }
}