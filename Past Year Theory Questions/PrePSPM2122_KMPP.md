# **Question 01**

Identify the steps in problem solving based on the given statements.

> | Statement | Step in Problem Solving |
> | --- | :---: |
> | Change the value of a variable a few times to ensure that the formula is correct. | Testing |
> | Make a simple explanation on the codes. | Documentation |
> | Programmers determine type of control structure to identify process. | Problem Analysis |
> | Write a pseudocode to find the largest number from three different numbers entered by user. | Design a Solution |

MYShop gives a RM30 voucher to customers for every RM300 purchase. Calculate the value of vouchers Datin Halimah will get if she goes shopping at MYShop on the first day of May. State the input, process and output involved in this transaction.

> **INPUT**
> 
> * `totalPurchase`
> 
> **PROCESS**
> 
> * Determine `voucherCount` based on `totalPurchase`.
> 
> **OUTPUT**
> 
> * `voucherCount`

Get two numbers from the user and display the larger number. State the input, process and output of this program.

> **INPUT**
> 
> * `num1`
> * `num2`
> 
> **PROCESS**
> 
> * Determine `larger` based on `num1` and `num2`.
> 
> **OUTPUT**
> 
> * `larger`

# **Question 02**

Identify the control structure based on the given description.

1. *Continuous checking of user data enters until an acceptable entry is made, such as a valid password; counting and accumulating running totals; and recurrent acceptance of input data and recalculation of output values that only end when a designated value is entered.*

    > Sentinel-Controlled Repetition Control Structure

2. *Conditional statements are features of a programming language, which perform different computations or actions depending on whether a programmer-specified Boolean condition evaluates to true or false.*

    > Selection Control Structure

SukaHati Company offers an incentive for Hari Raya Aidilfitri to the staff as follows: 

| Work Experience | Monthly Sales | Incentive |
| :---: | :---: | :---: |
| 5 years and above | RM50000 and above | RM10000 |
| 5 years and above | Less than RM50000 | RM5000 |
| Others | Not Specified | RM2000 |

Write a pseudocode to calculate the incentives that will be received by the employee.

> START
> <br>&emsp;INPUT monthlySales
> <br>&emsp;INPUT workXp
> <br>&emsp;IF monthlySales >= 50000 && workXp >= 5 THEN
> <br>&emsp;&emsp;incentive = 10000
> <br>&emsp;ELSE IF workXp >= 5 THEN
> <br>&emsp;&emsp;incentive = 5000
> <br>&emsp;ELSE
> <br>&emsp;&emsp;incentive = 2000
> <br>&emsp;ENDIF
> <br>STOP

Draw a flowchart for a program that asks the user for the number of children in each family. If the number of children is larger than three, the computer will calculate the total of a large family. When the user enters -1, the program will stop and display the total of the large family with the message "Family needs MPV."

> ![2122kmpp - Q2](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2122kmpp%20-%20Q2.png?raw=true)

# **Question 03**

Write `Java` statements to execute the following tasks:

1. Declare a constant named PRICE, where the value is 40.00.

    > ```java
    > final double PRICE = 40.00;
    > ```

2. Calculate the area of the triangle. area = ½bh

    > ```java
    > double area = 0.5 * b * h;
    > ```

Identify the most suitable primitive data types for the following situations.

1. To store the choice to print the receipt, whether Y (for Yes) or N (for No).

    > `char`

2. To store the value of an average temperature in a week.

    > `double`

3. To perform logical operations, most commonly to determine whether some condition is false.

    > `boolean`

3. To store the COVID-19 cases per 100 people in last 6 months in Malaysia

    > `int`

Construct the following expressions in correct `Java` syntax.

1. a = x³ - 6yz

    > ```java
    > double a = Math.pow(x, 3) - 6 * y * z;
    > ```

2. k = (1 + 2a) / 3 + 4(b + c)(5 - d) / f

    > ```java
    > double k = (1 + 2 * a) / 3 + (4 * (b + c) * (5 - d)) / f;
    > ```

Solve the following expression by analysing the precedence of the respective operator.

1. `(5.0 * (98.4 - 32.0)) / 9.0;`

    > 36.8888888888888889 (double can hold 16 decimal points)

2. `3 + 6 / 2 * 3 - 1 + 2.0;`

    > 13.0

What is the output of the following code?

```java
int t = 10; 

if(t < 15) 
    System.out.print("AAA"); 

System.out.println("BBB");

int b = 1;

while(b > 8){

    System.out.print(b + " ");
    b = b + 2;
}
```

> ```markdown
> AAABBB
> ```

Suppose `target` is a variable of type `int`. Write a program segment that displays "Excellent!" if the value of the variable `target` is greater than 10, otherwise display "Try again!". Assume `sc` as a Scanner object.

> ```java
> int target = 0;
> 
> System.out.print("Enter target: ")
> target = sc.nextInt();
> 
> if(target > 10){
>     System.out.println("Excellent!");
> }
> else{
>     System.out.println("Try again!");
> }
> ```

Convert the `for` loop to a `while` loop without changing the output. Assume all variables have been declared.

```java
int R;

for(int q = 15; q >= 11; q++)
    R = q + 2;

System.out.println(R);
```

> ```java
> int R, q = 15;
> 
> while(q >= 11){
> 
>     R = q + 2;
>     q++;
> }
> 
> System.out.println(R);
> ```

The following `Java` codes contain syntax errors. Rewrite the correct version of each code.

```java
int x = 200;
System.out.println (Value x = , x); //Required output : Value x = 100

/* To output Hello string
System.out.println(Hello);
```

> ```java
> int x = 200;
> System.out.println("Value x = " + x);
> 
> /* To output Hello String */
> System.out.println("Hello");
> ```

# **Question 04**

Construct a non-static user-defined method name statusAchievement, which receives a value from a method call. The method display message “Congratulation, you are among a top achiever ” if sales is greater than RM5000. Otherwise display “Keep working hard”.

> ```java
> void statusAchievement(double sales){
> 
>     if(sales > 5000){
>         System.out.println("Congratulation, you are among a top achiever ")
>     }
>     else{
>         System.out.println("Keep working hard");
>     }
> }
> ```

Answer the following questions based on the figure below.

![q4](https://media.discordapp.net/attachments/975199225036034088/976744910063566848/unknown.png)

Identify the structure of the code based on the figure shown above.

> | Method Structure | Code |
> | --- | --- |
> | User-defined method name | `qMaths` |
> | Example of pre-defined method | `main(String[] args)`<br>`Math.pow(a,b)`<br>`println()` |
> | Argument/arguments | `16,2`<br>`5,2` |
> | Create object for method | `PowDemo objek = new PowDemo();` |
> | Method call | `objek.qMaths(16,2);`<br>`objek.qMaths(5,2);` |

Computer Science Continuous Assessment is determined from several quizzes and practical tests. Write a full `Java` program for n students that can store each student’s name and marks from 2 practical tests in an array name `studID`, `pracOne`, and `pracTwo`. The program will determine the best student of the practical test by comparing the best score of each student. The first line inputs `n` is representing the number of students, followed by n lines, each represents the student’s name, first practical test score, and second practical test score. Display the best student with his/her highest score.

> ```java
> import java.util.Scanner;
> 
> class Q4c{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         int n = 0;
> 
>         System.out.print("Enter number of students: ");
>         n = sc.nextInt();
> 
>         String studID[] = new String[n], nameHighest = "";
>         double pracOne[] = new double[n], pracTwo[] = new double[n], markHighest = 0.0;
> 
>         for(int i = 0; i < n; i++){
> 
>             studID[i] = sc.next();
>             pracOne[i] = sc.nextDouble();
>             pracTwo[i] = sc.nextDouble();
> 
>             if(pracOne[i] > markHighest){
>                 
>                 markHighest = pracOne[i];
>                 nameHighest = studID[i];
>             }
>             if(pracTwo[i] > markHighest){
>                 
>                 markHighest = pracTwo[i];
>                 nameHighest = studID[i];
>             }
>         }
> 
>         System.out.println("Best student is " + nameHighest);
>         System.out.println("Highest score is " + markHighest);
> 
>         sc.close();
>     }
> }
> ```