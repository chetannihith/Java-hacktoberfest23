// Add two numbers in Java using command line arguments

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Get the command line arguments.
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Add the two numbers.
        int sum = num1 + num2;

        // Print the result to the console.
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

// ------------------------------------------------------------------------------------------------------
/*
To compile and run this program, you can use the following commands in the terminal/console:

1. javac AddTwoNumbers.java --> (promt to compile the file)
2. java AddTwoNumbers 10 20     --> (prompt to run)

This will print the following output to the console: " The sum of 10 and 20 is 30 "

💡 You can also use command line arguments to pass more than two numbers to the program.
For example, to add three numbers, you can use the following command:
java AddTwoNumbers 10 20 30

This will print the following output to the console:
" The sum of 10 and 20 and 30 is 60 "

*/
// ------------------------------------------------------------------------------------------------------

// Happy Coding 👨🏽‍💻