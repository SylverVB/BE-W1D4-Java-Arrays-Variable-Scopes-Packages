// Exercise:

// Write a Java program that demonstrates the following concepts with respect to Arrays (you may use the same array to demonstrate more than one concept, for example you may use one array to demonstrate both "array of objects" and "multidimensional arrays"):

//     • Show two different ways to declare arrays
//     • Show two different ways to initialize arrays
//     • Iterate through an array using a standard for loop
//         Also iterate through an array using for-each
//     • Create an array of objects
//     • Create a multidimensional array

public class ArrayExamples {

    public static void main(String[] args) {
        // 1. Two different ways to declare arrays
        int[] array1;                // Declaration style 1
        int array2[];                // Declaration style 2

        // 2. Two different ways to initialize arrays + shorthand
        array1 = new int[]{1, 2, 3, 4, 5};          // Explicit initialization with predefined values
        array2 = new int[5];                        // Declare array with default values (all elements  initialized to 0)
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;                      // Assign values manually to each element
        }
        int[] array3 = {1, 2, 3, 4, 5};             // Shorthand initialization: declare and initialize in one step

        // 3. Iterate through an array using a standard for loop
        System.out.println("Using standard for loop:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // Iterate using for-each loop
        System.out.println("Using for-each loop:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 4. Create an array of objects
        System.out.println("Array of objects:");
        String[] names = {"Alice", "Bob", "Charlie"}; // Array of Strings
        for (String name : names) {
            System.out.println(name);
        }

        // 5. Create a multidimensional array
        System.out.println("Multidimensional array:");
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}