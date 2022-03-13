// Author: Lim Jun Yi
// Date: 11 January 2022
// File: Hello World

/* Simple java program that print
    " Hello World"
    to the screen.
*/

class HelloWorld
{   
    // A classic Hello World program
    public static void main (String[] args) 
    {
        System.out.println("Hello World");
        // output: Hello World
    }
}

// Java code: print() vs println()

class demo_print 
{
    public static void main(String[] args)
    {
        // using print(), just print all the arguments into a line
        System.out.print("Welcome");
        System.out.print("To!");
        System.out.print("Java Programming!");
        // output:  WelcomeTo!Java Programming!
    }
}

class demo_println
{
    public static void main(String[] args)
    {
        // using println(), prints each argument and ends the line
        System.out.println("Welcome");
        System.out.println("To!");
        System.out.println("Java Programming!");
        // output:  Welcome
        //          To!
        //          Java Programming!
    }
}

class demo_print_combine
{
    public static void main(String[] args)
    {
        System.out.print("Hello!");
        System.out.println("Hello World!");
        System.out.println("Hello Friends!");
        //output:   Hello!Hello World!
        //          Hello Friends!
    }
}

// use backslash to display symbols (eg: \\ to display \, \" to display ")

// class format_nobackslash
// {
//     public static void main(String[] args)
//     {
//         System.out.println("Hi all's, welcome to "Java Class".");
//         // output:  Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//         //          Syntax error, insert ")" to complete MethodInvocation
//         //          Syntax error, insert ";" to complete BlockStatements
//         //          The method Java(String) is undefined for the type format_nobackslash
//         //          Syntax error on token "Class", ( expected
//         //          at format_nobackslash.main(Untitled-1.java:66)
//     }
// }

class format_backslash
{
    public static void main(String[] args)
    {
        System.out.println("Hi all\'s, welcome to \"Java Class\".");
        // output:  Hi all's welcome to "Java Class".
    }
}

// \t -> It gives a tab between to words.

class format_tab
{
    public static void main(String[] args)
    {
        System.out.println("Good Morning\t KMKt!");
        // output:  Good Morning    KMKt!
    }
}

// \n -> this escape sequence is for a new line.

class format_newline
{
    public static void main(String[] args)
    {
        System.out.println("Good Morning KMKt!\nHow are you all?");
        // output:  Good Morning KMKt!
        //          How are you all?
    }
}