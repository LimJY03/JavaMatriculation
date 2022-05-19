# **Question 01**

State if the following statements are true or false.

> | Statement | True / False |
> | --- | :---: |
> | An algorithm can be referred as a set of unordered instructions that tells how to solve a particular<br>source. | **False** |
> | In algorithm, Read or Get is used to represent the computer operation that receives an information or<br>input from particular source. | **True** |
> | The following pseudocode is a CORRECT algorithm that gives RM50 bonus only to a salesperson who<br>sells more than 3 items with the total of at least RM1000 in value.<br><br>&emsp;IF itemSold > 3 THEN<br>&emsp;&emsp;bonusGiven = 50<br>&emsp;ENDIF<br>&emsp;IF ValueSold >= 1000 THEN<br>&emsp;&emsp;bonusGiven = 50<br>&emsp;ENDIF  | **False** |
> | The expression `num[1]` designates the first element in an array. | **False** | 
> | A variable is also called an identifier. | **True** | 

Given the following pseudocode:

&emsp;Start
<br>&emsp;&emsp;if (inp <= 5)
<br>&emsp;&emsp;&emsp;Display “ Hye I am “
<br>&emsp;&emsp;&emsp;inp = inp + 5
<br>&emsp;&emsp;endif
<br>&emsp;&emsp;if (inp < 10)
<br>&emsp;&emsp;&emsp;Display “Doraemon”
<br>&emsp;&emsp;Else
<br>&emsp;&emsp;&emsp;Display “Doralin”
<br>&emsp;&emsp;Endif
<br>&emsp;Stop

What is the output if the value of `inp` is:

> | Value of `inp` | Output |
> | :---: | --- |
> | 0 | Hye I am Doraemon |
> | 5 | Hye I am Doralin |
> | 60 | Doralin |

# **Question 02**

&emsp;Begin
<br>&emsp;&emsp;Sum = 0
<br>&emsp;&emsp;While Counter >= 100 then
<br>&emsp;&emsp;&emsp;Sum = Counter
<br>&emsp;&emsp;&emsp;Add 10 to Counter
<br>&emsp;&emsp;EndWhile
<br>&emsp;&emsp;Print “Sum of the Numbers = “,Sum
<br>&emsp;End

The purpose of the above pseudocode is to calculate the sum of number from 10 to 100. Identify the type of errors that occur and write the errors. Hence, rewrite the correct pseudocode.

> Type of Error: Logic Error
> 
> 1. `Counter` is not initialized.
> 2. `Sum` = `Counter`
> 3. `Counter` >= 100
> 
> Corrected Pseudocode:
> 
> &emsp;BEGIN
> <br>&emsp;&emsp;SET Sum = 0
> <br>&emsp;&emsp;SET Counter = 10
> <br>&emsp;&emsp;WHILE Counter <= 100
> <br>&emsp;&emsp;&emsp;Sum = Sum + Counter
> <br>&emsp;&emsp;&emsp;Counter = Counter + 10
> <br>&emsp;&emsp;ENDWHILE
> <br>&emsp;&emsp;PRINT "Sum of the Numbers = ", Sum
> <br>&emsp;END

Convert the following `Java` segment program to `while` structure.

```java
int j = 15, t = 10;

for (int i = 5; i > j; i = i – j)
    t = t + i;

System.out.print(t);
```

> ```java
> int i = 5, j = 15, t = 10;
> 
> while(i > j){
> 
>     t -= i;
>     i -= j;
> }
> 
> System.out.print(t);
> ```

Trace the output of the above code segment.

> ```markdown
> 10
> ```

# **Question 03**

Write `Java` statement(s) that accomplish the following:

1. Write a constant declaration holds the value of `PI`.

    > ```java
    > final double PI = 3.141592653;
    > ```

2. Declare and initialize a variable `temp` to 10 and variable `ch` to ‘A’.

    > ```java
    > int temp = 10;
    > char ch = 'A';
    > ```

3. Swap the contents of the integer variables `x` and `y`. (Declare additional variables, if necessary)

    > ```java
    > int tmp = 0;
    > tmp = x;
    > x = y;
    > y = tmp;
    > ```

4. Write a `for` statement that use a counter named `iCount` has an initial value of 20.0, a final value of 10.0, and decrement of 0.5.

    > ```java
    > for(double iCount = 20.0; iCount >= 10.0; iCount -= 0.5)
    > ```

Write `Java` assignment statements for the following algebraic equations:

1. D = √((a - b)² + (c - d)²)

    > `D = Math.sqrt(Math.pow((a - b), 2) + Math.pow((c - d), 2));`

2. Print 3(y/2)

    > `System.out.println(3 * (y / 2));`
    
# **Question 04**

Explain the difference between the two `Java` expressions below.

> | Expression | Explanation |
> | :---: | --- |
> | `X = 2` | The variable `X` is assigned a value 2 to it. |
> | `X == 2` | The variable `X` is compared to the value 2. |

Give two (2) characteristics of valid identifier.

> 1. First character must be a letter or underscore or dollar sign only.
> 2. `Java` reserved words cnanot be used as identifier.

List four (4) characteristics of Object Oriented Programming.

> 1. Abstraction
> 2. Polymorphism
> 3. Inheritance
> 4. Encapsulation

Given that: `int n = 9, m = 16, a = 2, c = 7;` Evaluate the following statements.

1. m / n + n % m

    > 10

2. m + Math.sqrt(n * n – a * m) / 2 * a

    > 23.0

Show the value of integer variable `X` after each of the following `Java` statement is executed.

1. `X = 12 + 3 * 5 / 2 / 6;`

    > 13

2. `X = -8 + 7 % 5 – 5 / 4 % 3;`

    > -7

Write the output produced by the following `Java` program segment.

```java
int x = 1;
int y = 2;

if((x == 1) || (y == 2) && (y == 0))
    System.out.print(“Excellent”);
else
    System.out.print(“Worst”);

char A = ’S’;
char B = ’Z’;

if(A > B)
    System.out.print(A);
else
    System.out.print(B);
```

> ```markdown
> Excellent
> Z
> ```

# **Question 05**

List the steps in problem solving.

> 1. Problem Analysis
> 2. Design a Solution
> 3. Implementation
> 4. Testing
> 5. Documentation

Explain step 3.

> Implementation is the step where we translate the designed algorithm into actual code in computer using a programming language such as `Java`.

Step 5 can be done in two (2) ways, what are they?

> * Writing comments in the lines of codes.
> * Create separate `.txt` or `.md` files to explain the program.

Give two (2) techniques that can be used in step 2.

> Pseudocode and Flowchart

Employees at Syarikat ABC Sdn. Bhd. get bonus at the end of the year. There are N number of employees at the company. Bonus is 50% of the salary. Identify the input, process and output.

> **INPUT**
> 
> * `N`
> * `salary`
> 
> **PROCESS**
> 
> * Repeatedly calculate `bonus` based on `salary` for `N` times.
> 
> **OUTPUT**
> 
> * `salary`

Puan Rose is planning to prepare a healthy breakfast for her family. Calculate the total price based on the price and quantity of an item that she wants to buy. For items with the item code of 5000 and above, 6% of Good and Service Tax (GST) will be imposed. Identify the input, process and output.

> **INPUT**
> 
> * `itemPrice`
> * `itemQuantity`
> * `itemCode`
> 
> **PROCESS**
> 
> * Determine `tax` based on `itemCode`
> * Calculate `priceTotal` based on `itemPrice`, `itemQuantity` and `tax`.
> 
> **OUTPUT**
> 
> * `priceTotal`

# **Question 06**

The registration information for programming seminar is as follows:

| Number of Registrants | Charge per Person (RM) |
| :---: | :---: |
| 1 - 3 | 150 |
| 4 - 9 | 100 |
| 10 or more | 80 |

The price per person depends on the number of registrant(s) that a company registers. (For example, if a company registers four people, the amount that should be paid by a company is RM400). This program reads company’s name and number of registrant(s). Then, it should output the company’s name, number of registrants and the amount charged. Write a pseudocode to answer these question.

> START
> <br>&emsp;INPUT companyName
> <br>&emsp;INPUT registrantCount
> <br>&emsp;IF registrantCount >= 10 THEN
> <br>&emsp;&emsp;payment = registrantCount × 80
> <br>&emsp;ELSE IF registrantCount >= 4 THEN
> <br>&emsp;&emsp;payment = registrantCount × 100
> <br>&emsp;ELSE
> <br>&emsp;&emsp;payment = registrantCount × 150
> <br>&emsp;ENDIF
> <br>&emsp;PRINT companyName, registrantCount, payment
> <br>STOP

Calculate surface area of right cylinder based on formula for 15 times. If the surface area is greater or equal to 1000 display message, “Wow…. So huge”, if the surface area is less than 5 display a message, “Miniature”, else “Just nice”. Draw a flowchart to answer these question. Given that:

&emsp;A = (2 * π * r * h) + (2 * π * r * r), where π = 3.142

> ![2122kmns - Q6](https://github.com/LimJY03/JavaMatriculation/blob/main/Past%20Year%20Theory%20Questions/Resources/Images/2122kmns%20-%20Q6.png?raw=true)

# **Question 07**

What is a method?

> Method is a collection of statement that perform specific tasks.

Explain one (1) advantage of using methods.

> Method allows code reusability, the same sequence of segments can be executed easily without rewriting all again.

Explain one (1) difference between standard library and user-defined methods in `Java` programming.

> Standard Library Methods are built in `Java` methods that are readily available to be used, whereas User-Defined methods are self-written methods by programmer in order to meet certain requirement.

A method `swapNumber()` in the class `Swap` is used to swap the values of two integer variables `a` and `b`. This method receives two integer variables from a main method. Then, these two numbers are exchanged and immediately displayed. In main method, two integer variables `x` and `y` with value of 43 and 57 is initialized. After that, the method `swapNumber()` is called to execute the swapping process of these two numbers. Note that, the both numbers which are before and after swapping processes are displayed in a main method. Write a `Java` program segment to solve the problem. 

> ```java
> public static void main(String[] args){
> 
>     int x = 43, y = 57;
>     Swap obj = new Swap();
> 
>     System.out.println("Before swap: x = " + x + ", y = " + y);
>     obj.swapNumber(x, y);
> }
> 
> void swapNumber(int a, int b){
> 
>     int tmp = a;
>     a = b;
>     b = temp;
> 
>     System.out.println("After swap, x = " + a + ", y = " + b);
> }
> ```

# **Question 08**

Program Z is used to summarize sale of a café owner for a week. By using array, write a `Java` program to calculate and display:

* Total sale
* Average sale
* Number of sale that is above average
* The highest sale
* The lowest sale

Display “TOTAL SALE IS NOT ENOUGH.” if total sale is less than 25000. Else, display “BUSINESS ARE PROFITABLE".

> ```java
> import java.util.Scanner;
> 
> class Q8a{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         double sales[] = new double[7], salesTotal = 0.0, salesAvg = 0.0, salesHighest = 0.0, salesLowest = 99999.9; 
>         int aboveAvg = 0;
> 
>         for(int i = 0; i < sales.length; i++){
> 
>             System.out.print("Enter sales: RM");
>             sales[i] = sc.nextDouble();
> 
>             while(sales[i] < 0){
> 
>                 System.out.println("PLEASE ENTER POSITIVE VALUE");
>                 System.out.print("Enter sales: RM");
>                 sales[i] = sc.nextDouble();
>             }
> 
>             salesTotal += sales[i];
> 
>             if(sales[i] > salesHighest){salesHighest = sales[i];}
>             if(sales[i] < salesLowest){salesLowest = sales[i];}
>         }
> 
>         salesAvg = salesTotal / sales.length;
> 
>         for(int j = 0; j < sales.length; j++){
> 
>             if(sales[j] > salesAvg){aboveAvg++;}
>         }
> 
>         System.out.println("Total sales for a week: RM" + salesTotal);
>         System.out.println("Average sales for a week: RM" + String.format("%.2f", salesAvg));
>         System.out.println("Number of sales above average: " + aboveAvg);
>         System.out.println("The highest sale in a week: RM" + salesHighest);
>         System.out.println("The lowest sale in a week: RM" + salesLowest);
> 
>         if(salesTotal < 25000){
>             System.out.println("TOTAL SALE IS NOT ENOUGH");
>         }
>         else{
>             System.out.println("BUSINESS ARE PROFITABLE");
>         }
> 
>         sc.close();
>     }
> }
> ```

Write a `Java` program to solve the tasks below:

* Ask the user to input a series of number (enter 0 to stop).
* Calculate the sum of all positive numbers.
* Count the number of even numbers.
* Count the numbers that are divisible by 3.

> ```java
> import java.util.Scanner;
> 
> class Q8b{
> 
>     public static void main(String[] args){
> 
>         Scanner sc = new Scanner(System.in);
>         int num = 0, sumPositive = 0, evenCount = 0, divBy3 = 0;
>         
>         System.out.print("Enter a number (0 to stop): ");
>         num = sc.nextInt();
> 
>         while(num != 0){
> 
>             if(num > 0){sumPositive += num;}
>             if(num % 2 == 0){evenCount++;}
>             if(num % 3 == 0){divBy3++;}
> 
>             System.out.print("Enter a number (0 to stop): ");
>             num = sc.nextInt();
>         }
> 
>         System.out.println("The sum of all positive number: " + sumPositive);
>         System.out.println("Total even number: " + evenCount);
>         System.out.println("Total number divisible by 3: " + divBy3);
> 
>         sc.close();
>     }
> }
> ```
