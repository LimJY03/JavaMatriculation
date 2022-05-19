# **Question 01**

Librarian of Munsyi Abdullah library at KMPk decided to develop an eMunsyi application to allow their students to search book catalogues, check book status and borrow books while using mobile applications. 

Based on the given scenario, Identify the correct steps for problem solving.

> 1. Problem Analysis
> 2. Design a Solution
> 3. Implementation
> 4. Testing
> 5. Documentation

Justify one (1) importance of **documentation** for programmers.

> Enhance code readability that aids other programmers to edit and maintain the program in the future.

Considering the following pseudocode, identify the input, process and output.

```markdown
Start
    Set total borrow to zero
    Input eMunsyi code
    While eMunsyi code not equal to 0
        Input book serial number
        add 1 into total borrow
        Input eMunsyi code
    End while
    Print the total borrow
Stop
```

> **INPUT**
> 
> * eMunsyi code
> * book serial number
> 
> **PROCESS**
> 
> * Repeatedly input book serial number until user enters 0.
> * Add 1 into total borrow.
> 
> **OUTPUT**
> 
> * total borrow

State the control structure used in the above algorithm.

> Sentinel-Repetition Control Structure

# **Question 02**

A programmer is responsible for creating a program that displays a student's performance. A student's performance is summarised in the table below. Use the appropriate control structure to display the performance when a user enters a mark.

| Mark | Performance |
| :---: | :---: |
| 80 - 100 | Excellent |
| 50 - 79 | Average |
| 0 - 49 | Weak |

Based on the scenario, write a pseudocode.

> START
> <br>&emsp;READ mark
> <br>&emsp;IF mark >= 80 && mark <= 100 THEN
> <br>&emsp;&emsp;PRINT "Excellent"
> <br>&emsp;ELSE IF mark >= 50 THEN
> <br>&emsp;&emsp;PRINT "Average"
> <br>&emsp;ELSE
> <br>&emsp;&emsp;PRINT "Weak"
> <br>&emsp;END IF
> <br>STOP

Fain intends to build a programme that adds the sums of even numbers from 50 to 500. A total sum should be displayed in the program. Draw a flowchart to assist Fain in solving the problem.

> ![2122kmpk - Q2](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2122kmpk%20-%20Q2.png?raw=true)

# **Question 03**

Assign value in variable `a` of type `int` into variable `z` of type `double`, then assign `z` into the variable `x` of type `int`.

> ```java
> double z = a;
> int x = (int)z;
> ```

Give the output of the following `Java` segment.

```java
int num = 0;
num = num + 5;
num = num / 10;
System.out.print(num);
```

> ```markdown
> 0
> ```

Suppose `a`, `b` and `c` are integer variables with values 4, 8 and 12. Output the contents of integer variable, `d` based on the following expressions.

1. `d = (a + b) - b;`

    > 4

2. `d = Math.pow(a, b) + c;`

    > Error: Cannot convert double into int

3. `d = c % a / b + a * b;`

    > 32

4. `d = (b / a) + a * c / c;`

    > 6

Trace the error(s) and rewrite the correct code for the following `Java` codes.

```java
1.  if(number % 2 = 0){
2.      System.out.println(number + " is an odd number");
3.  }
4.  else if{
5.      System.out.println(number, " is an even number");
6.  }
```

> | Line | Error | Correction |
> | :---: | --- | --- |
> | 1 | `if(number % 2 = 0)` | `if(number % 2 != 0)` |
> | 4 | `else if` | `else`|
> | 5 | `System.out.println(number, " is an even number");` | `System.out.println(number + " is an even number"`)

Give the output of the following program segment if the input is 

&emsp;35, Y, 100.70, Y, 70, Y, 55, Y, 60.5, N

```java
char answer = 'Y';
double price, total_price = 0;

while (answer != 'N'){
    price = kmpk.nextDouble();
    total_price = total_price + price;
    answer = kmpk.next().charAt(0);
}

total_price = 0.90 * total_price;

System.out.println("Total price = " + total_price);
```

> ```markdown
> Total price = 289.08
> ```

Write a program segment using `for` to sum all numbers divisible by 7 from 71 to 177 and display the sum.

> ```java
> int sum = 0;
> 
> for(int i = 71; i <= 177; i++){
> 
>     if(i % 7 == 0){sum += i;}
> }
> 
> System.out.println("Sum = " + sum);
> ```

Rewrite the following program segment into `while` coding and state its output.

```java
public static void main(String[] args){

    int i;
    int z = 5, y = 0, x = 2;

    for(i = 1; i < 4; i++){

        y = (z * x) + 15;
        z = y + 2;
    }

    System.out.print(z);
}
```

> ```java
> public static void main(String[] args){
> 
>     int i = 1, z = 5, y = 0, x = 2;
> 
>     while(i < 4){
> 
>         y = (z * x) + 15;
>         z = y + 2;
> 
>         i++;
>     }
> 
>     System.out.print(z);
> }
> ```

Write a `Java` program for a class named `HighestClass` to find the highest mark from an array. the class shall contain the `main` method and `findHighest` methods.

1. In `main` method:

    * Enter `n` (number of students)
    * Declare and create an integer array named `mark[n]`
    * Use a loop statement to input `mark[i]`
    * Assign the value returned by method `findHighest` to a variable named `resultHighest`.
    * Display `resultHighest`.

2. The `findHighest` method shall:

    *  use a loop statement to determine the maximum value.
    *  receive an integer array of values `m` through its parameter.
    *  return the highest.

> ```java
> import java.util.Scanner;
> 
> class HighestClass{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         HighestClass array = new HighestClass();
>         int n = 0;
>         double resultHighest = 0.0;
> 
>         System.out.print("Enter number of students: ");
>         n = sc.nextInt();
> 
>         double[] mark = new double[n];
> 
>         for(int i = 0; i < n; i++){
> 
>             System.out.print("Enter mark for student #" + (i + 1) + ": ");
>             mark[i] = sc.nextDouble();
>         }
> 
>         resultHighest = array.findHighest(mark);
> 
>         System.out.println("The highest result is " + resultHighest);
> 
>         sc.close();
>     }
> 
>     double findHighest(double[] m){
> 
>         double highest = 0.0;
> 
>         for(int i = 0; i < m.length; i++){
> 
>             if(m[i] > highest){highest = m[i];}
>         }
> 
>         return highest;
>     }
> }
> ```