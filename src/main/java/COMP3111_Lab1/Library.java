/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package COMP3111_Lab1;

public class Library {
	
	public static void main(String arg[]) {
		// System.out.println("Hello, World!");		-> Exercise 1
		
		// Exercise 3
		Library lib = new Library();
		if (lib.someLibraryMethod())
			System.out.println("Hello, World!");
	}
	
    public boolean someLibraryMethod() {
        return true;
    }
}
