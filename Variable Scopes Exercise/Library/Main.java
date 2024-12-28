class Main {
    public static void main(String[] args) {
        // Create two library objects
        Library library1 = new Library();
        Library library2 = new Library();

        // Open libraries to the public
        library1.openToPublic();
        library2.openToPublic();

        System.out.println("------ Library 1 Information ------");
        System.out.println(library1.name);
        System.out.println(library1.numOfBooksAvailableInLibrary);

        System.out.println("------ Library 2 Information ------");
        System.out.println(library2.name);
        System.out.println(library2.numOfBooksAvailableInLibrary);

        System.out.println("------ Loan Out Books ------");
        library1.loanBook();
        library2.loanBook();
        library2.loanBook();

        System.out.println("------ Library Class's Information ------");
        Library.checkDistrictLibraryStatus();
    }
}