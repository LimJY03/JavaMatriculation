# **Question 01**

In order to solve a programming problem, the programmer needs to follow the correct problem solving steps. This is to ensure that no errors occur while the program is being run.

What is problem solving?

> It is the process of identifying a problem, developing possible solution paths, and taking the appropriate course of action.

List the first two (2) steps in problem solving.

> Problem Analysis and Design a Solution

Identify the steps in problem solving which involve in the situation.

> | Situation | Step in Problem Solving |
> | --- | :---: |
> | Test the system and record all the problem found. | Testing |
> | The design of pseudocode and flowchart.| Design a Solution |
> | Ahmad is analysing the process of a system that his team needs to develop.| Problem Analysis |

In your opinion, why should the program be tested before delivering it to the user?

> To make sure that the program is error-free (or bug-free) and to ensure that the program meet the user requirement.

Justify one (1) importance of algorithm in problem solving.

> To identify and plan a well-defined step by step description to solve a problem or to identify an effective prosedure for solving a problem.

# **Question 02**

KMS’s Bookstore is doing a End Year sales promotion. Total price will be calculated based on quantity and price of the items. if a customer purchases above RM15.00, the customer will be given 15% discount. Otherwise, 5% discount will be given. Calculate the price that a customer should pay. Based on the given scenario, design the algorithm by using a pseudocode.

> START
> <br>&emsp;INPUT quantity
> <br>&emsp;INPUT itemPrice
> <br>&emsp;totalPrice = quantity * itemPrice
> <br>&emsp;IF totalPrice > 15.0 THEN
> <br>&emsp;&emsp;discount = 0.15 * totalPrice
> <br>&emsp;ELSE
> <br>&emsp;&emsp;discount = 0.05 * totalPrice
> <br>&emsp;ENDIF
> <br>&emsp;finalPrice = totalPrice - discount
> <br>&emsp;PRINT finalPrice
> <br>STOP

Display multiples of 3 from 50 to 300 and add the total of the numbers. Display the total added numbers. Draw a flowchart to solve the above problem.

> ![2122kms - Q2](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2122kms%20-%20Q2.png?raw=true)

# **Question 03**

Write `Java` assignment statements for the following algebraic equations.

1. y = ax² + bx + c

    > `double y = a * Math.pow(x, 2) + b * x + c;`

2. d = (n(n + 1) / 2)²

    > `double d = Math.pow(((n * (n - 1)) / 2), 2);`

Given the following `Java` program segment, answer the questions below.

```java
int a = 10, b = 5;

while(a <= 50){
    a = a + b; 
}

System.out.print(a);
```

State the output(s) of the program segment above.

> ```markdown
> 55
> ```

Rewrite the code using `for` loop.

> ```java
> int b = 5;
> 
> for(int a = 10; a <= 50; a += b){}
> 
> System.out.print(a);
> ```

Rewrite the below `Java` assignments in the correct version.

> | Wrong Version | Corrected Version |
> | --- | --- |
> | `char aChar = 5.5;` | `double aChar = 5.5;` |
> | `if (salesAmount >10 && <50)` | `if(salesAmount > 10 && salesAmount < 50)` |
> | `String aName = ",", anotherName = ".";`<br>`if (aName == anotherName)` | `String aName = ",", anotherName = ".";`<br>`if(aName.equals(anotherName))` |

Assume all the variables have been declared, what is the output of the following code segments?

```java
y = 10;

if (y > 7)
    System.out.print ("AAA");

System.out.print ("BBB");

for (u = 1; u > 3; u = u + 1){
    System.out.print(u + " ");
}

System.out.print("### ");
System.out.println("****");
System.out.print("##");
System.out.print("/n**\n");
```

> ```html
> AAABBB### ****
> ##/n**
> 
> ```

Declare and create an object for a class named `CalcAverage`.

> ```java
> CalcAverage object = new CalcAverage();
> ```

Give the value of following `Java` expressions.

1. `false || 6 > 12 && !(3 == 7)`

    > false

2. `(7 % 5) % 4`

    > 2

Based on the following `Java` code, the purpose of the `Java` code is to calculate the sum of number from 10 to 100 increment by 10. Identify the type of errors and fix the code below.

```java
int counter = 10;
int sum = 0;

while (counter <= 100){
    sum = sum + counter;
    add 10 to counter;
}

System.out.print("Sum of all number is" + sum);
```

> Error Type: Syntax Error
> <br>The line `add 10 to counter` should be `counter += 10`.

Declare a and b as integer variables. Then, initialize a to 10 and b to 20. Write `Java` statement(s) to accomplish the following process.

> ```java
> int a = 10, b = 20;
> ```

A Method named `calcNumbers` that will accept two integer numbers and return:

* The product value if both numbers are odd.
* The total value if both numbers are even.
* The division value if both numbers are not odd or even.

Write a `Java` program segment for the statement above.

> ```java
> double calcNumbers(int n1, int n2){
> 
>     if(n1 % 2 == 1 && n2 % 2 == 1){
>         return n1 * n2;
>     }
>     else if(n1 % 2 == 0 && n2 % 2 == 0){
>         return n1 + n2;
>     }
>     else{
>         return (n1 = 0.0) / n2; 
>     }
> }
> ```

# **Question 04**

Blood pressure reading basically has two numbers, for example 125/85 mmHg. The top number (125) is called systolic while the bottom (85) is called diastolic. Based on these reading, the level of blood pressure of a person can be determined, such as low, ideal, pre-high or high. Write a complete `Java` program that performs the following tasks: 

* Request the reading of blood pressure for systolic and diastolic for `n` persons. Store the data in the arrays named `arrSystolic` and `arrDiastolic` respectively. 
* Find minimum reading of diastolic. 
* Count the number of person that can be categorized as low blood pressure where the reading of systolic is less than 100 and diastolic is less than 60.

> ```java
> import java.util.Scanner;
> 
> class Q4kms{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         int lowCount = 0;
> 
>         System.out.print("Enter number of persons: ");
>         final int n = sc.nextInt();
> 
>         double arrSystolic[] = new double[n], arrDiastolic[] = new double[n], diastolicMin = 999.9;
>         
>         for(int i = 0; i < n; i++){
> 
>             System.out.print("Enter systolic and diastolic blood pressure: ");
>             arrSystolic[i] = sc.nextDouble();
>             arrDiastolic[i] = sc.nextDouble();
> 
>             if(arrDiastolic[i] < diastolicMin){diastolicMin = arrDiastolic[i];}
> 
>             if(arrSystolic[i] < 100 && arrDiastolic[i] < 60){lowCount++;}
>         }
> 
>         System.out.println("The minimum reading of diastolic blood pressure is " + diastolicMin + " mmHg");
>         System.out.println("The number of person categorized as low blood pressure is " + lowCount);
> 
>         sc.close();
>     }
> }
> ```