# **Question 01**

Problem solving is the act of defining a problem, determining the cause of the problem,  dentifying, prioritizing, and selecting alternatives for a solution, and implementing a solution.

> Identify steps for the following explanation.
> 
> | Explanation | Steps |
> | --- | :---: |
> | Showing step by steps to solve the problem. | Design A Solution |
> | Make sure the user satisfy with the output. | Testing |
> | Writing a program. | Implementation |
> | As a guideline to the other programmer. | Documentation |
> | Make the problem statement clearer. | Problem Analysis |

Justify the importance of the second step in solving a problem.

> This step shows the flow and sequence of steps to solve the problem.

Name two (2) examples of languages that can be used in step 3.

> `Java` and `C++`.

Give two (2) ways to perform the last step of problem-solving.

> Using comments in the code, and create separate `.md` or `.txt` files to write documentation.

# **Question 02**

According to the library rules, a student will not be fined if he/she returns the book(s) borrowed within 14 days. Otherwise, the student will be fined 50 cents a book for each day of late return. Calculate and display the amount of fine that a student has to pay, or display a message “Thank you for early return”. Based on the given scenario, design the algorithm using pseudocode.

> Start
> <br>&emsp;Read returnInterval
> <br>&emsp;If(returnInterval < 14)
> <br>&emsp;&emsp;Print "Thank you for early return."
> <br>&emsp;Else
> <br>&emsp;&emsp;fine = 0.5 * bookCount * *returnInterval - 14)
> <br>&emsp;&emsp;Print fine
> <br>&emsp;Endif
> <br>Stop

Ahmad decided to sell a shirt that he just bought to his friend. Determine whether he gains profit or suffers a loss or breaks even (i.e not gaining profit nor loss) from the transaction. Based on the given scenario, design the algorithm using a flowchart.

> ![2122kmk - Q2](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2122kmk%20-%20Q2new.png?raw=true)

# **Question 03**

Declare a variable based on the description of the primitive data type.

1. Use this data type for simple flags that track true/false conditions.

    > `boolean logic;`

2. For decimal values, this data type is generally the default choice.

    > `double realNumber;`

3. It has a minimum value of -2^31 and a maximum value of 2^31 -1.

    > `int intNumber;`

4. It is a single 16-bit Unicode character.

    > `char unicodeCharacter;`

Identify output from the following Java statements.

```java
class Value {

    public static void main (String[] args) {

        int[] num = {1,3,5,7};
        num[0] = 9;
        num[3] = num[1];
        num[0] = num[0] + num[3];

        System.out.print(num[0]); // Output 1

        y = 15;

        if(y < 20){
            if(y < 10)
                x = 5 * y;
            else
                x = 2 * y;
        }
        else
            x = 3 * y;

        System.out.print(x); // Output 2
    }
}
```

> ```markdown
> 12
> 30
> ```

Evaluate the following.

1. `System.out.print(10 / 3 + 8 % 5 / 2);`

    > 4

2. `System.out.print(2.5 * (2%3) + 10/6);`

    > 6.0

3. `System.out.print(7 – 3 + 2 * 7 / 3 * 2);`

    > 12

Convert the following expressions into the Java statements.

*x* = 4(*a+b*) / 2*c*(2*a*-1)

> ```java
> double x = (4 * (a + b)) / (2 * c * (2 * a - 1));
> ```
</br>

![q2](https://media.discordapp.net/attachments/975199225036034088/975589807134765086/unknown.png)

> ```java
> double r = (-Math.pow(b, 35) + Math.pow(4 * a * c, 0.2)) / (2 * Math.sqrt(a));
> ```

Construct expression in correct syntax for the following.

1. Declare `grade` and `mark`. Assign `grade` to 'A' if the `mark` is greater than 80.

    > ```java
    > char grade;
    > double mark;
    >
    > if(mark > 80)
    >     grade = 'A';
    > ```

2. Define a class named `MyClass` as public

    > ```java
    > public class MyClass{}
    > ```

3. Declare variable named `marks` and assign 97.5 to it.

    > ```java
    > double marks = 97.5;
    > ```

4. Create an object from the class `MyObject`.

    > ```java
    > MyObject obj = new MyObject();
    > ```

5. Declare a named constant `RATE` to store 0.125.

    > ```java
    > final double RATE = 0.125;
    > ```

Assuming the input is 3 7 9 5 8 6 0 2 -1, show output from the following program segment.

```java
double sum = 0, avg = 0; 
int bil = 0;

int num = sc.nextInt();

while(num >= 0){

    sum = sum + num;
    bil++;
    num = sc.nextInt();
}

avg = sum / bil;

System.out.print("The average is " + avg);
```

> ```markdown
> The average is 5.0
> ```

Accept two integers from the user and determine whether both numbers have opposite signs: that is, one of the numbers is positive and the other is negative. Produce an appropriate message. Construct a program segment for the above problem.

> ```java
> System.out.print("Enter two integers separated by white space.");
> 
> if(sc.nextInt() * sc.nextInt() < 0){
>     System.out.println("Both integers have opposite signs.");
> }
> else{
>     System.out.println("Both integers have same signs.");
> }
> ```

Produce the following output by using a `while` loop.

```markdown
21 18 15 12 9 6 3 STOP
```

> ```java
> for(int i = 21; i > 0; i -= 3){
> 
>     System.out.print(i + "\t");
> }
> 
> System.out.println("STOP");
> ```

Write the output from the program segment below.

```java
int p = 5;

while(p > 2){

    if(p % 3 == 0)
        System.out.println(p + " is divisible by 3.");
    else if(p % 5 == 0)  
        System.out.println(p + " is divisible by 5.");
    else if(p % 7 == 0)  
        System.out.println(p + " is divisible by 7.");
    else  
        System.out.println(p + " is not divisible.");

    p--;
}
```

> ```markdown
> 5 is divisible by 5.
> 4 is not divisible.
> 3 is divisible by 3.
> ```

# **Question 04**

Create a `Java` program to read `n` students names and their mark respectively into two arrays `name` and `mark`. Find the highest mark with name and the average mark of all students.

> ```java
> import java.util.Scanner;
> 
> class Q4{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         double markHighest = 0.0, markAverage = 0.0, markSum = 0.0;
>         String nameHighest = "";
> 
>         System.out.print("Enter number of students: ");
>         int n = sc.nextInt();
> 
>         double[] mark = new double[n];
>         String[] name = new String[n];
> 
>         for(int i = 0; i < n; i++){
> 
>             System.out.print("Enter student name: ");
>             name[i] = sc.next();
>             System.out.print("Enter mark for " + name[i] + ": ");
>             mark[i] = sc.nextDouble();
> 
>             if(mark[i] > markHighest){
> 
>                 markHighest = mark[i];
>                 nameHighest = name[i];
>             }
> 
>             markSum += mark[i];
>         }
> 
>         markAverage = markSum / n;
> 
>         System.out.println(nameHighest + " has the highest mark of " + markHighest + ".");
>         System.out.println("The average marks is " + markAverage);
> 
>         sc.close();
>     }
> }
> ```